package az.edu.turing.hotelmanagementsystemapp.repository;

import az.edu.turing.hotelmanagementsystemapp.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
