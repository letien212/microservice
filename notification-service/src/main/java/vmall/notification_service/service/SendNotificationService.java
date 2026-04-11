package vmall.notification_service.service;

import vmall.notification_service.dto.SendNotificationRequest;

public interface SendNotificationService {
    void sendNotification(SendNotificationRequest request);
}
