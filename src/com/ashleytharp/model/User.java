package com.ashleytharp.model;

/**
 * Project: Ashley Tharp DAODemo2022
 * Package: sample.model
 * <p>
 * User: Ashley Tharp
 * Date: 03/08/2022
 * <p>
 * Created with IntelliJ IDEA
 */

public class User {
    private int userId;
    private String userName;
    private String password;


    public User(int userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;

    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }



}
