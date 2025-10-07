package pattern.creational.Singleton;


class SingletonLazyLoading {
    private static SingletonLazyLoading singleton;

    private SingletonLazyLoading() {
    }

    public static SingletonLazyLoading getInstance() {
        if (singleton == null) {
            singleton = new SingletonLazyLoading();
        }
        return singleton;
    }
}


class SingletonEagerLoading {
    private static final SingletonEagerLoading singleton = new SingletonEagerLoading();

    private SingletonEagerLoading() {
    }

    public static SingletonEagerLoading getInstance() {
        return singleton;
    }
}


public class Singleton {

    public static void main(String[] args) {

    }
}
