package az.edu.turing.hotelmanagementsystemapp.controller;

import az.edu.turing.hotelmanagementsystemapp.model.Room;
import az.edu.turing.hotelmanagementsystemapp.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/rooms")
public class RoomController {
    private final RoomService roomService;

    @GetMapping
    public ResponseEntity<List<Room> >getAllRooms() {
        List<Room> rooms = roomService.getAllRooms();
        return ResponseEntity.ok(rooms);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Room> getRoomById(@PathVariable Long id) {
        Room room = roomService.getRoomById(id);
        return (room!=null)?ResponseEntity.ok(room) : ResponseEntity.notFound().build();
    }
    @PostMapping
    public ResponseEntity<Room> createRoom(@RequestBody Room room) {
        Room added=roomService.saveRoom(room);
        return ResponseEntity.ok(added);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Room> updateRoom(@PathVariable Long id, @RequestBody Room room) {
        Room updatedRoom = roomService.updateRoom(id, room);
        return (updatedRoom!=null)?ResponseEntity.ok(updatedRoom) : ResponseEntity.notFound().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoom(@PathVariable Long id) {
       boolean deleted=roomService.deleteRoomById(id);
       return (deleted)?ResponseEntity.noContent().build():ResponseEntity.notFound().build();
    }
}
