package iolearn;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ author ps_zhao
 * @ date 2023/3/27 18:47
 */
public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile01(){
        String filePath = "D:\\Javaproject\\javalearn\\src\\iolearn\\test02.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath,true);
            fileOutputStream.write('b');
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
