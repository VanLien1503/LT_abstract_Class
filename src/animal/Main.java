package animal;

import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class Main {
    public static void main(String[] args) {
//        Animal tiger1=new Tiger();
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                //ef kiểu dữ liệu tường minh
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruit=new Fruit[2];
        fruit[0]=new Orange();
        fruit[1]= new Apple();
        for (Fruit f:fruit) {
            System.out.println(f.howToEat());
        }
    }
}
