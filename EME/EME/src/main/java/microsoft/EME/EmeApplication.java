package microsoft.EME;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "microsoft.EME")
public class EmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmeApplication.class, args);
	}

}
