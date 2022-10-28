package com.kev.CreateExam.src.service;

import com.kev.CreateExam.src.model.Student;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kevin
 */
public interface StudentServiceInterface {

    public void createStudent(Student student);
    
    public long CountByCity(String City);
    
    @Transactional
    public void editOrCreate(Student student);

    public Student findById(long id);

    public List<Student> findAllByCity(String City);
    
    public List<Student> findAll();
    
    public void deleteStudent(Long id);

}
