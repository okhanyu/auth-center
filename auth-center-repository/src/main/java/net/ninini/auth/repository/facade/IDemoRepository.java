package net.ninini.auth.repository.facade;

import net.ninini.auth.infrastructure.page.PageDTO;
import net.ninini.auth.infrastructure.page.PageData;
import net.ninini.auth.repository.po.DemoPO;

/**
 * @ClassName: DemoRespository
 * @ProjectName authentication
 * @Description: todo
 * @Author HanYu
 * @Date 2021/6/28 14:43
 * @Version 1.0.0
 */
public interface IDemoRepository {

    PageData<DemoPO> getDemoByPage(PageDTO pageDTO, DemoPO demoPO);

    PageData<DemoPO> getDemoByWrapper(PageDTO pageDTO, DemoPO demoPO);

    int saveDemo(DemoPO demoPO);
}
