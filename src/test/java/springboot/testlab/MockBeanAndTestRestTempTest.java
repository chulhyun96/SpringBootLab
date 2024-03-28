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
    @MockBean
    SampleTestService mockSampleTestService;

    @Test
    public void hello() throws Exception {
        when(mockSampleTestService.getName()).thenReturn("Studying me");
        String result = testRestTemplate.getForObject("/hello", String.class);
        Assertions.assertThat(result).isEqualTo("Hello Studying me");
    }
}
