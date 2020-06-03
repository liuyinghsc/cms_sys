package com.cms.login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import com.cms.test.BasicApiTest;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class signApiTest extends BasicApiTest{

    @Value("classpath:/jsonData/sign_new.json")
    private Resource newSign;

    @Test
    public void signNew() throws Exception {
        given()
                .contentType(JSON)
                .body(resourceToString(newSign))
                .when()
                .post("/sign")
                .then()
                .assertThat()
                .statusCode(200);
    }

}
