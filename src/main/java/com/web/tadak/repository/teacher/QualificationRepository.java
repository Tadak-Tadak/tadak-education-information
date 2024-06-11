package com.web.tadak.repository.teacher;

import com.web.tadak.entity.teacher.Qualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface QualificationRepository extends JpaRepository<Qualification, Long> {
}
