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
		String token= "JWT eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJ1c2VyX2lkIjo1LCJ1c2VybmFtZSI6IlVKRE5BWE0iLCJleHAiOjE2NjY2NDg1MTQsImVtYWlsIjoiYmhhbnUucHJha2FzaCsxQGxqaS5pbyIsIm9yaWdfaWF0IjoxNjY2NjM0MTE0LCJhY2Nlc3NfbWFzayI6NjIsInByb2dyYW1faWQiOjI2MCwiZXhwX21zIjoxNjY2NjQ4NTE0MjQ0LCJyb2xlX2lkIjoxLCJhY2Nlc3NfbGV2ZWwiOiJQcm9ncmFtIn0.A2M-iSNIM6sV0xK_ndnN88B4zjFdsKk-O6-Opnet9iG70vElCqD26Aq0E-_Uqci5BP4tKiZ7985blR1RZ-wq7SALiYHT9f1DdfXAqF6uqC9DQWgtnVYFG3I3s16OjsRlfotY8SOPl4r2P9fUZsdK0_mUgcvrs_CXoEaQUw8HAuwb4foP0LpR3x1UYumer4X87apwyPrJlqVQqvddOk6YKvpuU_KBEm1wKwufQnyiD5Yc-zM9v7Dszs2DRnuhFZT-09R4UiA0g9Ete9joobgzQAVABwaaREhDHs2l8XxarJy00u8_1Rjo6e1IH-pbJbmu6B2VuZSDEtoXizP5fd0ZIQ";
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
