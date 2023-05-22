package ru.tinkoff.fintech.Utility;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import ru.tinkoff.fintech.PersonData.PersonData;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static ru.tinkoff.fintech.Constant.PdfConstant.*;

/**
 * Класс с методами для генерации PDF с данными людей
 */
public class PdfCreator {
    private final int peopleNumber;
    private final PersonData[] personDataList;

    public PdfCreator(int peopleNumber, PersonData[] personDataList) {
        this.peopleNumber = peopleNumber;
        this.personDataList = personDataList;
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
     * Метод, добавляющий в таблицу новую строку с данными
     */
    private void fillPersonRow(PdfPTable table, PersonData personData) {
        table.addCell(personData.getName());
        table.addCell(personData.getSurname());
        table.addCell(personData.getPatronymic());
        table.addCell(personData.getAge());
        table.addCell(personData.getSex());
        table.addCell(personData.getBirthdate());
        table.addCell(personData.getBirthplace());
        table.addCell(personData.getPostalCode());
        table.addCell(personData.getCountry());
        table.addCell(personData.getRegion());
        table.addCell(personData.getCity());
        table.addCell(personData.getStreet());
        table.addCell(personData.getHouse());
        table.addCell(personData.getFlat());
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
        for (int rowIndex = 0; rowIndex < peopleNumber; rowIndex++) {
            fillPersonRow(table, personDataList[rowIndex]);
        }
        document.add(table);
        document.close();
        System.out.println("Файл создан. Путь: " + DIR_PATH + FILE_SEPARATOR + FILE_SAVE_PATH);
    }
}
