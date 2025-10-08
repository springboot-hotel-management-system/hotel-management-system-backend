package az.edu.turing.hotelmanagementsystemapp.repository;

import az.edu.turing.hotelmanagementsystemapp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
