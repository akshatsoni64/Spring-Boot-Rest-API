package com.akshat.rest.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student){
        studentRepository.save(student);
    }

    @Transactional
    public void updateStudent(
            Long studentId,
            String name,
            String email
    ){
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("Student not found"));
        student.setName(name);
        student.setEmail(email);
        System.out.println(studentId);
        System.out.println(name);
        System.out.println(email);
    }

    public void deleteStudent(Long studentId){
        boolean exists = studentRepository.existsById(studentId);
        if(exists){
            studentRepository.deleteById(studentId);
        }
        else{
            System.out.println("Not Found");
            System.out.println(studentId);
            throw new IllegalStateException("Student Not Exists");
        }
    }
}
