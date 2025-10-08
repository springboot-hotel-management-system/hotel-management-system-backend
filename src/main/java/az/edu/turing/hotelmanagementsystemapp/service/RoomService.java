package az.edu.turing.hotelmanagementsystemapp.service;

import az.edu.turing.hotelmanagementsystemapp.model.Room;
import az.edu.turing.hotelmanagementsystemapp.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }
    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }
    public boolean deleteRoomById(Long id) {
        if (roomRepository.existsById(id)) {
            roomRepository.deleteById(id);
            return true;
        }
        return false;

    }
    public Room updateRoom(long id,Room room) {
        return roomRepository.findById(id)
                .map(existingRoom->{
                    existingRoom.setRoomNumber(room.getRoomNumber());
                    existingRoom.setId(room.getId());
                    existingRoom.setRoomPrice(room.getRoomPrice());
                    existingRoom.setRoomType(room.getRoomType());
                    return roomRepository.save(existingRoom);
                }).orElse(null);
    }
}
