# HOHTOH_TestCase
## Тестовое задание для НОНТОН. ТЗ.
Задание необходимо выполнить на любом C-подобном языке в задаче нельзя использовать базы данных или любые другие бибилиотеки. В целом вы не ограничены в реализации, только использовать стандартные структуры данных sdk.

Необходимо реализовать все 4 функции в классе ProductsImpl. Реализоцию писать в теле самих функций. Вы в праве добавлять необходимые вам структуры данных в класс.

// структура Product, id - уникальный номер продукта, name - наименование
```
class Product {
  late String id;
  late String name;
}
```

//класс для реализации 4 функций
```
class ProductsImpl {

//Добавляет новый продукт. Возвращает true - если продукта с таким id еще не было.
//Возвращает false - если был такой id, вставка отменяется.
  bool addProduct(Product product) {
    //реализация
   }
   
//Удаляет продукт. Возвращает true - если продукт с таким id был.
//Возвроащает false - если id не было, (удаления не происходит).
  bool deleteProduct(Product product) {
    // реализация
  }
  
//Получает имя (name) продукта. Возращает name продукта у которого идентификатор равен (=) id.
//Если продукта нет, вернуть пустую строку "".
  String getName(String id) {
    // реализация
  }
  
//Возвращает массив (список) идентификаторов (id), у котрых наименование равно (=) name.
//Если таких нет, возвращается пустой массив (список).
  List findByName(String name) {
    //реализация
  }
}
```

// данный пример показан на языке dart
// Если вы будуте реализовывать на других языка - вы в праве поменять типы на аналогичные в вашей sdk
// Но только на аналогичные


## Примечание относительно ТЗ:
Вероятно, пункт хранит в себе недоработку.
//Удаляет продукт. Возвращает true - если продукт с таким id был.
Сверка происходит по ID. Но это не значит, что в метод будет передан объект, идентичный тому, что лежит в коллекции.
Показываю этот момент в классе Main. java

* Создаем продукт со значениями id=1, name = Sofa и кладём его в коллекцию.
```
5        Product product1 = new Product(1, "Sofa");
```
* В метод передаем новый объект id=1, name = Closet, не находящийся в нашем списке. Поскольку проверка происходит по ID, но нет проверки на идентичность объектов, объект id=1, name = Sofa будет удалён из коллекции.
```
20        System.out.println(productsImpl.deleteProduct(new Product(1, "Closet")));
```

