package restAPIs;
import java.util.Map;
public class catchex2 <K,V>{
	Long timeout;
    private static class MapValue<V> {
        private Long timeOut;
        private V v;
        public MapValue(Long timeout, V v) {
            this.timeOut = timeout;
            this.v = v;
        }
		public Long getTimeOut() {
			// TODO Auto-generated method stub
			return null;
		}
		public V getV() {
			// TODO Auto-generated method stub
			return null;
		}
    }
   /* public TimeOutCacheMap(Long timeoutInMilliSeconds, Class<? extends Map> mapClazz) {
        if (timeoutInMilliSeconds > 5000000) {
            throw new RuntimeException("Timeout can be upto 5000000");
        }
        this.timeout = timeoutInMilliSeconds;
        try {
            map = mapClazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/

    private Map<K, MapValue<V>> map;
    public V put(K k, V v) {
        if (k == null) {
            throw new RuntimeException("Invalid key");
        }
        Long currentTime = System.currentTimeMillis();
        Long timeOutValue = currentTime + this.timeout;
        MapValue<V> newV = new MapValue<V>(timeOutValue, v);
        MapValue<V> oldV = map.put(k, newV);
        return ((oldV == null) ? null : oldV.getV());
    }
    public V get(String token) {
        if (token == null) {
            throw new RuntimeException("Invalid key");
        }
        Long currentTime = System.currentTimeMillis();
        MapValue<V> mapValue = map.get(token);
        if (mapValue!=null &&  mapValue.getTimeOut() != null && mapValue.getTimeOut() >= currentTime) {
            return mapValue.getV();
        } else {
            map.remove(token);
            return null;
        }
    }
	public static void main(String[] args) {
		catchex2 n=new catchex2();
		
		String token="JWT eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJ1c2VyX2lkIjo1LCJ1c2VybmFtZSI6IlVKRE5BWE0iLCJleHAiOjE2NjY2MzEzODYsImVtYWlsIjoiYmhhbnUucHJha2FzaCsxQGxqaS5pbyIsIm9yaWdfaWF0IjoxNjY2NjE2OTg2LCJhY2Nlc3NfbWFzayI6NjIsInByb2dyYW1faWQiOjI2MCwiZXhwX21zIjoxNjY2NjMxMzg2Nzc3LCJyb2xlX2lkIjoxLCJhY2Nlc3NfbGV2ZWwiOiJQcm9ncmFtIn0.PTzdZH6Xk-owinvySnz-cDuvkW-PdS61wTxD3IMkETSbPptQYHOK8HGlnLYgn8iOYuoJCAvJPo9nySRuU_mD3vZq3ZoMQUd-_ElzivRXbf25AiegAs8656YeIEJEU0DzuUFGGHZFUrr9PIEfFEPWsqfi7cq50VqmHMlBiCh2XTz-hbx2owudUbAqVMWNaNhrmyubf8IUgGIwKJc4u7iQ5jnYx6HxYMpaYDhqXWy_m5Xt1D0PrFmyw7kp-R3BbiB3tzIm5SPTare7WdKJl_ytUsqs6vWIaFazkU1mIVEjylV65tbdLwMNwtawRdNqh_kHy6H0Y2_ALTkjAb3S63XGgw";
		n.get(token);
		System.out.println(n.get(token));
	}

}
