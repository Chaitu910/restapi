package restAPIs;
import java.util.*;
public class catchtoken<T> {
	 String token="eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJ1c2VyX2lkIjo1LCJ1c2VybmFtZSI6IlVKRE5BWE0iLCJleHAiOjE2NjY2Mjk5NjIsImVtYWlsIjoiYmhhbnUucHJha2FzaCsxQGxqaS5pbyIsIm9yaWdfaWF0IjoxNjY2NjE1NTYyLCJhY2Nlc3NfbWFzayI6NjIsInByb2dyYW1faWQiOjI2MCwiZXhwX21zIjoxNjY2NjI5OTYyNzg5LCJyb2xlX2lkIjoxLCJhY2Nlc3NfbGV2ZWwiOiJQcm9ncmFtIn0.E8HxYLg9XDmn2Z8eIQRZLKwFuKqektscLF7xsFFEYFUrFPfNpu1qIAfZp8U2mxDAvtEqSOXbHQ2fW9FSI7m1Jv6Eo1zCzbYaD5YCqe99EL4z7LoE9WXXOAAGrE2Ghs3nXeQOQzljXPjIB_JQWOxKlDaGcRtfbgUB6bA0oGKoJHSiZQFnUr_4yFs4V1c74e_mWcSVLlBYoKqAIJWBuGPdGhZb_iA7kLzrR5ogiw0dJmKC8dj4-hTMOL_OEeoZKedx4iL_rm4KbCkYrT9rBm_xVF8EYCiMwz-RqWzdIlFjcyKAVM-v1YwZG5nbwdAJSNGpduU2aepl_l76z5n4a2om_Q"
	public static final int TIME_OUT = 400 * 1000;
	LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
	protected boolean removeEldestEntry(Map.Entry <String>,<> eldest) {
        final long time = System.currentTimeMillis();
        if( time - eldest.getValue().time > TIME_OUT) {
            Iterator<Objects> i = values().iterator();

            i.next();
            do {
                i.remove();
            } while( i.hasNext() && time - i.next().time > TIME_OUT );
        }
        return false;
	}
	public static void main(String[] args) {
		 {       
	        }
	    };
	}

