package ge.softlab.warehousenew.repository;

import ge.softlab.warehousenew.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
