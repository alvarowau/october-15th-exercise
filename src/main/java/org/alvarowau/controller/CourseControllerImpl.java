package org.alvarowau.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.alvarowau.model.dto.CourseRequestPost;
import org.alvarowau.model.dto.CourseResponsePost;
import org.alvarowau.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseControllerImpl implements CourseController {

    private final CourseService courseService;

    @PostMapping
    @Override
    public ResponseEntity<?> createCourse(@Valid @RequestBody CourseRequestPost post, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result.getAllErrors());
        }
        try {
            CourseResponsePost createdCourse = courseService.createCourse(post);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdCourse);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el curso: " + e.getMessage());
        }
    }

    @GetMapping
    @Override
    public ResponseEntity<List<CourseResponsePost>> getAllCourses() {
        try{
            return ResponseEntity.ok(courseService.getAllCourses());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<CourseResponsePost> getCourseById(@PathVariable Long id) {
        try{
            return ResponseEntity.ok(courseService.getCourseById(id));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }


}
