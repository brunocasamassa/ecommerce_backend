package org.acme.domain.user;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class User  extends PanacheMongoEntity{
    
    private String username;

    private String userId;

    private String userPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public User(){}

    public User(String userString, String userPass, String userID){
        this.userId = userID;
        this.username=userString;
        this.userPassword = userPass;
    }
}
