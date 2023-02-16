package md.gradledemo.server1;

import jakarta.annotation.PostConstruct;
import md.gradledemo.library1.Library1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Server1Application
{
    public static void main(String[] args)
    {
        SpringApplication.run(Server1Application.class, args);
    }

    @PostConstruct
    public void init()
    {
        Library1.method1();
    }
}
