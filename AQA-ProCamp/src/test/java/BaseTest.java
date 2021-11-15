import service.ApiService;

import static util.SystemProperties.*;

public class BaseTest {

    ApiService apiService = new ApiService(APPLICATION_URL);

/*    @Test
    void simpleTest() {
        System.out.println(APPLICATION_URL);
        System.out.println(APPLICATION_ENDPOINT);
    }*/
}
