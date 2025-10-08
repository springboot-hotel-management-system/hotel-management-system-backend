package az.edu.turing.hotelmanagementsystemapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString(onlyExplicitlyIncluded = true)

public class Hotel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @ToString.Include
    private Long id;
    @ToString.Include
    private String name;
    @ToString.Include
    private String phone;
    @ToString.Include
    private String email;
    @ToString.Include
    private String description;
    @ToString.Include
    private String location;
    @ToString.Include
    private String rating;
    @ToString.Include
    private String facility;

    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Room> rooms;
    public Hotel(Long id, String name, String phone, String email, String description, String location, String rating, String facility, List<Room> rooms) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.description = description;
        this.location = location;
        this.rating = rating;
        this.facility = facility;
        this.rooms = rooms;
    }
}
