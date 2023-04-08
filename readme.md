# users-pdf
Консольное приложение на **Java**, которое на выходе создает PDF файл с таблицей с данными случайных людей.

## Генерируемые данные
Персональные данные — имя, фамилия и отчество, соответствующие полу, возраст, пол (М или Ж), 
дата рождения в формате "ДД-ММ-ГГГГ", соответсвующая возрасту, и место рождения (город);

Место проживания — шестизначный почтовый индекс, страна, область, город, улица, дом, квартира.

Количество людей, для которых генерируются данные, ограничено условием (`1 <= n <= 30`). 

При создании нового файла, старый будет перезаписан.
