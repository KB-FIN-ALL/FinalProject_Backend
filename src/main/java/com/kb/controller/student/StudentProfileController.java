package com.kb.controller.student;

import com.kb.student.dto.DailyCheckDTO;
import com.kb.student.dto.StudentDTO;
import com.kb.student.dto.StudentProfileDTO;
import com.kb.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student/profile")
@RequiredArgsConstructor
@Slf4j

public class StudentProfileController {

    private final StudentService studentService;

    @GetMapping("/student/{studentId}")
    public ResponseEntity<StudentDTO> getStudentProfile(@PathVariable Long studentId) {
        StudentDTO studentProfile = studentService.getStudentProfile(studentId);
        return ResponseEntity.ok(studentProfile);
    }

    @GetMapping("/{stdId}")
    public ResponseEntity<StudentProfileDTO> getStudentProfile(@PathVariable long stdId) {
        StudentProfileDTO studentProfile = studentService.getStudentProfile(stdId);
        return ResponseEntity.ok(studentProfile);
    }

}