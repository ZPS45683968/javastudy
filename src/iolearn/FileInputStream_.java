package iolearn;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ author ps_zhao
 * @ date 2023/3/27 18:10
 * 演示FileInputStream的使用
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String path = "D:\\Javaproject\\javalearn\\src\\iolearn\\test02.txt";
        int read = 0;
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(path);
            while((read = fileInputStream.read()) != -1){
                System.out.print((char) read);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void readFile02(){
        String path = "D:\\Javaproject\\javalearn\\src\\iolearn\\test02.txt";
        int read = 0;
        FileInputStream fileInputStream = null;
        byte[] bytes = new byte[5];                         // 一次读取5个字节
        try {
            fileInputStream = new FileInputStream(path);
            while((read = fileInputStream.read(bytes)) != -1){      // 一次读取5个字节，返回值为实际读取的字节数
                System.out.print(new String(bytes, 0, read));       // 从0开始读取，读取read个字节, 读取的字节转换为字符串
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

