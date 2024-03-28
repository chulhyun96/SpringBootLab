package springboot.testlab;


import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MockBeanAndTestRestTempTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    //내장 톰캣을  사용하여(포트 번호를 겹치지 않게 랜덤으로 받음) 받으면
    // MockBean 애노테이션을 사용할 수 있다. -> 내가 컨트롤러 계층을 테스트 해보고 싶다면
    // @MockBean을 사용하여 모의 객체를 받을 수 있다
    @MockBean
    SampleTestService mockSampleTestService;

    @Test
    public void hello() throws Exception {
        when(mockSampleTestService.getName()).thenReturn("Studying me");
        String result = testRestTemplate.getForObject("/hello", String.class);
        Assertions.assertThat(result).isEqualTo("Hello Studying me");
    }
}
