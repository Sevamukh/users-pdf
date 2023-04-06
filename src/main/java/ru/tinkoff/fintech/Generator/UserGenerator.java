package ru.tinkoff.fintech.Generator;

import ru.tinkoff.fintech.Person.Person;
import ru.tinkoff.fintech.Person.PersonDataGenerator;

import java.util.List;

import static ru.tinkoff.fintech.Utility.RandomData.generateRandomInt;

public class UserGenerator {
    private final PersonDataGenerator malePersonDataGenerator;
    private final PersonDataGenerator femalePersonDataGenerator;

    public UserGenerator(PersonDataGenerator malePersonDataGenerator, PersonDataGenerator femalePersonDataGenerator) {
        this.malePersonDataGenerator = malePersonDataGenerator;
        this.femalePersonDataGenerator = femalePersonDataGenerator;
    }

    public Person createRandomUserFromData(PersonDataGenerator personDataGenerator) {
        List<String> birthdateAndAge = personDataGenerator.getRandomBirthdateAndAge();
        return new Person(
                personDataGenerator.getRandomName(),
                personDataGenerator.getRandomSurname(),
                personDataGenerator.getRandomPatronymic(),
                birthdateAndAge.get(1),
                personDataGenerator.getSex(),
                birthdateAndAge.get(0),
                personDataGenerator.getRandomBirthPlace(),
                personDataGenerator.getRandomPostalCode(),
                personDataGenerator.getRandomCountry(),
                personDataGenerator.getRandomRegion(),
                personDataGenerator.getRandomCity(),
                personDataGenerator.getRandomStreet(),
                personDataGenerator.getRandomHouse(),
                personDataGenerator.getRandomFlat()
        );
    }

    public Person createRandomUser() {
        int sexChoice = generateRandomInt(1, 2);
        PersonDataGenerator personDataGenerator;
        if (sexChoice == 1) {
            personDataGenerator = malePersonDataGenerator;
        } else {
            personDataGenerator = femalePersonDataGenerator;
        }
        return createRandomUserFromData(personDataGenerator);
    }

}
