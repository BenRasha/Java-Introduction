package ProgrammingWithClasses.SimpleClassesAndObjects.Task4;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены
по времени отправления.
 */

public class Main {
    public static void main(String args[])
    {
        Train[]trains=new Train[]{
                new Train("Amsterdam",1310,"21:10"),
                new Train("Berlin",5346,"15:30"),
                new Train("Moscow",2510,"13:00"),
                new Train("New York",2434,"22:00"),
                new Train("Moscow",5656,"23:00"),
        };
        System.out.println("------------INFO-------------");
        Train.neededTrainOutput(trains,2510);
        System.out.println("----------------Trains sorted by their number---------------");
        Train.trainNumberSort(trains);
        Train.trainOutput(trains);
        System.out.println("-----------------Trains sorted by their destination name--------");
        Train.trainDestinationNameSort(trains);
        Train.trainOutput(trains);
    }
}
