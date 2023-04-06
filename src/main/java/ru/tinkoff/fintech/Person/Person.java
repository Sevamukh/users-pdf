package ru.tinkoff.fintech.Person;

public class Person {
    private String name;
    private String surname;
    private String patronymic;
    private String age;
    private String sex;
    private String birthdate;
    private String birthplace;
    private String postalCode;
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String flat;

    public Person(String name, String surname, String patronymic, String age, String sex,
                  String birthdate, String birthplace,
                  String postalCode, String country, String region, String city, String street, String house, String flat) {
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
}
