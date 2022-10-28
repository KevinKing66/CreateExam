package com.kev.CreateExam.src.service;

import com.kev.CreateExam.src.model.Student;
import com.kev.CreateExam.src.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kevin
 */
@Service
public class StudentService implements StudentServiceInterface {

    @Autowired
    StudentRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Student findById(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAllByCity(String City) {
        return repository.findAllByCity(City);
    }

    @Override
    @Transactional(readOnly = true)
    public long CountByCity(String City) {
        return repository.countByCity(City);
    }

    @Override
    public void editOrCreate(Student student) {       
        repository.save(student);        
    }

    @Override
    public void createStudent(Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
