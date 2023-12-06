package br.com.mp.quarkusmovie.resources.restclient;


import br.com.mp.quarkusmovie.resources.restclient.model.MovieIMDB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.HeaderParam;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

@RegisterRestClient(configKey="restclient-imdb-api")
@Produces(MediaType.APPLICATION_JSON)
public interface IMDBAPIRestClient {
    @GET
    @Path("/auto-complete")
    MovieIMDB search(@HeaderParam("x-rapidapi-key") String xRapidapiKey,
                     @HeaderParam("x-rapidapi-host") String xRapidapiHost,
                     @QueryParam("q") String query);
}