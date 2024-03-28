package springboot.testlab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleTestController.class)
public class WebMvcControllerTest {
    @MockBean
    SampleTestService mockSampleService;

    @Autowired
    MockMvc mockMvc;
    @Test
    public void hello() throws Exception {
        when(mockSampleService.getName()).thenReturn("hello");
        mockMvc.perform(get("/hello"))
                .andExpect(content().string("Hello hello"));
    }
}
