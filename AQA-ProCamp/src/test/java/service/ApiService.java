package service;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.ApiResponse;

public class ApiService {

    private final static String SERVICE_ENDPOINT = "/api/random";
    private static final int OK_STATUS_CODE = 200;

    private final RequestSpecification SPECIFICATION;

    public ApiService(String applicationUrl) {
        SPECIFICATION = RestAssured.given().baseUri(applicationUrl);
    }

    public ApiResponse getSomething() {
        final Response response = RestAssured.given(SPECIFICATION).get(SERVICE_ENDPOINT);
        response.then().statusCode(OK_STATUS_CODE);
        return response.as(ApiResponse.class);
    }

/*    private void validateResponse(Response response) throws ApiException {
        if (response.statusCode() != OK_STATUS_CODE) {
            throw new ApiException(response.statusCode(),
                    response.body().asPrettyString());
        }
    }*/
}
