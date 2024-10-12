package com.kb.Scheduled;

import com.kb.student.service.StudentService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private StudentService studentService;

    @Scheduled(fixedDelay = 2000)
    public void scheduledTest() {
        System.out.println("===================================================");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("스케줄러 테스트");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("===================================================");
    }
}
