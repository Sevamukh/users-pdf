package ru.tinkoff.fintech.PersonData;

import ru.tinkoff.fintech.Utility.RandomData;

import static ru.tinkoff.fintech.Constant.DataGeneratorConstant.*;
import static ru.tinkoff.fintech.Utility.RandomData.*;

/**
 * Класс с методами для получения случайных данных
 */
public class PersonDataGenerator {
    private final PersonDataConstant personDataConstant;

    public PersonDataGenerator(PersonDataConstant personDataConstant) {
        this.personDataConstant = personDataConstant;
    }

    public String getRandomName() {
        return getRandomString(personDataConstant.getNames());
    }
    public String getRandomSurname() {
        return getRandomString(personDataConstant.getSurnames());
    }
    public String getRandomPatronymic() {
        return getRandomString(personDataConstant.getPatronymics());
    }
    public String[] getRandomBirthdateAndAge() {
        return RandomData.getRandomBirthdateAndAge(MIN_AGE, MAX_AGE);
    }
    public String getSex() {
        return personDataConstant.getSex();
    }
    public String getRandomBirthplace() {
        return getRandomString(personDataConstant.BIRTH_PLACES);
    }
    public String getRandomPostalCode() {
        return String.valueOf(generateRandomInt(MIN_POSTAL_CODE, MAX_POSTAL_CODE));
    }
    public String getRandomCountry() {
        return getRandomString(personDataConstant.COUNTRIES);
    }
    public String getRandomRegion() {
        return getRandomString(personDataConstant.REGIONS);
    }
    public String getRandomCity() {
        return getRandomString(personDataConstant.CITIES);
    }
    public String getRandomStreet() {
        return getRandomString(personDataConstant.STREETS);
    }
    public String getRandomHouse() {
        return String.valueOf(generateRandomInt(MIN_HOUSE_NUM, MAX_HOUSE_NUM));
    }
    public String getRandomFlat() {
        return String.valueOf(generateRandomInt(MIN_FLAT_NUM, MAX_FLAT_NUM));
    }

    public PersonData getRandomPersonData() {
        String[] randomBirthdateAndAge = getRandomBirthdateAndAge();
        return new PersonData(
                getRandomName(),
                getRandomSurname(),
                getRandomPatronymic(),
                randomBirthdateAndAge[1],
                getSex(),
                randomBirthdateAndAge[0],
                getRandomBirthplace(),
                getRandomPostalCode(),
                getRandomCountry(),
                getRandomRegion(),
                getRandomCity(),
                getRandomStreet(),
                getRandomHouse(),
                getRandomFlat()
        );
    }
}
