package org.alvarowau.controller;

import jakarta.validation.Valid;
import org.alvarowau.model.dto.CourseRequestPost;
import org.alvarowau.model.dto.CourseResponsePost;
import org.alvarowau.model.entity.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;

public interface CourseController {
    ResponseEntity<?> createCourse(@Valid @RequestBody CourseRequestPost post, BindingResult result);
}
