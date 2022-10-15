package GreenGrocer;

public class main {
    public static void main(String[] args) {

        manager manager = new manager();

        apple apple = new apple();
        pear pear = new pear();
        cherry cherry = new cherry();

        manager.add(apple, 10);
        manager.add(cherry, 20);
        manager.add(pear, 30);
    }
}
