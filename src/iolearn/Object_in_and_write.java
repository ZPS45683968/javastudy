package iolearn;

import org.junit.Test;

import java.io.*;

/**
 * @ author ps_zhao
 * @ date 2023/3/28 10:46
 */
public class Object_in_and_write {
    public static void main(String[] args) throws Exception{
    }
    @Test
    public void saveObject() throws Exception{
        Dog dog = new Dog("旺财", 3);
        FileOutputStream fos = new FileOutputStream("D:\\Javaproject\\javastudy\\src\\iolearn\\test05.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog);
        oos.close();
    }

    @Test
    public void readObject() throws Exception{
        String path = "D:\\Javaproject\\javastudy\\src\\iolearn\\test05.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Dog dog = (Dog) ois.readObject();
        System.out.println(dog);
        ois.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Dog [name=" + name + ", age=" + age + "]";
    }
}