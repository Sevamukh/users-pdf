package ru.tinkoff.fintech.PersonData;

public class PersonData {
    private final String name;
    private final String surname;
    private final String patronymic;
    private final String age;
    private final String sex;
    private final String birthdate;
    private final String birthplace;
    private final String postalCode;
    private final String country;
    private final String region;
    private final String city;
    private final String street;
    private final String house;
    private final String flat;

    public PersonData(String name, String surname, String patronymic,
                      String age, String sex, String birthdate, String birthplace,
                      String postalCode, String country, String region,
                      String city, String street, String house, String flat) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.sex = sex;
        this.birthdate = birthdate;
        this.birthplace = birthplace;
        this.postalCode = postalCode;
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getFlat() {
        return flat;
    }
}
