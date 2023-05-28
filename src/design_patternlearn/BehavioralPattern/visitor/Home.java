package design_patternlearn.BehavioralPattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ps_zhao
 * @Description
 */
public class Home {

    // 声明一个集合对象，用于存储元素对象
    private List<Animal> animals = new ArrayList<>();

    // 添加元素对象
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void action(Person person) {
        for (Animal animal : animals) {
            animal.accept(person);
        }
    }
}
