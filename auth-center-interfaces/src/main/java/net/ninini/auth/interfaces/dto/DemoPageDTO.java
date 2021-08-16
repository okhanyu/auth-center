package net.ninini.auth.interfaces.dto;

import lombok.Data;
import net.ninini.auth.infrastructure.page.PageDTO;

import javax.validation.Valid;

/**
 * @ClassName: DemoPageDto
 * @ProjectName authentication
 * @Description: todo
 * @Author HanYu
 * @Date 2021/6/30 17:52
 * @Version 1.0.0
 */
@Data
public class DemoPageDTO {

    @Valid
    DemoDTO demoDTO;

    PageDTO pageDTO;
}
