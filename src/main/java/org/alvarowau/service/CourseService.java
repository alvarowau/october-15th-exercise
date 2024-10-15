package org.alvarowau.service;

import org.alvarowau.model.dto.CourseRequestPost;
import org.alvarowau.model.dto.CourseResponsePost;

import java.util.List;

public interface CourseService {

    CourseResponsePost createCourse(CourseRequestPost courseRequestPost);
    List<CourseResponsePost> getAllCourses();
}
