package net.ninini.auth.interfaces.application;

import net.ninini.auth.domain.democase.entity.bo.DemoBO;
import net.ninini.auth.domain.democase.service.DemoDomain;
import net.ninini.auth.infrastructure.event.Event;
import net.ninini.auth.infrastructure.event.EventChannel;
import net.ninini.auth.infrastructure.event.publish.DefaultPublisher;
import net.ninini.auth.infrastructure.mq.publisher.MQPublisher;
import net.ninini.auth.infrastructure.page.PageDTO;
import net.ninini.auth.infrastructure.page.PageData;
import net.ninini.auth.interfaces.assembler.DemoAssembler;
import net.ninini.auth.interfaces.dto.DemoDTO;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName: DemoApplication
 * @ProjectName authentication
 * @Description: todo 演示
 * @Author HanYu
 * @Date 2021/6/25 13:08
 * @Version 1.0.0
 */
@Component
@Slf4j
public class DemoApplication {

    DemoDomain demoDomain;

    @Resource(name = "defaultPublisher")
    DefaultPublisher defaultPublisher;

    @Autowired
    MQPublisher mqPublisher;

    @Autowired
    public DemoApplication(DemoDomain demoDomain) {
        this.demoDomain = demoDomain;
    }

    public PageData<DemoBO> demoApplicationFunc(PageDTO pageDTO, DemoDTO demoDTO) {
        PageData<DemoBO> demoBOs = demoDomain.startDemo(pageDTO, DemoAssembler.dtoToBO(demoDTO));
        defaultPublisher.publish(
                new Event<String>().builder()
                .messageChannel(EventChannel.rocket)
                .messageId(UUID.randomUUID().toString())
                .messageTopic("test")
                .value("我是订阅发布消息1").build(),
                new Event<String>().builder()
                .messageChannel(EventChannel.kafka)
                .messageId(UUID.randomUUID().toString())
                .messageTopic("test")
                .value("我是订阅发布消息2").build()
        );
        mqPublisher.publish( new Event<String>().builder()
                        .messageChannel(EventChannel.rocket)
                        .messageId(UUID.randomUUID().toString())
                        .messageTopic("test")
                        .value("我是rocket全流程测试消息").build(),
                new Event<String>().builder()
                        .messageChannel(EventChannel.kafka)
                        .messageId(UUID.randomUUID().toString())
                        .messageTopic("test")
                        .value("我是kafka全流程测试消息").build());
        return demoBOs;
    }
}
