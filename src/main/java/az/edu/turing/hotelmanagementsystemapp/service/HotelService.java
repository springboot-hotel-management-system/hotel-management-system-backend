package az.edu.turing.hotelmanagementsystemapp.service;

import az.edu.turing.hotelmanagementsystemapp.model.Hotel;
import az.edu.turing.hotelmanagementsystemapp.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {
    private final HotelRepository hotelRepository;
    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
    public Hotel getHotelById(Long id) {
        return hotelRepository.findById(id).orElse(null);
    }
    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
    public Hotel updateHotel(Long id, Hotel hotel) {
        return hotelRepository.findById(id)
                .map(existingHotel -> {
                    existingHotel.setName(hotel.getName());
                    existingHotel.setDescription(hotel.getDescription());
                    existingHotel.setRooms(hotel.getRooms());
                    existingHotel.setEmail(hotel.getEmail());
                    existingHotel.setPhone(hotel.getPhone());
                    existingHotel.setLocation(hotel.getLocation());
                    existingHotel.setDescription(hotel.getDescription());
                    return hotelRepository.save(existingHotel);

                }).orElse(null);
    }

        public void deleteHotel (Long id){
            hotelRepository.deleteById(id);
        }
    }
