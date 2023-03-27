package iolearn;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @ author ps_zhao
 * @ date 2023/3/27 20:12
 */
public class FileCopy {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try{
            fileInputStream = new FileInputStream("D:\\Javaproject\\javalearn\\src\\iolearn\\test02.txt");
            fileOutputStream = new FileOutputStream("D:\\Javaproject\\javalearn\\src\\iolearn\\test04.txt");
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fileInputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes,0,len);
                // q: 为什么不用fileOutputStream.write(bytes)？
                // a: 因为bytes数组可能不满，所以要指定长度
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if (fileInputStream != null){
                    fileInputStream.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            try{
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

}
