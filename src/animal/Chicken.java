package animal;

public class Chicken extends Animal implements Edible,abc,xyz {
    @Override
    public String makeSound() {
        return "Con Gà Kêu Cục Tác";
    }

    @Override
    public String howToEat() {
        return "How To Eat (Chicken) : cho Vào Quay...!";
    }

    @Override
    public void abc() {

    }

    @Override
    public int abc(int a) {
        return 0;
    }
}
