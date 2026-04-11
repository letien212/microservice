package vmall.notification_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vmall.notification_service.dto.SendNotificationRequest;
import vmall.notification_service.service.SendNotificationService;


@RequestMapping(value = "/api/v1/notifications")
@RestController
@RequiredArgsConstructor
public class NotificationController {
    private final SendNotificationService service;

    @PostMapping
    public ResponseEntity<Void> sendNotification(@RequestBody SendNotificationRequest request) {
        service.sendNotification(request);
        return ResponseEntity.noContent().build();
    }
}
