package ru.tinkoff.fintech.PersonData;

import ru.tinkoff.fintech.Utility.RandomData;

public class PersonDataListGenerator {
    private final int peopleNumber;
    private final PersonDataGenerator maleDataGenerator;
    private final PersonDataGenerator femaleDataGenerator;

    public PersonDataListGenerator(int peopleNumber, PersonDataGenerator maleDataGenerator, PersonDataGenerator femaleDataGenerator) {
        this.peopleNumber = peopleNumber;
        this.maleDataGenerator = maleDataGenerator;
        this.femaleDataGenerator = femaleDataGenerator;
    }

    private PersonDataGenerator getRandomPersonDataGenerator() {
        return RandomData.getRandomPersonDataGenerator(maleDataGenerator, femaleDataGenerator);
    }

    public PersonData[] createPersonDataList() {
        PersonData[] personDataList = new PersonData[peopleNumber];
        for (int personIndex = 0; personIndex < peopleNumber; personIndex++) {
            PersonDataGenerator personDataGenerator = getRandomPersonDataGenerator();
            personDataList[personIndex] = personDataGenerator.getRandomPersonData();
        }
        return personDataList;
    }
}
