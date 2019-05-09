package ru.votingsystem.repository.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.votingsystem.model.Vote;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class VoteRepository {
    private final static Logger log = LoggerFactory.getLogger(VoteRepository.class);

    @PersistenceContext
    private EntityManager em;

    public List<Vote> getAll(int id) {
        log.info("getAll{}", id);
        return null;
    }

    public Vote get(int id) {
        log.info("get {}", id);
        return em.find(Vote.class, id);
    }

    public boolean delete(int id) {
        log.info("delete {}", id);
        return em.createNamedQuery(Vote.DELETE)
                .setParameter("id", id)
                .executeUpdate() != 0;
    }

    public Vote save(Vote vote) {
        log.info("save {}", vote);
        if (vote.isNew()){
            em.persist(vote);
            return vote;
        }else {
            return em.merge(vote);
        }
    }
}
