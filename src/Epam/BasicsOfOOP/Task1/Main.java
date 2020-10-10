package BasicsOfOOP.Task1;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {
    public static void main(String argsp[]){
       Directory directory1=new Directory("directory1");
       File textFile1=new TextFile(directory1,"textFile1.txt");
       File textFile2=new TextFile("textFile10.txt");
       directory1.addFile(textFile2);
       textFile2.setFileName("textFile2.txt");
       directory1.deleteFile("textFile1.txt");
       directory1.printContent();
    }
}
