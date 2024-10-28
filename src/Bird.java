public class Bird extends Animal implements Flyable{
    @Override
    public void makeSound(){
        System.out.println("makeSoundBird!");
    }
    @Override
    public void eat(){
        System.out.println("eatBird!");
    }

    @Override
    public void fly() {
        System.out.println("flyBird");
    }
}
