package rest.service.architecture.bff.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import rest.service.architecture.common.SpringBootTestBase;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootTestBase.class)
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