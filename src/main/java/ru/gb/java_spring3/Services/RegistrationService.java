package ru.gb.java_spring3.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.java_spring3.Domain.User;

@Service
public class RegistrationService {

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    @Autowired
    private DataProcessingService dataProcessingService;
    @Autowired
    private UserService userService;
    @Autowired
    private NotificationService notificationService;

    //Метод processRegistration
    public void processRegistration(String name, int age, String email){
        User user = userService.createUser(name,age,email);
        dataProcessingService.getRepository().save(user);
        notificationService.notifyUser(user);
    }
}
