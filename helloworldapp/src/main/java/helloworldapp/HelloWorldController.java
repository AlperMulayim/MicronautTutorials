package helloworldapp;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller
public class HelloWorldController {
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    String helloWorld(){
        return "Hello World Micronaut";
    }
}
