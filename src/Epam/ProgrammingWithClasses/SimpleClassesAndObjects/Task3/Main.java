package ProgrammingWithClasses.SimpleClassesAndObjects.Task3;

/*Создайте классс именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов,
  имеющих оценки, равные только 9 или 10.
 */

public class Main {
    public static void main(String args[])
    {
        Student[]students=new Student[]{
                new Student("Ogr A.A", 123456, new int[]{6, 10, 4, 5, 10}),
                new Student("Ivanov A.A",234234,new int[]{10,9,9,10,10}),
                new Student("Ogurcov A.B.",111111,new int[]{8,8,8,8,9}),
                new Student("Petuhov A.H.",234234,new int[]{10,10,10,9,9}),
                new Student("Fingerchik H.O.",567567,new int[]{10,9,10,9,10}),
                new Student("Olegov P.O.",123123,new int[]{8,9,5,6,7,}),
                new Student("Lohov A.G",345345,new int[]{7,6,7,8,9}),
                new Student("Krutoy T.Y",345678,new int[]{10,10,9,9,5}),
                new Student("Plohoy. H.J",123456,new int[]{2,2,2,2,2,}),
                new Student("Nosz A.R",813310,new int[]{8,9,9,10,10})
        };
        Student.goodStudent(students);
    }
}
