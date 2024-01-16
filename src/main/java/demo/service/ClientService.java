package demo.service;


import demo.model.Client;
import demo.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ClientService {

  private final ClientRepository clientRepository;

  public  Client getClientById(int id) {
   return clientRepository.getById(id);
  }

  public Client createClient(Client client){
    return clientRepository.save(client);
  }



}
