package com.cms.login;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;
import io.restassured.RestAssured;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
@DBRider
public class LoginDBTest {

    @LocalServerPort
    private Integer port;

    @Test
    @DataSet("data.yml")
    public void findFromDataInsert() {
        // dGVzdDoxMjM0NTY=
        RestAssured.port = port;
        given()
                .header(HttpHeaders.AUTHORIZATION, "Basic dGVzdDoxMjM0NTY=")
                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                .post("/login")
                .then()
                .log().all()
                .statusCode(200)
        ;
    }

}
