package rest.service.architecture.bff.api.app;

import org.hamcrest.CoreMatchers;
import org.junit.Ignore;
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
    @Ignore
    public void should_be_true() {
        assertThat(userApi, is(notNullValue()));
    }

    @Test
    @Ignore
    public void should_be_true_not() {
        UserApi obj = new UserApi();
        assertThat(userApi, is(CoreMatchers.not(obj)));
    }

    @Test
    @Ignore
    public void should_be_true_1() {
        assertThat(userApi, is(userApi));
    }

    @Test
    @Ignore
    public void should_be_true_test() {
        assertThat(1, is(1));
    }

    @Test
    @Ignore
    public void should_be_true_test_is_not() {
        assertThat(1, is(not(2)));
    }
}