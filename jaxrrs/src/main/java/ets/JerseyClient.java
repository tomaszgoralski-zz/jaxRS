package ets;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class JerseyClient {
	public static void main(String[] args) {
		Client cl = Client.create();
		WebResource webResource = cl.resource("http://localhost:8081/SimpleRS/math/table/post");
		String entity = "5";
		String response = webResource.accept("text/plain").entity(entity, "application/x-www-form-urlencoded").post(String.class);
		System.out.println(response.toString());
	}
}
