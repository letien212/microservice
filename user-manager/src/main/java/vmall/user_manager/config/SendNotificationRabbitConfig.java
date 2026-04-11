package vmall.user_manager.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SendNotificationRabbitConfig {
    @Value("${queue.notification.routing-key}")
    private String routingKey;

    @Value("${queue.notification.queue}")
    private String queueName;

    @Value("${queue.notification.exchange}")
    private String exchangeName;

    @Bean
    DirectExchange sendEmailExchange() {
        return new DirectExchange(exchangeName);
    }

    @Bean
    public Queue sendEmailQueue() {
        return QueueBuilder.durable(queueName).build();
    }

    @Bean
    Binding emailQueueBinding(Queue sendEmailQueue,
                              DirectExchange sendEmailExchange) {
        return BindingBuilder
                .bind(sendEmailQueue)
                .to(sendEmailExchange)
                .with(routingKey);
    }
}
