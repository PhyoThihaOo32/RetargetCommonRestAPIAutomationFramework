package Utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestUtilities {

    public static Response performPost(String endpoint, String requestPayload, Map<String,String> headers){

        return given().
                baseUri(endpoint).
                contentType(ContentType.JSON).
                body(requestPayload).
                headers(headers).
                when().
                post().
                then().
                log().
                all().
                extract().response();



    }


}
