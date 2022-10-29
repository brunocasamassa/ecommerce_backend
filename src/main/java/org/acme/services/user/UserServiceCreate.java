package org.acme.services.user;
 
import org.acme.domain.user.User;
 import org.acme.repository.UserRepository;
 
public class UserServiceCreate{

    public static User execute(UserRepository repository,User user){
        User requestUser = new User();
        requestUser.setUsername(user.getUsername());
        requestUser.setUserPassword(user.getUserPassword());
        requestUser.setUserId(user.id.toString());
        repository.persist(requestUser);

        return requestUser;
    }


}