package com.kb.controller.student;


import com.kb.quiz.dto.QuizAnswerDTO;
import com.kb.quiz.dto.QuizDTO;
import com.kb.quiz.service.QuizService;
import com.kb.quizRecord.dto.QuizRecordDTO;
import com.kb.quizRecord.dto.StudentRankingDTO;
import com.kb.quizRecord.service.QuizRecordService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student/event")
@RequiredArgsConstructor
@Slf4j
@Api(value= "StudentEventController", tags = "학생 이벤트")
@PropertySource({"classpath:/application.properties"})
public class StudentEventController {

    private final QuizService quizService;
    private final QuizRecordService quizRecordService;


    @GetMapping("/quiz")
    public ResponseEntity<QuizDTO> getTodayQuiz() {
        QuizDTO quizDTO = quizService.getTodayQuiz();
        return ResponseEntity.ok(quizDTO);
    }

    @PostMapping("/submit")
    public ResponseEntity<QuizRecordDTO> createQuizRecord(@RequestBody QuizRecordDTO quizRecordDTO) {
        QuizRecordDTO createdQuizRecord = quizRecordService.createQuizRecord(quizRecordDTO);
        return new ResponseEntity<>(createdQuizRecord, HttpStatus.CREATED);  // 삽입된 데이터 반환
    }

    @GetMapping("/quiz-ranking")
    public List<StudentRankingDTO> getStudentCorrectAnswerRankings() {
        return quizRecordService.getStudentCorrectAnswerRankings();
    }
}