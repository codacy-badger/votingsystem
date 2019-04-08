package ru.votingsystem.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@NamedQueries({
        @NamedQuery(name = Restaurant.DELETE, query = "DELETE FROM Restaurant r where r.id=:id"),
        @NamedQuery(name = Restaurant.ALL_SORTED, query = "SELECT r FROM Restaurant r order by r.name")
})

@Entity
@Table(name = "restaurant")
public class Restaurant extends AbstractNamedEntity {
    public static final String DELETE = "Restaurant.delete";
    public static final String ALL_SORTED = "Restaurant.getAllSorted";

    @Column(name = "address")
    @NotNull
    private String address;

    @CollectionTable(name = "meals", joinColumns = @JoinColumn(name = "restaurant_id"))
    @Column(name = "meals")
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Meal> menu;

    public Restaurant(Integer id, String name, String address, Set<Meal> menu) {
        super(id, name);
        this.address = address;
        this.menu = menu;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Meal> getMenu() {
        return menu;
    }

    public void setMenu(Set<Meal> menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "address='" + address + '\'' +
                ", menu=" + menu +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
