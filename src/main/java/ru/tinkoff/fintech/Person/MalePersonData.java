package ru.tinkoff.fintech.Person;

import java.util.Arrays;
import java.util.List;

public class MalePersonData extends PersonData {

    private final List<String> NAMES = Arrays.asList("Иван", "Алексей",
            "Михаил", "Дмитрий", "Павел", "Всеволод");
    private final List<String> SURNAMES = Arrays.asList("Иванов", "Смирнов",
            "Кузнецов", "Попов", "Васильев", "Соколов");
    private final List<String> PATRONYMICS = Arrays.asList("Иванович", "Алексеевич",
            "Михайлович", "Дмитриевич", "Павлович", "Антонович");

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
        return "М";
    }
}
