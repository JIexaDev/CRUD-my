package ru.java.web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.java.web.models.User;

import java.util.List;

@Repository
@Component
public class UserDaoImp implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> index() {
        return sessionFactory.getCurrentSession().createQuery("from User").getResultList();
    }

    @Override
    public User show(int id) {
        return sessionFactory.getCurrentSession()
                .createQuery("select u from User u where u.id=:id", User.class)
                .setParameter("id", id)
                .getResultList()
                .stream().findAny().orElse(null);
    }

    @Override
    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void update(int id, User updatedUser) {
        User userToBeUpdated = show(id);
        userToBeUpdated.setFirstName(updatedUser.getFirstName());
        userToBeUpdated.setLastName(updatedUser.getLastName());
        userToBeUpdated.setEmail(updatedUser.getEmail());
    }

    @Override
    public void delete(int id) {
        sessionFactory.getCurrentSession().createQuery("delete from User where id =" + id).executeUpdate();
    }
}
