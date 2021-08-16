package net.ninini.auth.interfaces.application.event;

import lombok.extern.slf4j.Slf4j;
import net.ninini.auth.infrastructure.event.Event;
import net.ninini.auth.infrastructure.event.subscribe.DefaultSubscriber;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @ClassName: DemoSubscriber
 * @ProjectName authentication
 * @Description: todo
 * @Author HanYu
 * @Date 2021/7/5 20:29
 * @Version 1.0.0
 */

@Component
@Slf4j
public class DemoSubscriber extends DefaultSubscriber {

    @PostConstruct
    public void register(){
        log.info("注册自己");
        bus.subscribe(this);
    }

    @Override
    public void onMessage(Event event) {
        log.info("订阅者收到消息 {}",event.getValue());
    }

}
