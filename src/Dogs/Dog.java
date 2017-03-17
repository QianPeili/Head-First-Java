package Dogs;


/**
 * Created by qianpeili on 2017/3/13.
 */
public class Dog {
    private int size;
    String name;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            if (size > 60) {
                System.out.println("Woof! Woof!");
            } else if (size > 14) {
                System.out.println("Ruff! Ruff!");
            } else {
                System.out.println("Yip! Yip!");
            }
            numOfBarks = numOfBarks -1;
        }
    }
}
