package ru.gb.java_spring3.Services;

import org.springframework.stereotype.Service;
import ru.gb.java_spring3.Domain.User;

@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }

    public void sendNotification(String s) {
        System.out.println(s);
    }
}
