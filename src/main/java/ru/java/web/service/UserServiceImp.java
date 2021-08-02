package ru.java.web.service;

import org.springframework.stereotype.Component;
import ru.java.web.dao.UserDao;
import ru.java.web.dao.UserDaoImp;
import ru.java.web.models.User;

import java.util.List;

@Component
public class UserServiceImp implements UserService{

    UserDao userDao = new UserDaoImp();

    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public User show(int id) {
        return userDao.show(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(int id, User updatedUser) {
        userDao.update(id, updatedUser);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
