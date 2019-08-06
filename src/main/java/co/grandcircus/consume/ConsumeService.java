package co.grandcircus.consume;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.consume.model.CompleteResponse;
import co.grandcircus.consume.model.TinyResponse;

@Component
public class ConsumeService {

	private RestTemplate restTemplate;
	
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public TinyResponse getTiny() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json?sort=key1,key2,key3:asc";
		TinyResponse response = restTemplate.getForObject(url, TinyResponse.class);
		return response;
	}
	
	public CompleteResponse getComplete() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json?sort=key1,key2,key3,key4:asc";
		CompleteResponse response = restTemplate.getForObject(url, CompleteResponse.class);
		return response;
	}
}
