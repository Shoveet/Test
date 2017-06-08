import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;

@Path("/demo")
public class Demo {

	@GET
	@Path("/demoget/{age}")
	@Produces(MediaType.TEXT_HTML)
	public String demoget(@PathParam("age") int age, @QueryParam("boolabc") boolean abc , @HeaderParam("Host") String client)
	{
		System.out.println("Hello");
		return "Hello Shoveet ur age is " +age + "and u r " + abc + "Client is " +client;
	}
}
