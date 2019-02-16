package composite;

public class ImageFile extends AbstractFile {

    public ImageFile(String name){
        super(name,FileType.file);
    }

    public void descFileContent() {
        System.out.println("图像文件");
    }
}
