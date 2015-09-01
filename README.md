####Концерты танцевального коллектива.
-----------------------------------


#####Танцевальный номер, представленный на концерте, имеют следующие характеристики:


 -	Type – направление танца (бальный, народный, эстрадный, восточный и т.д.). 
 -	Scene – место выступления (актовый зал, уличная площадка, телестудия и т.д.). 
 -	Number of dancers – массовый, сольный, парный. 
 -	Music – вид музыкального сопровождения (фонограмма, “живая” музыка).  
 -	Dancers (должно быть несколько) – имя или название коллектива, возраст, сколько лет занимается и т.д.
 -	Number – каким номером в программе. 
 Корневой элемент назвать Dance.

####Общие требования
--------------------


  1.	Создать файл XML и соответствующую ему схему XSD. 
  2.	При разработке XSD использовать простые и комплексные типы, перечисления, шаблоны и предельные значения, обязательно использование атрибутов и типа ID.
  3.	Сгенерировать (создать) Java-класс, соответствующий данному описанию. 
  4.	Создать Java-приложение для разбора XML-документа и инициализации коллекции объектов информацией из XML-файла. Для разбора использовать SAX, DOM и StAX парсеры. JAXB. Для сортировки объектов использовать интерфейс Comparator.
  5.	Произвести проверку XML-документа с привлечением XSD. 
  6.	Определить метод, производящий преобразование разработанного XML-документа в документ, указанный в каждом задании.

