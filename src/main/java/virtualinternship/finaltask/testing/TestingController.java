package virtualinternship.finaltask.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.http.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestingController {

    @Autowired
    public TestRestTemplate restTemplate;

    @Test
    public void restTemplateSave() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept","*/*");
        headers.set("Content-Type", "application/json");
        String bodyTesting = "{\n" +
                "\"id_peminjam\":1,\n" +
                "\"id_meminjam\":2,\n" +
                "\"tenor\":\"5\",\n" +
                "\"total_pinjaman\":50000,\n" +
                "\"bunga_persen\":1.5,\n" +
                "\"status\":\"berjalan\"\n" +
                "}";

        HttpEntity<String> entity= new HttpEntity<>(bodyTesting,headers);
        ResponseEntity<String> exchange = restTemplate.exchange(
                "http://localhost:8080/api/v1/transaksi", HttpMethod.POST, entity, String.class
        );
        assert HttpStatus.OK == exchange.getStatusCode();
        System.out.println("response = " + exchange.getBody());

    }
}

















