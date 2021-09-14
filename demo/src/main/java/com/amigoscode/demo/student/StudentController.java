package com.amigoscode.demo.student;

import com.amigoscode.demo.exeception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents()  {
       // throw new ApiRequestException("Oops cannot get all students with custom exception ");

     return studentService.getAllStudents();
    }
    @GetMapping(path="{studentId}/courses")
    public List<StudentCourse> getAllCourseForStudent(@PathVariable("studentId") UUID studentId)
    {

        return studentService.getAllCoursesForStudent(studentId);
    }

    @PostMapping
    public  void addNewStudent(@RequestBody @Valid Student student){
        studentService.addNewStudent(student);
    }
}