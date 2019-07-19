package nullobject;
/**
 *
 * @author david
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Defined Animal Names: Tommy - Lucy");

        Animal dog = AnimalFactory.getAnimal("Tommy");
        Animal cat = AnimalFactory.getAnimal("NULL");

        System.out.println("Animal's Sound: ");
        System.out.println("Tommy: ");
        dog.makeSound();
        System.out.println("NULL");
        cat.makeSound();
    }
}