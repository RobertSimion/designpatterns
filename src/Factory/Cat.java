package Factory;

public class Cat implements Animal{
    @Override
    public String getAnimal(){
        return "this is a Cat";
    }
    @Override
    public String getSound(){
        return "meow";
    }
}
