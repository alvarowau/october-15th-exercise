package org.alvarowau.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseResponsePost {
    private Long id;
    private String courseName;
    private String instructorName;
    private LocalDate startDate;
    private Integer durationInWeeks;
}
