package com.sadman.model;

import javax.persistence.*;

/**
 * Created by Sadman on 8/18/2015.
 */
@Entity
@Table (name = "user_login_history")
public class UserLoginHistory {

    @Id
    @Column (name = "id", unique = true, nullable = true)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @Column (name = "loginTime", nullable = true)
    private String loginTime;

    @ManyToOne
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
