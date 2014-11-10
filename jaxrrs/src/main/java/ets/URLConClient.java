package ets;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.sun.research.ws.wadl.HTTPMethods;

public class URLConClient {

	public static void main(String[] args) throws IOException {
		URL restURL = new URL("http://localhost:8080/SimpleRS/jax/rs/add/5/6");
		HttpURLConnection con = (HttpURLConnection) restURL.openConnection();

		con.setReadTimeout(100);
		con.setAllowUserInteraction(true);
		con.setDoInput(true);
		con.setDoOutput(true);
		con.setRequestMethod(HTTPMethods.GET.toString());
		con.setUseCaches(true);
		
		
		// readFrom(con);

		con.disconnect();
	}
}