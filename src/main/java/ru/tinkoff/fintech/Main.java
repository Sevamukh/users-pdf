package ru.tinkoff.fintech;

import ru.tinkoff.fintech.Person.FemalePersonData;
import ru.tinkoff.fintech.Person.MalePersonData;
import ru.tinkoff.fintech.Person.PersonData;
import ru.tinkoff.fintech.Utility.PdfCreator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonData malePersonData = new MalePersonData();
        PersonData femalePersonData = new FemalePersonData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите желаемое количество строк данных таблицы, целое число от 1 до 30: ");
        int peopleNumber = scanner.nextInt();

        PdfCreator pdfCreator = new PdfCreator(peopleNumber, malePersonData, femalePersonData);
        pdfCreator.createPeoplePdf();

    }
}