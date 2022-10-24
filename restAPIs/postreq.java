package restAPIs;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

public class postreq {

	public static void main(String[] args) {
		
		String token="JWT eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJ1c2VyX2lkIjo1LCJ1c2VybmFtZSI6IlVKRE5BWE0iLCJleHAiOjE2NjYzNTg4NTksImVtYWlsIjoiYmhhbnUucHJha2FzaCsxQGxqaS5pbyIsIm9yaWdfaWF0IjoxNjY2MzQ0NDU5LCJhY2Nlc3NfbWFzayI6NjIsInByb2dyYW1faWQiOjI2MCwiZXhwX21zIjoxNjY2MzU4ODU5OTEzLCJyb2xlX2lkIjoxLCJhY2Nlc3NfbGV2ZWwiOiJQcm9ncmFtIn0.I8AuY7qvQ9tXQ0QyXky87BRoYQZPtyGnvlTil-j_wTj1PJY0UZsPtzp3wIIHMa6Su1alPwTPqI1BOrfdlbhCnNOznCfhij7lYASMldp8gjMwx_aA7dc53VfNuBtsMJ274gVyEonQWqBMpLNSnWSyfJs5eiGJCWxQ1FfTWLC-UNJ9IhS1lFmu0df1CtI6rxydy050pCSsbn1jxWEjofx3uneM2woIpb6GhnmmJ35MyxX4_TAS64BBiqhzPvTqH4NRxuo9ufFCjVjrKXBqxVjfG-ztWMHNDSR91v6dPZPFfb4O4r8gUhGMXHTpEUrgPHOfX5RQPshlpCr3E464UsPRCg";
		String body= "{\r\n"
				+ "  \"user\": {\r\n"
				+ "    \"email\": \"ljichai@gmail.com\",\r\n"
				+ "    \"first_name\": \"chai\",\r\n"
				+ "    \"last_name\": \"tanya\"\r\n"
				+ "  },\r\n"
				+ "  \"profile_image\": null,\r\n"
				+ "  \"salutation\": null,\r\n"
				+ "  \"member_name\": null,\r\n"
				+ "  \"middle_name\": \"sdk\",\r\n"
				+ "  \"alias\": null,\r\n"
				+ "  \"date_of_birth\": null,\r\n"
				+ "  \"gender\": null,\r\n"
				+ "  \"marital_status\": null,\r\n"
				+ "  \"wedding_anniversary\": null,\r\n"
				+ "  \"number_of_children\": null,\r\n"
				+ "  \"mother_tongue\": null,\r\n"
				+ "  \"nationality\": null,\r\n"
				+ "  \"pin\": null,\r\n"
				+ "  \"passport_number\": null,\r\n"
				+ "  \"creditcard_number\": \"1111111111111111\",\r\n"
				+ "  \"mobile\": \"9100336658\",\r\n"
				+ "  \"address_line1\": null,\r\n"
				+ "  \"address_line2\": null,\r\n"
				+ "  \"area\": null,\r\n"
				+ "  \"city\": null,\r\n"
				+ "  \"region\": null,\r\n"
				+ "  \"zipcode\": null,\r\n"
				+ "  \"country\": null,\r\n"
				+ "  \"ethnicity\": null,\r\n"
				+ "  \"annual_income\": null,\r\n"
				+ "  \"highest_education\": null,\r\n"
				+ "  \"company\": null,\r\n"
				+ "  \"job_title\": null,\r\n"
				+ "  \"favorite_store\": null,\r\n"
				+ "  \"favorite_restaurant\": null,\r\n"
				+ "  \"mode_of_communication\": null,\r\n"
				+ "  \"food_preference\": null,\r\n"
				+ "  \"favorite_drink\": null,\r\n"
				+ "  \"favorite_sport\": null,\r\n"
				+ "  \"favorite_food\": null,\r\n"
				+ "  \"hobbies\": null,\r\n"
				+ "  \"enrollment_touchpoint\": null,\r\n"
				+ "  \"enrolling_sponsor\": 1,\r\n"
				+ "  \"enrolling_location\": null,\r\n"
				+ "  \"preferred_location\": null,\r\n"
				+ "  \"associate_id\": null,\r\n"
				+ "  \"facebook_id\": null,\r\n"
				+ "  \"twitter_id\": null,\r\n"
				+ "  \"receive_offers\": true,\r\n"
				+ "  \"membership_tenure\": 0,\r\n"
				+ "  \"extra_data\": {}\r\n"
				+ "}";
		HttpRequest loginRequest = null;
		try {
			 loginRequest = HttpRequest.newBuilder()
					 .uri(new URI("https://api.gravtee.com/v1/members/"))
					 .headers("Authorization",token,"x-api-key", "JgxrFqZvkD4fcTX7vgMOX1L1i58TkM65qkLfijj0")
					 .POST(BodyPublishers.ofString(body))
					 .build();
		}
		catch (URISyntaxException e) {
			e.printStackTrace();
		}
		HttpResponse<String> membercreate = null;
		HttpClient httpclient = HttpClient.newHttpClient();
		try {
			membercreate = httpclient.send(loginRequest, BodyHandlers.ofString());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(membercreate.body());
		System.out.println(membercreate.statusCode());
	}
	

}
