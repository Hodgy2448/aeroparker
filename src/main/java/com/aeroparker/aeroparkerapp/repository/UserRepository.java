package com.aeroparker.aeroparkerapp.repository;

import com.aeroparker.aeroparkerapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT \n" +
            "    CASE WHEN EXISTS \n" +
            "    (\n" +
            "        SELECT * FROM aeroparker.customers WHERE customers.email_address = ?1\n" +
            "    )\n" +
            "    THEN 'TRUE'\n" +
            "    ELSE 'FALSE'\n" +
            "END",nativeQuery = true)
    public Boolean checkEmail(String email_address);
}
