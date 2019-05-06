package ru.votingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "votes")
public class Vote extends AbstractBaseEntity{

    @Column(name = "user_id")
    @NotNull
    private Integer userId;

    @Column(name = "restaurant_id")
    @NotNull
    private Integer restaurantId;

    @Column(name = "date_vote")
    @NotNull
    private LocalDateTime dateVoting;

    public Vote() {
    }

    public Vote(Integer id, Integer userId, Integer restaurantId, LocalDateTime dateVoting) {
        super(id);
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.dateVoting = dateVoting;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public LocalDateTime getDateVoting() {
        return dateVoting;
    }

    public void setDateVoting(LocalDateTime dateVoting) {
        this.dateVoting = dateVoting;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "userId=" + userId +
                ", restaurantId=" + restaurantId +
                ", dateVoting=" + dateVoting +
                ", id=" + id +
                '}';
    }
}
