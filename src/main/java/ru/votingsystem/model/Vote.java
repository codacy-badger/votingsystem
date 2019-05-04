package ru.votingsystem.model;

import java.time.LocalDateTime;

public class Vote {
    private Integer userId;
    private Integer restaurantId;
    private LocalDateTime dateVoting;

    public Vote() {
    }

    public Vote(Integer userId, Integer restaurantId, LocalDateTime dateVoting) {
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
                '}';
    }
}
