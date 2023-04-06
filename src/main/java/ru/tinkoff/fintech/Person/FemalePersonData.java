package ru.tinkoff.fintech.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Класс для хранения вариантов женских данных
 */
public class FemalePersonData extends PersonData {

    private final List<String> NAMES = Arrays.asList("Татьяна", "Вероника",
            "Ирина", "Людмила", "Мария", "Яна");
    private final List<String> SURNAMES = Arrays.asList("Иванова", "Смирнова",
            "Кузнецова", "Бабанова", "Васильева", "Королёва");
    private final List<String> PATRONYMICS = Arrays.asList("Ивановна", "Алексеевна",
            "Михайловна", "Григорьевна", "Павловна", "Геннадиевна");

    @Override
    public List<String> getNames() {
        return NAMES;
    }

    @Override
    public List<String> getSurnames() {
        return SURNAMES;
    }

    @Override
    public List<String> getPatronymics() {
        return PATRONYMICS;
    }

    @Override
    public String getSex() {
        return "Ж";
    }
}
