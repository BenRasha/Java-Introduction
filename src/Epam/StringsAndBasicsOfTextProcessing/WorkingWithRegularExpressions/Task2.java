package WorkingWithRegularExpressions;

/*Дана строка, содержащая следующий текст(xml-документ).
 Напишите анализатор, позволяющий последовательно возвращать содержимое узлов
 xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
 тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
 нельзя.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    private static String xmlAnalyzer(String file)
    {
        Pattern openTag=Pattern.compile("<\\w.+?>");
        Pattern closedTag=Pattern.compile("</\\w+?>");
        Pattern body=Pattern.compile(">.+?<");
        Pattern emptyBody=Pattern.compile("<\\w.+?/>");
        StringBuilder stringBuilder=new StringBuilder();
        String[]lines=file.split("\\n\\s");
        for (String str:lines){
            Matcher mOpenTag=openTag.matcher(str);
            Matcher mClosedTag=closedTag.matcher(str);
            Matcher mBody=body.matcher(str);
            Matcher mEmptyBody=emptyBody.matcher(str);
            if (mEmptyBody.find()){
                stringBuilder.append(mEmptyBody.group());
                stringBuilder.append("-Tag without a body\n");
            }
            if (mOpenTag.find()){
                stringBuilder.append(mOpenTag.group());
                stringBuilder.append("-Open tag\n");
            }
            if (mBody.find()){
                stringBuilder.append(mBody.group().substring(1,mBody.group().indexOf("<")));
                stringBuilder.append("-Body\n");
            }
            if (mClosedTag.find()){
                stringBuilder.append(mClosedTag.group());
                stringBuilder.append("-Closed tag\n");
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String args[])
    {
        String text="<notes>\n" +
                "    <note id=\"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id=\"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                "</notes>";
        System.out.println(xmlAnalyzer(text));
    }
}
