package Factory;

public class Dog implements Animal{
    @Override
    public String getAnimal(){
        return "This is a dog";
    }
    @Override
    public String getSound(){
        return "ham ham";
    }
}
