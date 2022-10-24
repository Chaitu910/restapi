package restAPIs;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
public class login {
	public static void main(String args[]) {
		String body = "{\r\n"
				+ "  \"username\": \"bhanu.prakash+1@lji.io\",\r\n"
				+ "  \"password\": \"Testing@123\"\r\n"
				+ "}\r\n"
				+ "";
	HttpRequest logReq = null;
	try {
		 logReq = HttpRequest.newBuilder()
				 .uri(new URI("https://api.gravtee.com/v1/login/?basic_info=true"))
				 .header("x-api-key", "JgxrFqZvkD4fcTX7vgMOX1L1i58TkM65qkLfijj0")
				 .POST(BodyPublishers.ofString(body))
				 .build();
	}
	catch (URISyntaxException e) {
		e.printStackTrace();
	}
	
	HttpResponse<String> log = null;
		HttpClient httpclient = HttpClient.newHttpClient();
		try {
			log = httpclient.send(logReq, BodyHandlers.ofString());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(log.body());
		System.out.println(log.statusCode());
		
	}
    }