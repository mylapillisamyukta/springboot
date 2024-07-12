package com.project.crudoperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.crudoperations.entity.Student;

@Repository
public interface studentRepository extends JpaRepository<Student,Integer> {

}
