import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class TestController {


    @GetMapping("/proje")
    public String proje() {
        return "Uygulama çalışıyor - Sunucu: " + System.getenv().getOrDefault("HOSTNAME", "unknown");
    }
} 
