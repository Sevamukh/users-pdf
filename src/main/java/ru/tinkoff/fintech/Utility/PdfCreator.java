package ru.tinkoff.fintech.Utility;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import ru.tinkoff.fintech.Person.PersonDataGenerator;
import ru.tinkoff.fintech.Person.PersonData;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static ru.tinkoff.fintech.Constant.PdfConstant.*;

/**
 * Класс с методами для генерации PDF с данными людей
 */
public class PdfCreator {
    private final int peopleNumber;
    private final PersonDataGenerator malePersonDataGenerator;
    private final PersonDataGenerator femalePersonDataGenerator;

    public PdfCreator(int peopleNumber, PersonData malePersonData, PersonData femalePersonData) throws IllegalArgumentException {
        if (peopleNumber > 30 || peopleNumber < 1) {
            throw new IllegalArgumentException("Количество строк данных людей выходит за допустимый диапазон");
        }
        this.peopleNumber = peopleNumber;
        this.malePersonDataGenerator = new PersonDataGenerator(malePersonData);
        this.femalePersonDataGenerator = new PersonDataGenerator(femalePersonData);
    }

    private PersonDataGenerator getRandomPersonDataGenerator() {
        return RandomData.getRandomPersonDataGenerator(malePersonDataGenerator, femalePersonDataGenerator);
    }

    /**
     * Метод, создающий новую таблицу с заголовками
     */
    private PdfPTable createEmptyPeopleTable() {
        PdfPTable table = new PdfPTable(colWidths);
        table.setWidthPercentage(100);
        table.addCell(nameHeader);
        table.addCell(surnameHeader);
        table.addCell(patronymicHeader);
        table.addCell(ageHeader);
        table.addCell(sexHeader);
        table.addCell(birthdateHeader);
        table.addCell(birthplaceHeader);
        table.addCell(postalCodeHeader);
        table.addCell(countryHeader);
        table.addCell(regionHeader);
        table.addCell(cityHeader);
        table.addCell(streetHeader);
        table.addCell(houseHeader);
        table.addCell(flatHeader);
        return table;
    }

    /**
     * Метод, добавляющий в таблицу новую строку со случайными данными
     */
    private void fillPersonRow(PdfPTable table) {
        PersonDataGenerator personDataGenerator = getRandomPersonDataGenerator();
        String[] birthdateAndAge = personDataGenerator.getRandomBirthdateAndAge();
        table.addCell(personDataGenerator.getRandomName());
        table.addCell(personDataGenerator.getRandomSurname());
        table.addCell(personDataGenerator.getRandomPatronymic());
        table.addCell(birthdateAndAge[1]);
        table.addCell(personDataGenerator.getSex());
        table.addCell(birthdateAndAge[0]);
        table.addCell(personDataGenerator.getRandomBirthPlace());
        table.addCell(personDataGenerator.getRandomPostalCode());
        table.addCell(personDataGenerator.getRandomCountry());
        table.addCell(personDataGenerator.getRandomRegion());
        table.addCell(personDataGenerator.getRandomCity());
        table.addCell(personDataGenerator.getRandomStreet());
        table.addCell(personDataGenerator.getRandomHouse());
        table.addCell(personDataGenerator.getRandomFlat());
    }

    /**
     * Основной метод, создающий PDF файл
     */
    public void createPeoplePdf(){
        Document document = new Document();
        document.setPageSize(PageSize.A2.rotate());
        try {
            PdfWriter.getInstance(document, new FileOutputStream(fileSavePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        document.open();
        PdfPTable table = createEmptyPeopleTable();
        for (int rowIndex = 0; rowIndex < peopleNumber; rowIndex++) {
            fillPersonRow(table);
        }
        document.add(table);
        document.close();
        System.out.println("Файл создан. Путь: " + System.getProperty("user.dir") + "\\" +
                fileSavePath.replace('/', '\\'));
    }
}
