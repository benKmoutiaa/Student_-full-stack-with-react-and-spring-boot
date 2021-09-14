package com.amigoscode.demo.student;

import java.time.LocalDate;
import java.util.UUID;

public class StudentCourse {
    private final UUID student_id;
    private final UUID course_id;
    private final String name_c;
    private final String description;
    private final String department;
    private final String teacherName;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final Integer grade;



    public StudentCourse(UUID student_id,
                         UUID course_id,
                         String name_c,
                         String description,
                         String department,
                         String teacherName,
                         LocalDate startDate,
                         LocalDate endDate,
                         Integer grade) {
        this.student_id = student_id;
        this.course_id = course_id;
        this.name_c = name_c;
        this.description = description;
        this.department = department;
        this.teacherName = teacherName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.grade = grade;
    }
    public String getName_c() {
        return name_c;
    }

    public String getDescription() {
        return description;
    }

    public String getDepartment() {
        return department;
    }

    public String getTeacherName() {
        return teacherName;
    }
    public UUID getStudent_id() {
        return student_id;
    }

    public UUID getCourse_id() {
        return course_id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Integer getGrade() {
        return grade;
    }
}
