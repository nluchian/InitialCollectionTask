package com.company;

public class AdminUser extends AbstractUser {

    public AdminUser(String userName) {
        super(userName);
    }

    public void approveOrder(Order order) {

    }

    public void rejectOrder(Order order) {

    }
}
