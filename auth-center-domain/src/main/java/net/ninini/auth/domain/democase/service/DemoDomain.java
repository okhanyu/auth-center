package net.ninini.auth.domain.democase.service;

import net.ninini.auth.domain.democase.entity.bo.DemoBO;
import net.ninini.auth.infrastructure.page.PageDTO;
import net.ninini.auth.infrastructure.page.PageData;

/**
 * @ClassName: DemoDomain
 * @ProjectName authentication
 * @Description: todo
 * @Author HanYu
 * @Date 2021/6/25 18:08
 * @Version 1.0.0
 */
public interface DemoDomain {

    PageData<DemoBO> startDemo(PageDTO page , DemoBO demoBO);
}
