package springboot.exceptionhandler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    @GetMapping(value = "/hello")
    public String hello() {
        throw new SampleException("모름");
    }
    @ExceptionHandler(SampleException.class)
    @ResponseBody
    public AppError sampleError(SampleException e) {
        AppError appError = new AppError();
        appError.setMessage("SampleException has been thrown with the message: " + e.getMessage());
        appError.setReason("A detailed reason should go here"); // -> provide information here
        return appError;
    }
}
