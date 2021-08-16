package net.ninini.auth.infrastructure.event.publish;

import net.ninini.auth.infrastructure.event.Event;
import net.ninini.auth.infrastructure.event.bus.DefaultEventBus;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName: DefaultPublisher
 * @ProjectName authentication
 * @Description: todo
 * @Author HanYu
 * @Date 2021/6/28 00:05
 * @Version 1.0.0
 */

@Component("defaultPublisher")
public class DefaultPublisher implements IPublisher {

    @Resource(name = "defaultEventBus")
    DefaultEventBus bus;

    @Override
    public void publish(Event<?>... events) {
        for (Event<?> event :   events) {
            bus.publish(event);
        }
    }

}
