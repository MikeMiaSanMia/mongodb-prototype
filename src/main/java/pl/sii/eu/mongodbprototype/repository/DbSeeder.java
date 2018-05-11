package pl.sii.eu.mongodbprototype.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sii.eu.mongodbprototype.document.Address;
import pl.sii.eu.mongodbprototype.document.Hotel;
import pl.sii.eu.mongodbprototype.document.Review;

import java.util.Arrays;

@Component
public class DbSeeder implements CommandLineRunner {

    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) {
        Hotel marriot = new Hotel(
                "Marriot",
                200,
                new Address("Warsaw", "Poland"),
                Arrays.asList(
                        new Review("Mike", 9, false),
                        new Review("Bob", 6, true)
                )
        );

        Hotel gdansk = new Hotel(
                "Gdansk",
                100,
                new Address("Gdansk", "Poland"),
                Arrays.asList(
                        new Review("Alice", 10, true),
                        new Review("Grace", 8, false)
                )
        );

        Hotel hilton = new Hotel(
                "Hilton",
                300,
                new Address("Paris", "France"),
                Arrays.asList(
                        new Review("Harry", 9, true),
                        new Review("Megan", 10, true)
                )
        );

        hotelRepository.deleteAll();

        hotelRepository.save(marriot);
        hotelRepository.save(gdansk);
        hotelRepository.save(hilton);

    }
}
