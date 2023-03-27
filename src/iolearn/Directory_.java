package iolearn;

import org.junit.Test;

import java.io.File;

/**
 * @ author ps_zhao
 * @ date 2023/3/27 17:05
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    //单级目录或文件删除
    @Test
    public void deleteFile(){
        String path = "D:\\Javaproject\\javalearn\\src\\iolearn\\test01.txt";
        File file = new File(path);
        if (file.exists()){
            if (file.delete()) {
                System.out.println("文件删除成功");
            }else{
                System.out.println("文件删除失败");
            }
        }else{
            System.out.println("文件不存在");
        }
    }

    //创建目录
    @Test
    public void directoryCreate(){
        String path = "D:\\Javaproject\\javalearn\\src\\iolearn\\a";
        File file = new File(path);
        if (file.exists()){
            System.out.println("文件夹已存在");
            //删除多级目录
            if (file.delete()) {
                System.out.println("文件夹删除成功");
            }else{
                System.out.println("文件夹删除失败");
            }
        }else{
            if (file.mkdirs()){
                System.out.println("文件夹创建成功");
            }else{
                System.out.println("文件夹创建失败");
            }
        }
    }

    //删除多级目录
    @Test
    public static void deleteDirs(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File subFile : files) {
                    deleteDirs(subFile);
                }
            }
        }
        file.delete();
    }

}
