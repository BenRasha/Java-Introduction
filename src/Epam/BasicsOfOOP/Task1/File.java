package BasicsOfOOP.Task1;

public class File {
    private Directory directory;
    private String fileName;
    File(Directory directory,String fileName){
        this.directory=directory;
        this.fileName=fileName;
    }
    File(String fileName){
        this.fileName=fileName;
    }
    public void setDirectory(Directory directory) {
        this.directory = directory;
    }
    public Directory getDirectory() {
        return directory;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getFileName() {
        return fileName;
    }

    @Override
    public String toString() {
        return "File{" +
                "directory=" + directory +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
