package com.icf.springbootassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icf.springbootassignment.entity.Dependants;

@Repository
public interface DependantsRepository extends JpaRepository<Dependants, String>{

}
