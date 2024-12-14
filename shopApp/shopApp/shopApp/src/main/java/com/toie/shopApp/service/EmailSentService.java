package com.toie.shopApp.service;

import com.toie.shopApp.domain.entity.EmailSent;
import com.toie.shopApp.domain.entity.Product;
import com.toie.shopApp.repository.EmailSentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmailSentService {

    private final EmailSentRepository emailSentRepository;

    public List<EmailSent> getAllEmails() {
        return emailSentRepository.findAll();
    }
}
