package ets;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLConClient {

	public static void main(String[] args) throws IOException {
		URL restURL = new URL("http://localhost:8080/SimpleRS/jax/rs/add/5/6");
		HttpURLConnection connection = (HttpURLConnection) restURL.openConnection();

		connection.setReadTimeout(100);

		// readFrom(connection);

		connection.disconnect();
	}
}