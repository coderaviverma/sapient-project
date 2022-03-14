package com.coderaviverma.Sapient.Project.webclient;

import org.springframework.web.client.RestTemplate;

public class WebClientFactory {
	
	public static RestWebClient createRestClient() {
		return new RestWebClient(new RestTemplate());
	}
}
