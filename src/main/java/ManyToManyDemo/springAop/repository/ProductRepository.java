package ManyToManyDemo.springAop.repository;

import ManyToManyDemo.springAop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
