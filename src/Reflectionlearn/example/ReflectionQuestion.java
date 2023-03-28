package Reflectionlearn.example;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @ author ps_zhao
 * @ date 2023/3/28 21:25
 */
@SuppressWarnings("all")
public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\Reflectionlearn\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println(classfullpath);
        System.out.println(method);

        // 通过反射创建对象
        Class<?> aClass = Class.forName(classfullpath);
        Object o = aClass.newInstance();
        // 通过反射调用方法
        Method hi = aClass.getMethod(method);
        hi.invoke(o);
    }
}
