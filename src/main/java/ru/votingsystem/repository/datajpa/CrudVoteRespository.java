package ru.votingsystem.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.votingsystem.model.Vote;

@Transactional(readOnly = true)
public interface CrudVoteRespository extends JpaRepository<Vote, Integer> {
}
