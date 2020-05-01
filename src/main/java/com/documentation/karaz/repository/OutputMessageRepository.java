package com.documentation.karaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.documentation.karaz.models.OutputMessage;

public interface OutputMessageRepository extends JpaRepository<OutputMessage, Long> {

}
