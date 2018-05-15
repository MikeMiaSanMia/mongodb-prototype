package pl.sii.eu.mongodbprototype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import pl.sii.eu.mongodbprototype.model.Users;

@Component
public interface UserJpaRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);
}
