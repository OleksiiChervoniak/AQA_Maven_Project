import model.ApiResponse;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest{

    @Test
    void doSomething() {
        ApiResponse response = apiService.getSomething();
        assert response.getType().equals("success");
        assert response.getValue() != null;
    }
}
