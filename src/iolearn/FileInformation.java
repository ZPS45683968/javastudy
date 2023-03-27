package iolearn;

import org.junit.Test;

import java.io.File;

/**
 * @ author ps_zhao
 * @ date 2023/3/27 16:58
 */
public class FileInformation {
    public static void main(String[] args) {

    }

    // get file information
    @Test
    public void infor(){
        File file = new File("D:\\Javaproject\\javalearn\\src\\iolearn\\FileCreate.java");
        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("File absolute path: " + file.getAbsolutePath());
        System.out.println("File parent: " + file.getParent());
        System.out.println("File length: " + file.length());
        System.out.println("File last modified: " + file.lastModified());
        System.out.println("File exists: " + file.exists());
        System.out.println("File is directory: " + file.isDirectory());
        System.out.println("File is file: " + file.isFile());
        System.out.println("File is hidden: " + file.isHidden());
        System.out.println("File can read: " + file.canRead());
        System.out.println("File can write: " + file.canWrite());
        System.out.println("File can execute: " + file.canExecute());
        System.out.println("File total space: " + file.getTotalSpace());
        System.out.println("File free space: " + file.getFreeSpace());
        System.out.println("File usable space: " + file.getUsableSpace());
    }
}
