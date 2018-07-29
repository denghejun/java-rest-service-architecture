package rest.service.architecture.test.bff.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import rest.service.architecture.bff.app.UserApi;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApiTest {

    @Autowired
    UserApi userApi;

    @Test
    public void should_be_true() {
        assertThat(userApi, is(notNullValue()));
    }

    @Test
    public void should_be_true_not() {
        UserApi obj = new UserApi();
        assertThat(userApi, is(not(obj)));
    }

    @Test
    public void should_be_true_1() {
        assertThat(userApi, is(userApi));
    }

    @Test
    public void should_be_true_test() {
        assertThat(1, is(1));
    }

    @Test
    public void should_be_true_test_is_not() {
        assertThat(1, is(not(2)));
    }
}
