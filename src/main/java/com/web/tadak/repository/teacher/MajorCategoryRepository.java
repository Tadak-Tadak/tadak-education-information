package com.web.tadak.repository.teacher;

import com.web.tadak.entity.teacher.TeacherMajorCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MajorCategoryRepository extends JpaRepository<TeacherMajorCategory, Long> {
}
