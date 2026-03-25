package ie.atu.week10.week10_25_03_26.service;

import ie.atu.week10.week10_25_03_26.cilents.ReservationClient;
import ie.atu.week10.week10_25_03_26.model.Notification;
import ie.atu.week10.week10_25_03_26.model.NotificationRecord;
import ie.atu.week10.week10_25_03_26.model.Reservation;
import ie.atu.week10.week10_25_03_26.repository.NotificationRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class NotificationService {
    private final ReservationClient reservationClient;
    private final NotificationRepo notificationRepo;
    public NotificationService(NotificationRepo notificationRepo,ReservationClient reservationClient) {
        this.notificationRepo = notificationRepo;
        this.reservationClient = reservationClient;
    }

    public Notification getNotification(long reservationID)
    {
        Reservation reservation = reservationClient.getReservation(reservationID);
        Notification notification = new Notification();
        notification.setReservationId(reservation.getReservationID());
        notification.setStudentEmail(reservation.getStudentEmail());
        notification.setEquipmentTag(reservation.getEquipmentTag());
        notification.setNotificationDate(LocalDate.now());

        return notification;

    }
    public NotificationRecord createNotificationRecord(long reservationID)
    {
        Reservation reservation = reservationClient.getReservation(reservationID);
        NotificationRecord notificationRecord = new NotificationRecord();
        notificationRecord.setReservationId(reservation.getReservationID());
        notificationRecord.setStudentEmail(reservation.getStudentEmail());
        notificationRecord.setEquipmentTag(reservation.getEquipmentTag());
        notificationRecord.setNotificationDate(LocalDate.now());

        notificationRepo.save(notificationRecord);
        return notificationRecord;

    }

    public List<NotificationRecord> getAllNotificationRecords()
    {
        return notificationRepo.findAll();
    }
}
