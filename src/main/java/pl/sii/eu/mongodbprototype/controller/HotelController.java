package pl.sii.eu.mongodbprototype.controller;

import org.springframework.web.bind.annotation.*;
import pl.sii.eu.mongodbprototype.document.Hotel;
import pl.sii.eu.mongodbprototype.repository.HotelRepository;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/all")
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @PutMapping("/insert")
    public void insert(@RequestBody Hotel hotel) {
        hotelRepository.insert(hotel);
    }

    @PostMapping("/update")
    public void update(@RequestBody Hotel hotel) {
        hotelRepository.save(hotel);
    }

    @GetMapping("/{name}")
    public Hotel getByName(@PathVariable("name") String name) {
        return hotelRepository.findByName(name);
    }
}
