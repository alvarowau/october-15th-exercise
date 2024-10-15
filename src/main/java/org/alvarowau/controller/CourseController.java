package org.alvarowau.controller;

import jakarta.validation.Valid;
import org.alvarowau.model.dto.CourseRequestPost;
import org.alvarowau.model.dto.CourseResponsePost;
import org.alvarowau.model.entity.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CourseController {
    ResponseEntity<?> createCourse(@Valid @RequestBody CourseRequestPost post, BindingResult result);
    ResponseEntity<List<CourseResponsePost>> getAllCourses();
    ResponseEntity<CourseResponsePost> getCourseById(Long id);
}
