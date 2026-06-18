package pattern.structural.Proxy.cls;

public class User {
    private String name;
    private boolean isSubscribedUser;

    public User(String name, boolean isSubscribedUser) {
        this.name = name;
        this.isSubscribedUser = isSubscribedUser;
    }

    public String getName() {
        return name;
    }

    public boolean isSubscribedUser() {
        return isSubscribedUser;
    }
}
