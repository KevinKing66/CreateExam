package com.kev.CreateExam.src.repository;

import com.kev.CreateExam.src.model.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kevin
 */
public interface StudentRepository extends JpaRepository< Student, Long> {

    List<Student> findAllByCity(String city);

    long countByCity(String city);
}
