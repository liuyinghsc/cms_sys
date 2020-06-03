package com.cms.login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static io.restassured.RestAssured.given;

@RunWith(SpringRunner.class)  //是Junit和Spring Boot test联系的桥梁。
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class loginApiTest {

    @Test
    public void signApiTest(){
        given()
                .when()
                .get("http://localhost:8080/sign")
                .then()
                .statusCode(200);
    }


}
