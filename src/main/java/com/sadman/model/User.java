package com.sadman.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sadman on 8/14/2015.
 */
@Entity
@Table (name = "users")
public class User {

    @Id
    @Column (name = "id")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @Column (name = "firstName")
    @NotEmpty (message = "First name should not be empty")
    private String firstName;

    @Column (name = "lastName")
    @NotEmpty (message = "Last Name should not be empty")
    private String lastName;

    @Column (name = "email")
    @Email
    @NotEmpty (message = "A valid Email must be provided")
    private String email;

    @Column (name = "password")
    @Size(min = 6, message = "Password must have 6 characters at least")
    private String password;

    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn (name = "user_id")
    private List<UserLoginHistory> history = new ArrayList<UserLoginHistory>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName () {
        return this.firstName + " " + this.lastName;
    }

    public List<UserLoginHistory> getHistory() {
        return history;
    }

    public void setHistory(List<UserLoginHistory> history) {
        this.history = history;
    }
}
