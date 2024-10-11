package com.kb.quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizAnswerDTO {
    private Long quizId;        // 퀴즈 ID
    private Long stdId;     // 학생 ID
    private String selectedAnswer; // 학생이 선택한 답 (1, 2, 3, 4 중 하나)
}