package rest.service.architecture.bff.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import user.model.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/app/user")
public class UserApi {

    @Value("${spring.datasource.url}")
    private String text;

    @PostMapping
    public List<User> addUsers(List<User> users) {
        List<User> results = new ArrayList<>();
        User u = new User();
        u.setName("you");
        results.add(u);
        return results;
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") String userId) {
        User u = new User();

        u.setName(this.text);
        return u;
    }
}
