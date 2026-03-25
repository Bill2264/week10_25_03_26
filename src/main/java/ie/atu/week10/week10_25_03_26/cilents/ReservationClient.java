package ie.atu.week10.week10_25_03_26.cilents;

import ie.atu.week10.week10_25_03_26.model.Reservation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="reservation-service", url="http://localhost:8080")
public interface ReservationClient {

    @GetMapping("/Reservation/{id}")
    Reservation getReservation(@PathVariable Long id);
}
