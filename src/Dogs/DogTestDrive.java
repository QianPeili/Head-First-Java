package Dogs;

/**
 * Created by qianpeili on 2017/3/17.
 */
public class DogTestDrive {
    public static void main (String[] args) {
        Dog one = new Dog();
        one.setSize(70);
        Dog two = new Dog();
        two.setSize(8);
        Dog three = new Dog();
        three.setSize(35);

        one.bark(1);
        two.bark(2);
        three.bark(3);
    }
}
