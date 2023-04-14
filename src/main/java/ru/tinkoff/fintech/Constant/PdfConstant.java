package ru.tinkoff.fintech.Constant;

/**
 * Класс с константами, необходимыми для создания PDF файла
 */
public class PdfConstant {

    public final static String DIR_PATH = System.getProperty("user.dir");
    public final static String FILE_SEPARATOR = System.getProperty("file.separator");
    public final static String FILE_SAVE_PATH = "target" + FILE_SEPARATOR + "people_data.pdf";

    public final static float[] COL_WIDTHS = {2, 2, 2, 1, 0.5F, 2, 2, 1, 2, 2, 2, 2, 0.5F, 1};
    public final static String NAME_HEADER = "Имя";
    public final static String SURNAME_HEADER = "Фамилия";
    public final static String PATRONYMIC_HEADER = "Отчество";
    public final static String AGE_HEADER = "Возраст";
    public final static String SEX_HEADER = "Пол";
    public final static String BIRTHDATE_HEADER = "Дата рождения";
    public final static String BIRTHPLACE_HEADER = "Место рождения";
    public final static String POSTAL_CODE_HEADER = "Индекс";
    public final static String COUNTRY_HEADER = "Страна";
    public final static String REGION_HEADER = "Область";
    public final static String CITY_HEADER = "Город";
    public final static String STREET_HEADER = "Улица";
    public final static String HOUSE_HEADER = "Дом";
    public final static String FLAT_HEADER = "Квартира";
    public final static String[] HEADERS = {
            NAME_HEADER, SURNAME_HEADER, PATRONYMIC_HEADER,
            AGE_HEADER, SEX_HEADER, BIRTHDATE_HEADER, BIRTHPLACE_HEADER,
            POSTAL_CODE_HEADER, COUNTRY_HEADER, REGION_HEADER, CITY_HEADER,
            STREET_HEADER, HOUSE_HEADER, FLAT_HEADER
    };
}
