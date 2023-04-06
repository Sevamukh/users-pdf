package ru.tinkoff.fintech.Person;

import java.util.Arrays;
import java.util.List;

public abstract class PersonData {
    public final List<String> BIRTH_PLACES = Arrays.asList("Москва", "Санкт-Петербург",
            "Новосибирск", "Черноголовка", "Самара");
    public final List<String> COUNTRIES = Arrays.asList("Россия", "Беларусь", "Казахстан");
    public final List<String> REGIONS = Arrays.asList("Московская", "Ленинградская", "Новосибирская");
    public final List<String> CITIES = Arrays.asList("Москва", "Санкт-Петербург",
            "Новосибирск", "Екатеринбург", "Казань");
    public final List<String> STREETS = Arrays.asList("Центральная", "Молодежная",
            "Первая", "Садовая", "Лесная");

    public abstract List<String> getNames();
    public abstract List<String> getSurnames();
    public abstract List<String> getPatronymics();
    public abstract String getSex();
}
