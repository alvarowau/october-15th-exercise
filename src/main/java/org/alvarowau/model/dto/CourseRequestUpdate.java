package org.alvarowau.model.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseRequestUpdate {
    @NotBlank(message = "El nombre del instructor no debe estar vacío ni en blanco")
    private String instructorName;

    @NotNull(message = "La fecha de inicio debe ser proporcionada")
    @FutureOrPresent(message = "La fecha de inicio no puede ser en el pasado")
    private LocalDate startDate;

    @NotNull(message = "La duración en semanas debe ser proporcionada")
    @Min(value = 1, message = "La duración en semanas debe ser mayor a 0")
    private Integer durationInWeeks;

}
