package com.toie.shopApp.repository;

import com.toie.shopApp.domain.entity.EmailSent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmailSentRepository  extends JpaRepository<EmailSent, UUID> {
}
