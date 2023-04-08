package ru.tinkoff.fintech;

import ru.tinkoff.fintech.Person.FemaleData;
import ru.tinkoff.fintech.Person.MaleData;
import ru.tinkoff.fintech.Person.PersonDataGenerator;
import ru.tinkoff.fintech.Utility.PdfCreator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите желаемое количество строк данных таблицы, целое число от 1 до 30: ");
        int peopleNumber = scanner.nextInt();

        PdfCreator pdfCreator = new PdfCreator(peopleNumber,
                new PersonDataGenerator(new MaleData()),
                new PersonDataGenerator(new FemaleData()));
        pdfCreator.createPeoplePdf();

    }
}