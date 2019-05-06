package ru.votingsystem.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@NamedQueries({
        @NamedQuery(name = Meal.DELETE, query = "DELETE FROM Meal m WHERE m.id=:id"),
        @NamedQuery(name = Meal.ALL_SORTED, query = "SELECT m FROM Meal m ORDER BY m.name")
})

@Entity
@Table(name = "meals")
public class Meal extends AbstractNamedEntity{
    public static final String DELETE = "Meal.Delete";
    public static final String ALL_SORTED = "Meal.getAllSorted";

    @Column(name = "price")
    @NotNull
    private Integer price;

    @Column(name = "date_lunch")
    private LocalDateTime dateTime;

    public Meal(){}

    public Meal(Integer id, String name, Integer price, LocalDateTime dateTime) {
        super(id, name);
        this.price = price;
        this.dateTime = dateTime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "price=" + price +
                ", dateTime=" + dateTime +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
