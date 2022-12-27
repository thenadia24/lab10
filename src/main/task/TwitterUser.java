package adapter.task2;

import java.time.LocalDate;

public class TwitterClient implements Client{
    private final TwitterUser user;

    public TwitterClient(TwitterUser user){
        this.user=user;
    }


    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(user.getUserActiveTime());
    }
}