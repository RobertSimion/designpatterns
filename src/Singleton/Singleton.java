package Singleton;

//double lock checking - thread safe singleton design pattern
public class Singleton
{
    private static Singleton instance;

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            //synchronized block to remove overhead
            synchronized (Singleton.class)
            {
                if(instance==null)
                {
                    // if instance is null, initialize
                    instance = new Singleton();
                }

            }
        }
        return instance;
    }
}