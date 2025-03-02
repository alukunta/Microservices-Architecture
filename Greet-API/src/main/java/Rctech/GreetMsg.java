package Rctech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetMsg {
	
	@Autowired
	private WelcomeApiClient welcomeApiClient;

	@GetMapping("/greet")
	public String msg() {
		String welcomemsg = welcomeApiClient.invokeWelcomemsg();
		String greetMsg = "How are you";
		return greetMsg.concat(welcomemsg);
	}
}
