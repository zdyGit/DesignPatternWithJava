package composite;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.File;
import java.util.ArrayList;

public class FolderFile extends AbstractFile {

    public ArrayList<AbstractFile> childFileList ;

    public FolderFile(String name){
        super(name,FileType.folder);

        childFileList = new ArrayList<AbstractFile>();
    }

    @Override
    public void addChildFile(AbstractFile file){
        boolean isExists = false;
        for(AbstractFile childFile:childFileList){
            if(childFile.fileName == file.fileName && childFile.fileType == file.fileType){
                isExists = true;
                break;
            }
        }
        if(isExists){
            return;
        }
        else{
            this.childFileList.add(file);
        }
    }

    @Override
    public void delChildFile(AbstractFile file){
        for(AbstractFile childFile:childFileList){
            if(childFile.fileName == file.fileName && childFile.fileType == file.fileType){
                this.childFileList.remove(file);
            }
        }
    }

    public void descFileContent() {
        for(AbstractFile file:this.childFileList){
                file.descFileContent();
        }
    }
}
