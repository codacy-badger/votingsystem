package ru.votingsystem.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.votingsystem.model.Restaurant;

@Transactional(readOnly = true)
public interface CrudMealRespository extends JpaRepository<Restaurant, Integer> {

}
