package com.kb.quizRecord.mapper;

import com.kb.quizRecord.dto.QuizRecordDTO;
import com.kb.quizRecord.dto.StudentRankingDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface QuizRecordMapper {
    void insertQuizRecord(QuizRecordDTO quizRecordDTO);
    List<StudentRankingDTO> getStudentCorrectAnswerRankings();

}
