package com.sadman.dao;

import com.sadman.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Sadman on 8/17/2015.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession () {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addUser(User user) {
        getCurrentSession().save(user);
    }

    @Override
    public void updateUser(User user) {
        User userToUpdate = getUser(user.getId());
        userToUpdate.setId(user.getId());
        userToUpdate.setFirstName(user.getFirstName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setPassword(user.getPassword());
        userToUpdate.setHistory(user.getHistory());
        getCurrentSession().merge(userToUpdate);
    }

    @Override
    public void deleteUser(int id) {
        User user = getUser(id);
        if(user != null) {
            getCurrentSession().delete(user);
        }
    }

    @Override
    public User getUser(int id) {
        User user = (User) getCurrentSession().get(User.class, id);
        return user;
    }

    @Override
    public List getUsers() {
        return getCurrentSession().createQuery("from User").list();
//        return getCurrentSession().createCriteria(User.class).list();
    }
}
