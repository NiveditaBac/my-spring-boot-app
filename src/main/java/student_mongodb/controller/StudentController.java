package student_mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student_mongodb.entity.Student;
import student_mongodb.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    
    @PostMapping("/addStudent")
    public ResponseEntity<?> addStudent(@RequestBody Student student){

            Student save = this.studentRepository.save(student);
            return ResponseEntity.ok(save);

    }

    @GetMapping("/students")
    public ResponseEntity<?> getStudents(){
        
            return ResponseEntity.ok(this.studentRepository.findAll());

    }
}