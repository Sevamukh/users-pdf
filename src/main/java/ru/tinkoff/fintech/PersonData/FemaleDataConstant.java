package ru.tinkoff.fintech.PersonData;

/**
 * Класс для хранения вариантов женских данных
 */
public class FemaleDataConstant extends PersonDataConstant {

    private final String[] NAMES = {"Татьяна", "Вероника",
            "Ирина", "Людмила", "Мария", "Яна"};
    private final String[] SURNAMES = {"Иванова", "Смирнова",
            "Кузнецова", "Бабанова", "Васильева", "Королёва"};
    private final String[] PATRONYMICS = {"Ивановна", "Алексеевна",
            "Михайловна", "Григорьевна", "Павловна", "Геннадиевна"};

    @Override
    public String[] getNames() {
        return NAMES;
    }

    @Override
    public String[] getSurnames() {
        return SURNAMES;
    }

    @Override
    public String[] getPatronymics() {
        return PATRONYMICS;
    }

    @Override
    public String getSex() {
        return "Ж";
    }
}
