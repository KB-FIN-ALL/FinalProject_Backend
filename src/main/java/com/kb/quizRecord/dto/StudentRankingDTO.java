package com.kb.quizRecord.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRankingDTO {
    private long stdId;
    private String stdName;
    private int correctCount;
}
