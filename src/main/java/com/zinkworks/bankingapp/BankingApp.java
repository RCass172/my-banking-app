import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BankingApp {
    public static void main (String... args) {
        BankingApp.run(
                BankingApp.class, args);
    }
}
}

