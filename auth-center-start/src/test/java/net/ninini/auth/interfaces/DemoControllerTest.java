package net.ninini.auth.interfaces;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyObject;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @ClassName: DemoTest
 * @ProjectName authentication
 * @Description: todo
 * @Author HanYu
 * @Date 2021/7/6 11:48
 * @Version 1.0.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest()
@AutoConfigureMockMvc
//@WebMvcTest(DemoController.class)
public class DemoControllerTest {

//    @MockBean
//    DemoApplication demoApplication;

//    @Test
//    public void testScore() throws Exception {
//        given(this.demoApplication.demoApplicationFunc(anyObject(), anyObject())).willReturn(null);
//        String jsonStr = "{\"data\":{\"debit_account_balance_code\":40,\"credit_consume_count\":1,\"debit_start_age\":1,\"debit_consume_sum_code\":2,\"age\":38},\"modelProductId\":5}";
//        RequestBuilder requestBuilder = null;
//        requestBuilder = post("/scoreApi/score").contentType(MediaType.APPLICATION_JSON).content(jsonStr);
//        this.mockMvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(MockMvcResultMatchers.content().string("{}"));
//    }






}
