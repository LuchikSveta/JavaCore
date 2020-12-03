package JavaCore_13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() { return username; }
    public List<User> getSubscriptions() { return subscriptions; }

    public void subscribe(User user) {
        this.getSubscriptions().add(user);
    }

    public boolean isSubscribed(User user) {
        return getSubscriptions().contains(user);
    }

    public boolean isFriend(User user) {
        return (this.getSubscriptions().contains(user) && user.getSubscriptions().contains(this));
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addMessage(this, user, text);
    }

    public String toString() {
        return getUsername();
    }
}
