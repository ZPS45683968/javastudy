package iolearn;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @ author ps_zhao
 * @ date 2023/3/27 16:41
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    //the first way to create a file
    @Test
    public void createfile01(){
        String filepath = "D:\\Javaproject\\javalearn\\src\\iolearn\\test01.txt";
        File file = new File(filepath);
        try {
            file.createNewFile();
            System.out.println("create file success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //the second way to create a file
    @Test
    public void createfile02(){
        File filepath = new File("D:\\Javaproject\\javalearn\\src\\iolearn\\");     //filepath is a directory
        String filename = "test02.txt";
        File file = new File(filepath, filename);
        try {
            file.createNewFile();
            System.out.println("create file success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //the third way to create a file
    @Test
    public void createfile03(){
        String filepath = "D:\\Javaproject\\javalearn\\src\\iolearn\\";         //filepath is a string
        String filename = "test03.txt";
        File file = new File(filepath, filename);
        try {
            file.createNewFile();
            System.out.println("create file success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
