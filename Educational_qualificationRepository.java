package com.icf.springbootassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icf.springbootassignment.entity.Educational_qualification;

@Repository
public interface Educational_qualificationRepository extends JpaRepository<Educational_qualification, String>{

}