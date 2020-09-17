package BasicsOfOOP.Task1;

public class TextFile extends File {
    private String text;
    TextFile(Directory directory,String filename){
        super(directory,filename);
        super.getDirectory().addFile(this);
    }
    TextFile(String fileName){
        super(fileName);
    }
    public void addText(String line){
        text=text+"\n"+line;
    }
    public void printText(){
        System.out.println(text);
    }
}
