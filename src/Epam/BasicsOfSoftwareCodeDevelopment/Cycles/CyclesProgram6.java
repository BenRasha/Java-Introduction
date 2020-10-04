package Epam.BasicsOfSoftwareCodeDevelopment.Cycles;

/*Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.*/

public class CyclesProgram6 {
    public static void main(String[] args) {
        for (int i = 0; i < 64; i++) {

            char c = (char) ('А' + i);

            System.out.println(c + " - " + (int) c);
        }
    }
}
