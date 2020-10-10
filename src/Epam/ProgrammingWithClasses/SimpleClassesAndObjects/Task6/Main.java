package SimpleClassesAndObjects.Task6;

/*Составьте описание класса для представления времени. Предусмотрте возможности установки времени
 и изменения его отдельных полей (час, минута, секунда)с проверкой допустимости вводимых значений.
 В случае недопустимых значений полей поле устанавливается в значение 0.
 Создать методы изменения временина заданное количество часов, минут и секунд.
 */

public class Main {
    public static void main(String args[]){
        Time time=new Time(24,46,12);
        System.out.println(time.toString());
        time.setMinute(67);
        System.out.println(time.toString());
        time.timeIncrease(45,56,1);
        System.out.println(time.toString());
        time.timeDecrease(1,2,15);
        System.out.println(time.toString());
    }
}
