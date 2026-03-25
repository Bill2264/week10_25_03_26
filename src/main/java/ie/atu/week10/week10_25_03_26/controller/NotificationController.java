package ie.atu.week10.week10_25_03_26.controller;

import ie.atu.week10.week10_25_03_26.model.Notification;
import ie.atu.week10.week10_25_03_26.model.NotificationRecord;
import ie.atu.week10.week10_25_03_26.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/notifications")
public class NotificationController {
    public final NotificationService notificationService;
    public NotificationController(NotificationService notificationService)
    {this.notificationService = notificationService;}

    @GetMapping("/{id}")
    public ResponseEntity<Notification> getById(@PathVariable Long id)
    {
        return ResponseEntity.ok(notificationService.getNotification(id));
    }

    @GetMapping("/Record/{id}")
    public ResponseEntity<NotificationRecord> addNotificationRecord(@PathVariable Long id)
    {
        return ResponseEntity.ok(notificationService.createNotificationRecord(id));
    }
    @GetMapping("/Recorded")
    public  ResponseEntity<List<NotificationRecord>> getAllNotificationRecords()
    {return ResponseEntity.ok(notificationService.getAllNotificationRecords());}
}
