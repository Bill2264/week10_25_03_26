package ie.atu.week10.week10_25_03_26.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    private Long reservationID;
    @NotBlank(message = "equipmentTag is required")
    private String equipmentTag;
    @NotBlank(message = "email is required")
    @Email(message = "must be valid email")
    private String studentEmail;
    private LocalDate reservationDate;
    @Min(value = 0, message = "Start Hour must be 0 or greater")
    @Max(value = 23, message = "Start Hour must be 23 or less")
    private int startHour;
    @Min(value = 1, message = " Duration must be 1 or greater")
    @Max(value = 24, message = "Duration Hour must be 24 or less")
    private int durationHour;
}

