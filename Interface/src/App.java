public class App {
    public static void main(String[] args) throws Exception {
        Animal browny = new Dog();
        Animal hakouka = new Cat();

        browny.eat();
        browny.sleep();
        browny.makeSound();

        hakouka.eat();
        hakouka.sleep();
        hakouka.makeSound();

    }
}
