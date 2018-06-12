public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());


        Tiger t = new Tiger();
        t.eat();
        t.sleep();
        t.growl();

        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.bark();

        Elephant e = new Elephant();
        e.eat();
        e.sleep();
        e.roar();
    }

    private static void print(String s){
        System.out.println(s);
    }
}
