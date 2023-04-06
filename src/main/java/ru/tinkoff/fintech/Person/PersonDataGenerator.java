package ru.tinkoff.fintech.Person;

import java.util.List;

import static ru.tinkoff.fintech.Constant.DataGeneratorConstant.*;
import static ru.tinkoff.fintech.Utility.RandomData.*;

public class PersonDataGenerator {
    private final PersonData personData;

    public PersonDataGenerator(PersonData personData) {
        this.personData = personData;
    }

    public String getRandomName() {
        return getRandomString(personData.getNames());
    }
    public String getRandomSurname() {
        return getRandomString(personData.getSurnames());
    }
    public String getRandomPatronymic() {
        return getRandomString(personData.getPatronymics());
    }
    public List<String> getRandomBirthdateAndAge() {
        return getRandomBirthDateAndAge(MIN_AGE, MAX_AGE);
    }
    public String getSex() {
        return personData.getSex();
    }
    public String getRandomBirthPlace() {
        return getRandomString(personData.BIRTH_PLACES);
    }
    public String getRandomPostalCode() {
        return String.valueOf(generateRandomInt(MIN_POSTAL_CODE, MAX_POSTAL_CODE));
    }
    public String getRandomCountry() {
        return getRandomString(personData.COUNTRIES);
    }
    public String getRandomRegion() {
        return getRandomString(personData.REGIONS);
    }
    public String getRandomCity() {
        return getRandomString(personData.CITIES);
    }
    public String getRandomStreet() {
        return getRandomString(personData.STREETS);
    }
    public String getRandomHouse() {
        return String.valueOf(generateRandomInt(MIN_HOUSE_NUM, MAX_HOUSE_NUM));
    }
    public String getRandomFlat() {
        return String.valueOf(generateRandomInt(MIN_FLAT_NUM, MAX_FLAT_NUM));
    }

}
