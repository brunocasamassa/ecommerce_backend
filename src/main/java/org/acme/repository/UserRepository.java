package org.acme.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

 import org.acme.domain.user.User;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.panache.common.Sort;
 
@ApplicationScoped
public class UserRepository implements PanacheMongoRepository<User> {

    public User findByName(String name) {
        return find("name", name).firstResult();
    }

    public List<User> findOrderedName() {
        return listAll(Sort.by("name"));
    }
}
