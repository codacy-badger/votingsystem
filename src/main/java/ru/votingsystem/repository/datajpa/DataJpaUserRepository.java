package ru.votingsystem.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.votingsystem.model.User;

import java.util.List;

@Repository
public class DataJpaUserRepository {


    @Autowired
    private CrudUserRepository repository;

    public User get(int id) {
        return null;
    }

    public List<User> getAll() {
        return null;
    }

    public User save(User user) {
        return null;
    }

    public boolean delete(int id) {
        return false;
    }

    public User getByEmail(int id) {
        return null;
    }

}
