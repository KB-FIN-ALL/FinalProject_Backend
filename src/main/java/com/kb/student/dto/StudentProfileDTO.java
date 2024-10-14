package com.kb.student.dto;

import com.kb.student.domain.Student;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor

public class StudentProfileDTO {
    private long stdId;
    private String stdName;
    private String stdAccount;
    private String stdBirth;
    private long jobId;
    private int seed;
}