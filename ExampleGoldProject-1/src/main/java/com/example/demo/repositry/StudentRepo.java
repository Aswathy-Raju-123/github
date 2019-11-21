package com.example.demo.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
      // List<Student> findByName(String name);
	List<Student> findByIdBetween(Integer )
       
       
       
}
