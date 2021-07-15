package Factory;

public interface AbstractFactory<T> {

    public T create(String s) throws ExceptionInInitializerError;
}
