package animal;

public class Chicken extends  Animal implements  Edible{
    @Override
    public String makeSound() {
        return ("Chicken : oe oe oe");
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }

}
