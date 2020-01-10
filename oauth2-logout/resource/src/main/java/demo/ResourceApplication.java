package demo;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableResourceServer
public class ResourceApplication {

	@RequestMapping("/")
	public TextMessage home() {
		return new TextMessage("Hello World");
	}

	public static void main(String[] args) {
		SpringApplication.run(ResourceApplication.class, args);
	}

}

class TextMessage {
	private String id = UUID.randomUUID().toString();
	private String content;

	TextMessage() {
	}

	public TextMessage(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
