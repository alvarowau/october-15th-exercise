package org.alvarowau.service;


import lombok.RequiredArgsConstructor;
import org.alvarowau.mapper.CourseMapper;
import org.alvarowau.model.dto.CourseRequestPost;
import org.alvarowau.model.dto.CourseResponsePost;
import org.alvarowau.model.entity.Course;
import org.alvarowau.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public CourseResponsePost createCourse(CourseRequestPost courseRequestPost) {
        try {
            Course courseSave = courseRepository.save(CourseMapper.toCourse(courseRequestPost));
            return CourseMapper.toCourseResponsePost(courseSave);
        }catch (Exception e) {
            throw new RuntimeException("no se pudo guardar la entity" + e.getMessage());
        }
    }

    @Override
    public List<CourseResponsePost> getAllCourses() {
        List<Course> courses = courseRepository.findAll();
        return courses.parallelStream().map(CourseMapper::toCourseResponsePost).toList();
    }

    @Override
    public CourseResponsePost getCourseById(Long id) {
        Optional<Course> course = courseRepository.findById(id);
        return CourseMapper.toCourseResponsePost(course
                .orElseThrow(() -> new RuntimeException("Course not found")));
    }

    @Override
    public CourseResponsePost updateCourse(Long id, CourseRequestPost courseRequestPost) {
        return null;
    }
}
