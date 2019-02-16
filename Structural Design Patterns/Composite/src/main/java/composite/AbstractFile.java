package composite;



public abstract class AbstractFile {

    public String fileName;

    public FileType fileType;

    public AbstractFile(String name,FileType fileType){
        this.fileName = name;
        this.fileType = fileType;
    }

    public void addChildFile(AbstractFile file){
        System.out.println("暂不支持添加文件");
    }

    public void delChildFile(AbstractFile file){
        System.out.println("暂不支持移除文件");
    }

    public abstract void descFileContent();
}
