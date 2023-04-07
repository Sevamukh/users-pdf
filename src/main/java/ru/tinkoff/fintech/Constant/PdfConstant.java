package ru.tinkoff.fintech.Constant;

/**
 * Класс с константами, необходимыми для создания PDF файла
 */
public class PdfConstant {

    public final static String fileSavePath = "target/people data.pdf";

    public final static float[] colWidths = {2, 2, 2, 1, 0.5F, 2, 2, 1, 2, 2, 2, 2, 0.5F, 1};
    public final static String nameHeader = "Имя";
    public final static String surnameHeader = "Фамилия";
    public final static String patronymicHeader = "Отчество";
    public final static String ageHeader = "Возраст";
    public final static String sexHeader = "Пол";
    public final static String birthdateHeader = "Дата рождения";
    public final static String birthplaceHeader = "Место рождения";
    public final static String postalCodeHeader = "Индекс";
    public final static String countryHeader = "Страна";
    public final static String regionHeader = "Область";
    public final static String cityHeader = "Город";
    public final static String streetHeader = "Улица";
    public final static String houseHeader = "Дом";
    public final static String flatHeader = "Квартира";
}
