package app.learn.springcloudconsul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @Value("${user.first.name}")
  private String name;

  @Value("${user.password}")
  private String password;

  @GetMapping("/")
  public String index() {
    return name+" - > "+password;
  }
}
