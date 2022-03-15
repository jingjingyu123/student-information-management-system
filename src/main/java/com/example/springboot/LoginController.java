package com.example.springboot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	private static final Logger logger = LogManager.getLogger(LoginController.class);

	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
		if ("students".equals(username) && "tartans".equals(password)) {
			return "Welcome!";
		}
		logger.error(username);
		return "Invalid Login";
	}
}
