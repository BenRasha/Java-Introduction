package Epam.BasicsOfSoftwareCodeDevelopment.Linear;

/*Дано действительное число Rвида nnn.ddd(три цифровых разряда в дробной и целой частях).
 Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

class LinearProgram4 {
    static public void main(String[] args) {
        double number=222.333;
        String numberToString =Double.toString(number);
        String []arr=numberToString.split("\\.");
        String NewArr=arr[1]+"."+arr[0];
        System.out.println(NewArr);
    }
}





