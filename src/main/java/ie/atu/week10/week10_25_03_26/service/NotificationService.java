package ie.atu.week10.week10_25_03_26.service;

import ie.atu.week10.week10_25_03_26.cilents.ReservationClient;
import ie.atu.week10.week10_25_03_26.model.Notification;
import ie.atu.week10.week10_25_03_26.model.Reservation;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
public class NotificationService {
    private final ReservationClient reservationClient;

    public NotificationService(ReservationClient reservationClient){
        this.reservationClient = reservationClient;
    }

    public Notification createNotification(long reservationID)
    {
        Reservation reservation = reservationClient.getReservation(reservationID);
        Notification notification = new Notification();
        notification.setNotificationID(reservation.getReservationID());
        notification.setStudentEmail(reservation.getStudentEmail());
        notification.setEquipmentTag(reservation.getEquipmentTag());
        notification.setNotificationDate(LocalDate.now());

        return notification;

    }
}
