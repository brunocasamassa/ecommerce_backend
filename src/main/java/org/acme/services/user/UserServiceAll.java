package org.acme.services.user;

import org.acme.domain.order.*;
import org.acme.domain.user.User;
import org.acme.repository.UserRepository;
import java.util.List;

public class UserServiceAll{

    public static List<User> execute(UserRepository repository){
        return repository.listAll();
    }

}