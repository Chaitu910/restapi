package restAPIs;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.*;

public class accural {

	public static void main(String[] args) {
		String token="JWT eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJ1c2VyX2lkIjo1LCJ1c2VybmFtZSI6IlVKRE5BWE0iLCJleHAiOjE2NjYzNTg4NTksImVtYWlsIjoiYmhhbnUucHJha2FzaCsxQGxqaS5pbyIsIm9yaWdfaWF0IjoxNjY2MzQ0NDU5LCJhY2Nlc3NfbWFzayI6NjIsInByb2dyYW1faWQiOjI2MCwiZXhwX21zIjoxNjY2MzU4ODU5OTEzLCJyb2xlX2lkIjoxLCJhY2Nlc3NfbGV2ZWwiOiJQcm9ncmFtIn0.I8AuY7qvQ9tXQ0QyXky87BRoYQZPtyGnvlTil-j_wTj1PJY0UZsPtzp3wIIHMa6Su1alPwTPqI1BOrfdlbhCnNOznCfhij7lYASMldp8gjMwx_aA7dc53VfNuBtsMJ274gVyEonQWqBMpLNSnWSyfJs5eiGJCWxQ1FfTWLC-UNJ9IhS1lFmu0df1CtI6rxydy050pCSsbn1jxWEjofx3uneM2woIpb6GhnmmJ35MyxX4_TAS64BBiqhzPvTqH4NRxuo9ufFCjVjrKXBqxVjfG-ztWMHNDSR91v6dPZPFfb4O4r8gUhGMXHTpEUrgPHOfX5RQPshlpCr3E464UsPRCg";
		HttpRequest accuralreq = null;
		String body="{\r\n"
				+ "  \"h_program_id\": 260,\r\n"
				+ "  \"h_sponsor_id\": 1,\r\n"
				+ "  \"h_bit_date\": \"2022-10-20T07:39:12.954+0000\",\r\n"
				+ "  \"h_member_id\": \"3WC8D81\",\r\n"
				+ "  \"h_bit_category\": \"ACCRUAL\",\r\n"
				+ "  \"h_bit_currency\": \"EUR\",\r\n"
				+ "  \"h_bit_amount\": 500,\r\n"
				+ "  \"h_location\": null,\r\n"
				+ "  \"lines\": [\r\n"
				+ "    {\r\n"
				+ "      \"l_product_external_id\": \"skuid1\",\r\n"
				+ "      \"l_quantity\": 1,\r\n"
				+ "      \"l_cost\": 300\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"payment_details\": [\r\n"
				+ "    {\r\n"
				+ "      \"payment_method\": \"CREDIT\",\r\n"
				+ "      \"l_cost\": 500\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		try {
			accuralreq = HttpRequest.newBuilder()
					 .uri(new URI("https://api.gravtee.com/v1/bits/"))
					 .headers("Authorization",token,"x-api-key", "JgxrFqZvkD4fcTX7vgMOX1L1i58TkM65qkLfijj0")
					 .POST(BodyPublishers.ofString(body))
					 .build();
		}
		catch (URISyntaxException e) {
			e.printStackTrace();
		}
		HttpResponse<String> accuraldet = null;
		HttpClient httpclient = HttpClient.newHttpClient();
		try {
			accuraldet = httpclient.send(accuralreq, BodyHandlers.ofString());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(accuraldet.body());
		System.out.println(accuraldet.statusCode());
}
}