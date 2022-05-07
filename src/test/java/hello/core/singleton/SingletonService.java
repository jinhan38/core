package hello.core.singleton;

public class SingletonService {

    private static final SingletonService singleton = new SingletonService();


    public static SingletonService getInstance() {
        return singleton;
    }

    private SingletonService() {
    }
}
