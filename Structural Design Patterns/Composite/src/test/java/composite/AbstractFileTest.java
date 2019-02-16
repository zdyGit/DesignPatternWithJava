package composite;

import org.junit.Test;

public class AbstractFileTest {

    @Test
    public void abstractFileTest(){
        AbstractFile file = new FolderFile("Folder1");
        AbstractFile txtfile = new TextFile("text1.txt");
        AbstractFile imageFile = new ImageFile("image.img");

        file.addChildFile(txtfile);
        file.addChildFile(imageFile);
        file.delChildFile(txtfile);
        file.descFileContent();

        txtfile.addChildFile(txtfile);
    }
}
