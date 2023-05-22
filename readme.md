# users-pdf
Консольное приложение на **Java**, которое на выходе создает PDF файл с таблицей с данными случайных людей.

## Генерируемые данные
При каждом запуске будет генерироваться новый уникальный набор данных.

- Персональные данные — имя, фамилия и отчество, соответствующие полу, возраст, пол (М или Ж), 
дата рождения в формате "ДД-ММ-ГГГГ", соответсвующая возрасту, и место рождения (город);

- Место проживания — шестизначный почтовый индекс, страна, область, город, улица, дом, квартира.

Количество людей $n$, для которых генерируются данные, ограничено условием $1 \leqslant n \leqslant 30$. 

При создании нового файла, старый будет перезаписан!

## Необходимое ПО
Для запуска данного проекта понадобится: **Java Development Kit (JDK)** 11 версии или выше и
инструмент для сборки проектов **Maven**.

Для удобства также можно воспользоваться одной из сред разработки, поддерживающих Java, например, IntelliJ IDEA.

Все вышеперечисленное можно легко найти и бесплатно скачать из интернета 😉.