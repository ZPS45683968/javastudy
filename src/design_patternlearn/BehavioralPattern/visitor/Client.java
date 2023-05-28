package design_patternlearn.BehavioralPattern.visitor;

/**
 * @Author ps_zhao
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.addAnimal(new Dog());
        home.addAnimal(new Cat());

        Owner owner = new Owner();
        home.action(owner);

    }
}
