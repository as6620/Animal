public class Cat extends Animal implements Runnable{
    @Override
    public void makeSound(){
        System.out.println("makeSoundCat!");
    }
    @Override
    public void eat(){
        System.out.println("eatCat!");
    }

    @Override
    public void run() {
        System.out.println("runCat");
    }
}
