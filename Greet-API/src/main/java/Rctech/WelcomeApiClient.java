package Rctech;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Welcome-API")
public interface WelcomeApiClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomemsg();

}
