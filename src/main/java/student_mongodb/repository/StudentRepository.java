package student_mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import student_mongodb.entity.Student;

public interface StudentRepository extends MongoRepository<Student, Long>{
    
}
