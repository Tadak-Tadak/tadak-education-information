package com.web.tadak.entity.teacher;


import com.web.tadak.entity.course.Courses;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeacherHistory { //강사 과정 이력


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //강사 과정 이력 번호

    @ManyToOne
    @JoinColumn(name = "courses_id", nullable = false)
    private Course course; // 과정 번호


    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher; // 강사 번호

}
