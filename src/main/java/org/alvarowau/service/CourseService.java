package org.alvarowau.service;

import org.alvarowau.model.dto.CourseRequestPost;
import org.alvarowau.model.dto.CourseResponsePost;

public interface CourseService {

    CourseResponsePost createCourse(CourseRequestPost courseRequestPost);
}
