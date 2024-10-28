public class Dog extends Animal implements Runnable{
    @Override
    public void makeSound(){
        System.out.println("makeSoundDog!");
    }
    @Override
    public void eat(){
        System.out.println("eatDog!");
    }

    @Override
    public void run() {
        System.out.println("runDog");
    }
}
