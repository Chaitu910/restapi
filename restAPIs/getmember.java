package restAPIs;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.*;

public class getmember {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String memberid=sc.next();
		String url="https://api.gravtee.com/v1/members/data/"+memberid;
		String token="JWT eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJ1c2VyX2lkIjo1LCJ1c2VybmFtZSI6IlVKRE5BWE0iLCJleHAiOjE2NjYzNTg4NTksImVtYWlsIjoiYmhhbnUucHJha2FzaCsxQGxqaS5pbyIsIm9yaWdfaWF0IjoxNjY2MzQ0NDU5LCJhY2Nlc3NfbWFzayI6NjIsInByb2dyYW1faWQiOjI2MCwiZXhwX21zIjoxNjY2MzU4ODU5OTEzLCJyb2xlX2lkIjoxLCJhY2Nlc3NfbGV2ZWwiOiJQcm9ncmFtIn0.I8AuY7qvQ9tXQ0QyXky87BRoYQZPtyGnvlTil-j_wTj1PJY0UZsPtzp3wIIHMa6Su1alPwTPqI1BOrfdlbhCnNOznCfhij7lYASMldp8gjMwx_aA7dc53VfNuBtsMJ274gVyEonQWqBMpLNSnWSyfJs5eiGJCWxQ1FfTWLC-UNJ9IhS1lFmu0df1CtI6rxydy050pCSsbn1jxWEjofx3uneM2woIpb6GhnmmJ35MyxX4_TAS64BBiqhzPvTqH4NRxuo9ufFCjVjrKXBqxVjfG-ztWMHNDSR91v6dPZPFfb4O4r8gUhGMXHTpEUrgPHOfX5RQPshlpCr3E464UsPRCg";
		HttpRequest httpreq = null;
		try {
			 httpreq = HttpRequest.newBuilder()
					 .uri(new URI(url))
					 .headers("Authorization",token,"x-api-key", "JgxrFqZvkD4fcTX7vgMOX1L1i58TkM65qkLfijj0")
					 .GET()
					 .build();
		}
		catch (URISyntaxException e) {
			e.printStackTrace();
		}
		HttpClient client=HttpClient.newHttpClient();
		HttpResponse<String> getres = null;
		try {
				getres= client.send(httpreq, BodyHandlers.ofString());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(getres.body());
		System.out.println(getres.statusCode());
	}
}
