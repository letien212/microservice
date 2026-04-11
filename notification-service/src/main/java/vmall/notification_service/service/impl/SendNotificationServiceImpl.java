package vmall.notification_service.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vmall.notification_service.dto.SendNotificationRequest;
import vmall.notification_service.service.SendNotificationService;


@Service
@Slf4j
public class SendNotificationServiceImpl implements SendNotificationService {
    @Override
    public void sendNotification(SendNotificationRequest request) {
        log.info("(sendNotification)Send notification request: {}",
                request);
    }
}
