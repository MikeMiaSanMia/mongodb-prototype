package pl.sii.eu.mongodbprototype.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.sii.eu.mongodbprototype.document.Hotel;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {

}
