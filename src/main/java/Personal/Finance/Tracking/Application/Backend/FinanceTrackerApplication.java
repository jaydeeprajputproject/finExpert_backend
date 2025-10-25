package Personal.Finance.Tracking.Application.Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// ADD: scanBasePackages to explicitly include the current package (and all sub-packages)
@SpringBootApplication(scanBasePackages = "Personal.Finance.Tracking.Application.Backend")
public class FinanceTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceTrackerApplication.class, args);
	}

}