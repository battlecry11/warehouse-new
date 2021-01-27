package ge.softlab.warehousenew.service;

import ge.softlab.warehousenew.model.Product;
import ge.softlab.warehousenew.model.Provider;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {

        List<Product> getAll();

        Product get(long id);

        Product add(Product product);

        Product update(Product product);

        void delete(long id);
}
