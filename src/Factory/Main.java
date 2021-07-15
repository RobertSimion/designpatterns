package Factory;


//create objects without exposing the creation logic
public class Main {
    public static void main(String[] args) {
            Animal animal = (Animal) FactoryProvider.getFactory("Animal").create("Dog");
            Animal animal2 = (Animal) FactoryProvider.getFactory("Animal").create("Cat");
            System.out.println(animal.getAnimal() + animal.getSound());
            System.out.println(animal2.getAnimal() + animal2.getSound());
            Color color1 = (Color) FactoryProvider.getFactory("Color").create("Black");
            Color color2 = (Color) FactoryProvider.getFactory("Color").create("White");
            Color badColor = (Color) FactoryProvider.getFactory("Color").create("Red");
            if(badColor == null)throw new ExceptionInInitializerError();



    }

}
