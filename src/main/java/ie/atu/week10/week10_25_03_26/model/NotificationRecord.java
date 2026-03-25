package ie.atu.week10.week10_25_03_26.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
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
@Entity
public class NotificationRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long notificationID;

    private long reservationId;

    @NotBlank(message = "equipmentTag is required")
    private String equipmentTag;
    @NotBlank(message = "email is required")
    @Email(message = "must be valid email")
    private String studentEmail;
    private LocalDate notificationDate;

    private boolean notificationStatus;
}


