package vmall.notification_service.configs;


import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;

@Configuration
public class RabbitMQConfig {
    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory(
            ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConcurrentConsumers(3);
        factory.setMaxConcurrentConsumers(3);
        factory.setConnectionFactory(connectionFactory);
        factory.setMessageConverter(new JacksonJsonMessageConverter());

        return factory;
    }
}
