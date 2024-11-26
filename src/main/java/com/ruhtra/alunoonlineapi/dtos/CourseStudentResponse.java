package com.ruhtra.alunoonlineapi.dtos;

import com.ruhtra.alunoonlineapi.enums.EnrollmentStudentStatusEnum;
import lombok.Data;

@Data
public class CourseStudentResponse {
    private String subjectName;
    private String teacherName;
    private Double gradeOne;
    private Double gradeTwo;
    private Double average;
    private EnrollmentStudentStatusEnum status;
}
