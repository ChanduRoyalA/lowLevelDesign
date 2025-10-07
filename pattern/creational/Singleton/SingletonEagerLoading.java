package pattern.creational.Singleton;

public class SingletonEagerLoading {
    private static final SingletonEagerLoading singleton = new SingletonEagerLoading();

    private SingletonEagerLoading() {
    }

    public static SingletonEagerLoading getInstance() {
        return singleton;
    }
}