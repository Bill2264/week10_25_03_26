package ie.atu.week10.week10_25_03_26.repository;

import ie.atu.week10.week10_25_03_26.model.NotificationRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepo extends JpaRepository<NotificationRecord,Long> {
}
