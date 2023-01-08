package com.SpringAllCrudOperation.contact.repository;

import com.SpringAllCrudOperation.contact.model.UserContact;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserContactRepository extends JpaRepository<UserContact, Integer> {
}
