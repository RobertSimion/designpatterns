package Factory;

public class AnimalFactory implements AbstractFactory<Animal>{
    @Override
    public Animal create(String animal){
        if(animal.equals(""))return null;
        else if(animal.equalsIgnoreCase("CAT")){
            return new Cat();
        }
        else if(animal.equalsIgnoreCase("DOG")){
            return new Dog();
        }
        else return null;
    };

}
