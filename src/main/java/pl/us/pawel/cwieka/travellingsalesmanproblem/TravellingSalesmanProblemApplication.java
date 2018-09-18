package pl.us.pawel.cwieka.travellingsalesmanproblem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class TravellingSalesmanProblemApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TravellingSalesmanProblemApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TravellingSalesmanProblemApplication.class);
	}
}
