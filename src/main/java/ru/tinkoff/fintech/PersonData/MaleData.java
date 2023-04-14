package ru.tinkoff.fintech.PersonData;

/**
 * Класс для хранения вариантов мужских данных
 */
public class MaleData extends PersonData {

    private final String[] NAMES = {"Иван", "Алексей",
            "Михаил", "Дмитрий", "Павел", "Всеволод"};
    private final String[] SURNAMES = {"Иванов", "Смирнов",
            "Кузнецов", "Попов", "Васильев", "Соколов"};
    private final String[] PATRONYMICS = {"Иванович", "Алексеевич",
            "Михайлович", "Дмитриевич", "Павлович", "Антонович"};

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
        return "М";
    }
}
