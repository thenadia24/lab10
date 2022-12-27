package adapter.task2;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser("dmytro.hrebeniuk@ucu.edu.ua", "Ukraine", "2022-02-23"));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser("dmytro.hrebeniuk@ucu.edu.ua", Country.Ukraine, LocalDate.now()));
        }
        throw new IllegalArgumentException("No such loginMethod");
    }
}