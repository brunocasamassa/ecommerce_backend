package org.acme.services.user;

import org.acme.domain.user.User;
import org.acme.repository.UserRepository;
import org.bson.types.ObjectId;

public class UserServiceGet{

    public static User execute(UserRepository repository, String userId){
        return repository.findById(new ObjectId(userId));
    }


}