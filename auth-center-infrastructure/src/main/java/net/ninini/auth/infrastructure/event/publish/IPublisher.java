package net.ninini.auth.infrastructure.event.publish;

import net.ninini.auth.infrastructure.event.Event;

/**
 * @ClassName: IPublisher
 * @ProjectName authentication
 * @Description: todo
 * @Author HanYu
 * @Date 2021/6/27 23:20
 * @Version 1.0.0
 */
public interface IPublisher {

    void publish(Event<?>... events);
}
