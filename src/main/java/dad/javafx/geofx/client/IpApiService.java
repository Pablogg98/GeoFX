package dad.javafx.geofx.client;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import dad.javafx.geofx.client.json.Raiz;

public class IpApiService {

	public IpApiService() {
		Unirest.setObjectMapper(new UnirestObjectMapper());
	}

	public Raiz listRaiz() throws IpApiServiceException {
		try {
			Raiz raiz = Unirest.get("http://api.ipapi.com/check?access_key=8821b46213c0bd6a36125fb2cd2a95c7&format=1").asObject(Raiz.class)
					.getBody();

			return raiz;
		} catch (UnirestException e) {
			throw new IpApiServiceException();
		}
	}
	
	public Raiz listRaizIp(String ip) throws IpApiServiceException {
		try {
			Raiz raiz = Unirest.get("http://api.ipapi.com/"+ip+"?access_key=8821b46213c0bd6a36125fb2cd2a95c7").asObject(Raiz.class)
					.getBody();
			return raiz;
		} catch (UnirestException e) {
			throw new IpApiServiceException();
		}
	}


}
