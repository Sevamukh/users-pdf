package ru.tinkoff.fintech.Utility;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import ru.tinkoff.fintech.Person.PersonDataGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static ru.tinkoff.fintech.Constant.PdfConstant.*;

/**
 * Класс с методами для генерации PDF с данными людей
 */
public class PdfCreator {
    private final int peopleNumber;
    private final PersonDataGenerator maleDataGenerator;
    private final PersonDataGenerator femaleDataGenerator;

    public PdfCreator(int peopleNumber, PersonDataGenerator maleDataGenerator, PersonDataGenerator femaleDataGenerator) throws IllegalArgumentException {
        if (peopleNumber > 30 || peopleNumber < 1) {
            throw new IllegalArgumentException("Количество строк данных людей выходит за допустимый диапазон");
        }
        this.peopleNumber = peopleNumber;
        this.maleDataGenerator = maleDataGenerator;
        this.femaleDataGenerator = femaleDataGenerator;
    }

    private PersonDataGenerator getRandomPersonDataGenerator() {
        return RandomData.getRandomPersonDataGenerator(maleDataGenerator, femaleDataGenerator);
    }

    /**
     * Метод, создающий новую таблицу с заголовками
     */
    private PdfPTable createEmptyPeopleTable() {
        PdfPTable table = new PdfPTable(COL_WIDTHS);
        table.setWidthPercentage(100);
        for (String header: HEADERS) table.addCell(header);
        return table;
    }

    /**
     * Метод, добавляющий в таблицу новую строку со случайными данными
     */
    private void fillPersonRow(PdfPTable table) {
        PersonDataGenerator personDataGenerator = getRandomPersonDataGenerator();
        table.addCell(personDataGenerator.getRandomName());
        table.addCell(personDataGenerator.getRandomSurname());
        table.addCell(personDataGenerator.getRandomPatronymic());
        String[] birthdateAndAge = personDataGenerator.getRandomBirthdateAndAge();
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
            PdfWriter.getInstance(document, new FileOutputStream(FILE_SAVE_PATH));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        document.open();
        PdfPTable table = createEmptyPeopleTable();
        for (int rowIndex = 0; rowIndex < peopleNumber; rowIndex++) fillPersonRow(table);
        document.add(table);
        document.close();
        System.out.println("Файл создан. Путь: " + DIR_PATH + FILE_SEPARATOR + FILE_SAVE_PATH);
    }
}
