package ru.tinkoff.fintech.Person;

/**
 * Абстрактный класс для хранения общих для двух полов вариантов данных
 */
public abstract class PersonData {
    public final String[] BIRTH_PLACES = {"Москва", "Санкт-Петербург",
            "Новосибирск", "Ногинск", "Самара", "Омск", "Воронеж"};
    public final String[] COUNTRIES = {"Россия", "Беларусь", "Казахстан"};
    public final String[] REGIONS = {"Московская", "Ленинградская", "Новосибирская",
            "Красноярский край"};
    public final String[] CITIES = {"Москва", "Санкт-Петербург",
            "Новосибирск", "Екатеринбург", "Казань"};
    public final String[] STREETS = {"Центральная", "Молодежная",
            "Первая", "Садовая", "Лесная", "Школьный бульвар"};

    public abstract String[] getNames();
    public abstract String[] getSurnames();
    public abstract String[] getPatronymics();
    public abstract String getSex();
}
