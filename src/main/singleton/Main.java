package singleton;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Dmytro", "dmytro.hrebeniuk@ucu.edu.ua", 5);
        user.save();
    }
}