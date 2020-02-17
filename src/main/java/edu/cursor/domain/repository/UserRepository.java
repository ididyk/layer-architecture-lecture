package edu.cursor.domain.repository;

import edu.cursor.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByNameFirstName(String firstName);

    List<User> findByNameLastName(String lastName);

    List<User> findByAddressCountry(String country);

    @Query(value = "select * from users", nativeQuery = true)
    List<User> getAllUsers();

}
