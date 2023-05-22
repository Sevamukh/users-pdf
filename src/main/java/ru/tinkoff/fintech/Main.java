package ru.tinkoff.fintech;

import ru.tinkoff.fintech.PersonData.FemaleDataConstant;
import ru.tinkoff.fintech.PersonData.MaleDataConstant;
import ru.tinkoff.fintech.PersonData.PersonDataGenerator;
import ru.tinkoff.fintech.Utility.PdfCreator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите желаемое количество строк данных таблицы, целое число от 1 до 30: ");

        int peopleNumber = -1;
        boolean isValid = false;
        while (!isValid) {
            String input = scanner.nextLine();
            try {
                peopleNumber = Integer.parseInt(input);
                if (peopleNumber >= 1 && peopleNumber <= 30) {
                    isValid = true;
                } else {
                    System.out.print("Введенное число не находится в диапазоне от 1 до 30. Повторите ввод: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Введенная строка не является целым числом. Повторите ввод: ");
            }
        }

        PdfCreator pdfCreator = new PdfCreator(peopleNumber,
                new PersonDataGenerator(new MaleDataConstant()),
                new PersonDataGenerator(new FemaleDataConstant()));
        pdfCreator.createPeoplePdf();
    }
}