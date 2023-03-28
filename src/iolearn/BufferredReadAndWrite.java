package iolearn;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @ author ps_zhao
 * @ date 2023/3/28 10:28
 */
public class BufferredReadAndWrite {
    public static void main(String[] args) throws Exception {

    }

    @Test
    public void readfile() throws Exception{
        String filePath = "D:\\Javaproject\\javastudy\\src\\iolearn\\FileCopy.java";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        // read by line
        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }

    @Test
    public void writefile() throws Exception{
        String filePath = "D:\\Javaproject\\javastudy\\src\\iolearn\\test02.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));

        bufferedWriter.write("hello world");
        bufferedWriter.newLine();
        bufferedWriter.write("hello world");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    @Test
    public void copyfile() throws Exception{
        String filePath = "D:\\Javaproject\\javastudy\\src\\iolearn\\FileCopy.java";
        String filePath2 = "D:\\Javaproject\\javastudy\\src\\iolearn\\test03.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2, true));

        // read by line
        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

