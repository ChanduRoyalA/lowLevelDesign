package pattern.creational.Singleton;

public class SingletonLazyLoading {
    private static SingletonLazyLoading singleton;

    private SingletonLazyLoading() {
    }

    public static SingletonLazyLoading getInstance() {
        if (singleton == null) {
            singleton = new SingletonLazyLoading();
        }
        return singleton;
    }

    public static void main(String[] args) {

    }
}
