package com.kb.quiz.mapper;

import com.kb.quiz.dto.QuizDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

public interface QuizMapper { // 오늘의 퀴즈 가져오기@Select("SELECT quiz_id, quiz_content, answer1, answer2, answer3, answer4, answer_num, quiz_date FROM quiz WHERE quiz_date = CURDATE()")
        QuizDTO getTodayQuiz();
        // 특정 퀴즈의 정답 번호 가져오기@Select("SELECT answer_num FROM quiz WHERE quiz_id = #{quizId}")
        String getCorrectAnswer(Long quiz);
}