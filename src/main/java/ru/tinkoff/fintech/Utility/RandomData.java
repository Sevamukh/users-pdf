package ru.tinkoff.fintech.Utility;

import ru.tinkoff.fintech.Person.PersonDataGenerator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomData {

    public static int generateRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomString(List<String> list) {
        return list.get(generateRandomInt(0, list.size()-1));
    }

    public static Date generateRandomDate(Date startDate, Date endDate) {
        long startMillis = startDate.getTime();
        long endMillis = endDate.getTime();
        long randomMillisSinceEpoch = ThreadLocalRandom.current().nextLong(startMillis, endMillis);
        return new Date(randomMillisSinceEpoch);
    }

    public static List<String> getRandomBirthDateAndAge(int minAge, int maxAge) {
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        calendar.add(Calendar.YEAR, -maxAge);
        Date startDate = calendar.getTime();
        calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -minAge);
        Date endDate = calendar.getTime();

        Date birthDate = generateRandomDate(startDate, endDate);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = dateFormat.format(birthDate);
        String strAge = String.valueOf(ChronoUnit.YEARS.between(birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));
        return List.of(strDate, strAge);
    }

    public static PersonDataGenerator getRandomPersonDataGenerator(PersonDataGenerator malePersonDataGenerator,
                                                                   PersonDataGenerator femalePersonDataGenerator) {
        int sexChoice = generateRandomInt(1, 2);
        PersonDataGenerator personDataGenerator;
        if (sexChoice == 1) {
            personDataGenerator = malePersonDataGenerator;
        } else {
            personDataGenerator = femalePersonDataGenerator;
        }
        return personDataGenerator;
    }

}
