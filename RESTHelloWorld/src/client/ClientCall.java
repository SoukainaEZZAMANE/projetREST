package client;

import java.io.IOException;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

public class ClientCall {

	public static void main(String []args) {
		ClientResource resource = new ClientResource("http://localhost:8088");
		try {
			resource.get().write(System.out);
			
		} catch (ResourceException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
