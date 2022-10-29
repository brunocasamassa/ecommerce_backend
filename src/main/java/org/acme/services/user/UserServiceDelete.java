package org.acme.services.user;
 
 import org.acme.domain.user.User;
 import org.acme.repository.UserRepository;
import org.bson.types.ObjectId;
 
public class UserServiceDelete{

    public static void execute(UserRepository repository,String userId){
  
        User user = repository.findById(new ObjectId(userId));
        repository.delete(user);
    }


}