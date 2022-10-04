package virtualinternship.finaltask.repository.oauth;

import org.springframework.data.repository.PagingAndSortingRepository;
import virtualinternship.finaltask.model.oauth.Client;

public interface ClientRepository extends PagingAndSortingRepository<Client,Long> {

    Client findOneByClientId(String clientId);
}
