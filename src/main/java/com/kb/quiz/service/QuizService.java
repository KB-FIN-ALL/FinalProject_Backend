package com.kb.quiz.service;

import com.kb.quiz.dto.QuizAnswerDTO;
import com.kb.quiz.dto.QuizDTO;
import com.kb.quiz.mapper.QuizMapper;
import com.kb.quizRecord.dto.QuizRecordDTO;
import com.kb.quizRecord.mapper.QuizRecordMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j
@Service
@RequiredArgsConstructor
@PropertySource({"classpath:/application.properties"})
public class QuizService {

    private final QuizMapper quizMapper;
    private final QuizRecordMapper quizRecordMapper;

    // 오늘의 퀴즈 가져오기
    public QuizDTO getTodayQuiz() {
        return quizMapper.getTodayQuiz();
    }

    // 학생의 퀴즈 답변 제출 처리
    public void submitQuizAnswer(QuizRecordDTO quizRecordDTO) {
        // 퀴즈 정답을 가져옴
        String correctAnswer = quizMapper.getCorrectAnswer(quizRecordDTO.getQuizId());

        // 제출된 답과 정답을 비교하여 정답 여부를 설정
        String isCorrect = quizRecordDTO.getIsCorrect().equals(correctAnswer) ? "Y" : "N";
        quizRecordDTO.setIsCorrect(isCorrect);
    }
}
