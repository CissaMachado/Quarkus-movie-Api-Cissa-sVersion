package br.com.mp.quarkusmovie.resources.openapi;

import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@OpenAPIDefinition(
        tags = {
                @Tag(name = "movie", description = "Movies and Series"),
        },
        info = @Info(
                title = "Quarkus Movie API",
                version = "1.0.0",
                contact = @Contact(
                        name = "Cissa's Version- Quarkus Movie API Support",
                        url = "http://quarkusmovie-api.com/contact",
                        email = "contact@example.com"),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html"))
)
public class QuarkusMovieOpenAPI extends Application {
}
