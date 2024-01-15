package demo.repository;

import demo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<Client, Integer> {


}
