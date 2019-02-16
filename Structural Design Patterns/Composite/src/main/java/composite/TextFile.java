package composite;

public class TextFile extends AbstractFile {

    public TextFile(String name){
        super(name,FileType.file);
    }

    public void descFileContent() {
        System.out.println("文本文件");
    }
}
