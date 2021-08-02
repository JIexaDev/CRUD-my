package ru.java.web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.java.web.models.User;

import java.util.List;

@Repository
@Component
public class UserDaoImp implements UserDao{

    @Override
    public List<User> index() {
        return null;
    }

    @Override
    public User show(int id) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(int id, User updatedUser) {

    }

    @Override
    public void delete(int id) {

    }
}
