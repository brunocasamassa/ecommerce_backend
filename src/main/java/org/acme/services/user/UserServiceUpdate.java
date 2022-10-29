package org.acme.services.user;


import org.acme.domain.user.User;
import org.acme.repository.UserRepository;
import org.bson.types.ObjectId;

public class UserServiceUpdate{

    public static void execute(UserRepository repository, User user, String userId){
        User requestedUser = repository.findById(new ObjectId(userId));
        requestedUser.setUserPassword(user.getUserPassword());
        requestedUser.setUsername(user.getUsername());
         repository.update(requestedUser);
    }


}