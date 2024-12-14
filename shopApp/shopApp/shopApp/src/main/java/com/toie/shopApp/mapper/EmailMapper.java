package com.toie.shopApp.mapper;


import com.toie.shopApp.domain.entity.EmailSent;
import com.toie.shopApp.model.EmailSentDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface EmailMapper {
    EmailSentDto map(EmailSent emailSent);
    List<EmailSentDto> map(List<EmailSent> emailSent);
}
