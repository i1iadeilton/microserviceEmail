package com.ms.email.repositories;

import com.ms.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

//Utilizar os métodos findall, findById
public interface EmailRepository extends JpaRepository<EmailModel, UUID> {

}
