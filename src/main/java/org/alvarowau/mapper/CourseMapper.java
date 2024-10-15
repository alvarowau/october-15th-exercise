package org.alvarowau.mapper;

import org.alvarowau.model.dto.CourseRequestPost;
import org.alvarowau.model.dto.CourseRequestUpdate;
import org.alvarowau.model.dto.CourseResponsePost;
import org.alvarowau.model.entity.Course;

public class CourseMapper {

    public static Course toCourse(CourseRequestPost post) {
        return Course.builder()
                .courseName(post.getCourseName())
                .instructorName(post.getInstructorName())
                .startDate(post.getStartDate())
                .durationInWeeks(post.getDurationInWeeks())
                .build();
    }

    public static CourseResponsePost toCourseResponsePost(Course course) {
        return CourseResponsePost.builder()
                .id(course.getId())
                .courseName(course.getCourseName())
                .instructorName(course.getInstructorName())
                .startDate(course.getStartDate())
                .durationInWeeks(course.getDurationInWeeks())
                .build();
    }

    public static Course toCourseOfCourseRequestUpdate(Long id, CourseRequestUpdate update) {
        return Course.builder()
                .id(id)
                .instructorName(update.getInstructorName())
                .startDate(update.getStartDate())
                .durationInWeeks(update.getDurationInWeeks())
                .build();
    }
}
