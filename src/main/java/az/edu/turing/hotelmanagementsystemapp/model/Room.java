package az.edu.turing.hotelmanagementsystemapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode
@ToString(onlyExplicitlyIncluded = true)
public class Room {
    @ManyToOne
    @JoinColumn(name="hotel_id")
    private Hotel hotel;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Include
    private Long id;
    @ToString.Include
    private String roomNumber;
    @ToString.Include
    private String roomType;
    @ToString.Include
    private double roomPrice;



    public Room(Hotel hotel, String roomNumber, String roomType, double roomPrice) {
        this.hotel = hotel;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public Room(Hotel hotel, Long id, String roomNumber, String roomType, double roomPrice) {
        this.hotel = hotel;
        this.id = id;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }
}
