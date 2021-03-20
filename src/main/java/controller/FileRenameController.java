package controller;

import cn.hutool.core.io.FileUtil;

import java.io.File;

/**
 * @author ll_52
 */
public class FileRenameController {
    private static FileRenameController instance = null;

    private FileRenameController() {
    }

    public static synchronized FileRenameController getInstance() {
        if (instance == null) {
            instance = new FileRenameController();
        }
        return instance;
    }

    private void fileRename(){
        String path = "D://test//001.txt";
        FileUtil.rename(new File(path),"002",true,true);
    }

    public static void main(String[] args) {
        FileRenameController instance = FileRenameController.getInstance();
        instance.fileRename();
    }
}
