package Factory;

public class ColorFactory implements AbstractFactory<Color>{
    @Override
    public Color create(String color) throws ExceptionInInitializerError{
        if(color.equals(""))return null;
        else if(color.equalsIgnoreCase("WHITE")){
            return new White();
        }
        else if(color.equalsIgnoreCase("BLACK")){
            return new Black();
        }
        else return null;
    }
}
