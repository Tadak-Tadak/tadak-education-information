package com.web.tadak.repository.course;

import com.web.tadak.entity.course.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
public class CourseRepositoryTest {

    @Autowired
    private CertificationRepository CertificationRepository;

    @Autowired
    private CourseRepository CourseRepository;

//TraniningType, institytion entity 필요!!
//    @Test
//    void testCreateCourse(){
//
//
//
//        //Given
//        Course course = Course.builder()
//                .name("(디지털컨버전스)AWS 클라우드와 Kafka를 활용한 Java(자바) Full-Stack 개발자 양성과정(A)")
//                .maxStudent(40)
//                .trainingDate(112)
//                .trainingHour(896)
//                .email("www.sist.co.kr")
//                .startedAt(LocalDateTime.now())
//                .endedAt(LocalDateTime.now().plusDays(1))
//                .trainingTypeSeq(1)
//                .institutionSeq(1)
//                .build()
//                ;
//
//        //When
//        Course saveCourse = CourseRepository.save(course);
//
//        //Then
//        assertThat(saveCourse.getId()).isNotNull();
//        assertThat(saveCourse.getName()).isEqualTo(course.getName());
//    }
}
