package firstREST;

import java.io.IOException;

import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

public class HelloWorld extends ServerResource{

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Create the HTTP server and listen on port 8088  
		new Server(Protocol.HTTP, 8088, HelloWorld.class).start();
	}
 
	@Get
	public String present() throws ResourceException, IOException{
		return "hello, world Great, here we are";
	}
}