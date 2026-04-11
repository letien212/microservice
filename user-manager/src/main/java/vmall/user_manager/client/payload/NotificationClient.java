package vmall.user_manager.client.payload;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.loadbalancer.FeignBlockingLoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import vmall.user_manager.client.payload.request.SendNotificationRequest;


@FeignClient(
        name = "notification-service"
)
public interface NotificationClient {

    @PostMapping(value = "/api/v1/notifications")
    ResponseEntity<Void> sendNotification(@RequestBody SendNotificationRequest request);
}
