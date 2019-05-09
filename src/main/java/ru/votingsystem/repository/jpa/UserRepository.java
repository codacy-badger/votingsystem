package ru.votingsystem.repository.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.votingsystem.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class UserRepository {
    private static final Logger log = LoggerFactory.getLogger(UserRepository.class);

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public User save(User user) {
        log.info("save {}", user);
        if (user.isNew()) {
            em.persist(user);
            return user;
        } else {
            return em.merge(user);
        }
    }

    @Transactional
    public boolean delete(int id) {
        log.info("delete {}", id);
        return em.createNamedQuery(User.DELETE)
                .setParameter("id", id)
                .executeUpdate() != 0;
    }

    public User get(int id) {
        log.info("get {}", id);
        return em.find(User.class, id);
    }

    public User getByEmail(String email) {
        log.info("getByEmail {}", email);
        List<User> users = em.createNamedQuery(User.BY_EMAIL, User.class)
                .setParameter(1, email)
                .getResultList();
        return DataAccessUtils.singleResult(users);
    }

    public List<User> getAll() {
        log.info("getAll");
        return em.createNamedQuery(User.ALL_SORTED, User.class).getResultList();
    }
}
