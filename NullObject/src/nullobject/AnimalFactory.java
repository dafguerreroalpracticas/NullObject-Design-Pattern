package nullobject;
/**
 *
 * @author david
 */
public class AnimalFactory {
    public static final String[] names = {"Tommy", "Lucy"};

    public static Animal getAnimal(String name){
        for (String name1 : names) {
            if (name1.equalsIgnoreCase(name)) {
                return new Dog(name);
            }
        }
        return new NullAnimal();
    }
}
