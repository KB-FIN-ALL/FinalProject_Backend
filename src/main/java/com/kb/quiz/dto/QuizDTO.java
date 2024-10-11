package com.kb.quiz.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class QuizDTO {
    private long quizId;
    private String quizContent;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answerNum;
    private Date quizDate;
}
