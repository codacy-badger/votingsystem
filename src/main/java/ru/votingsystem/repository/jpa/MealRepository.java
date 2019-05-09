package ru.votingsystem.repository.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.votingsystem.model.Meal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class MealRepository {
    private final static Logger log = LoggerFactory.getLogger(MealRepository.class);

    @PersistenceContext
    private EntityManager em;

    public List<Meal> getAll(int id) {
        log.info("getAll");
        return null;
    }

    public Meal get(int id) {
        log.info("get {}", id);
        return null;
    }

    public boolean delete(int id) {
        log.info("delete {}", id);
        return false;
    }

    public Meal save(Meal meal) {
        log.info("save {}", meal);
        return null;
    }

}
