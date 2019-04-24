package micronaut.graal.demo;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/saludo")
public class SaludoController {

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String base() {
        return "Saludos banda desde GraalVM";
    }
}
