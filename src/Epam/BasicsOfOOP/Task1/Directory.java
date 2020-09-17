package BasicsOfOOP.Task1;

import java.util.ArrayList;

public class Directory {
    private String directoryName;
    private ArrayList<File>files;
    Directory(String directoryName){
        this.directoryName=directoryName;
        this.files=new ArrayList<>();
    }
    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }
    public String getDirectoryName() {
        return directoryName;
    }
    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }
    public ArrayList<File> getFiles() {
        return files;
    }
    public void addFile(File file){
        files.add(file);
    }
    public void deleteFile(String fileName){
        for (int i=0;i<files.size();i++){
            if (files.get(i).getFileName().equals(fileName)){
                files.remove(i);
            }
        }
    }
    public void printContent(){
        for(File file:files){
            System.out.println(file);
        }
    }
}
