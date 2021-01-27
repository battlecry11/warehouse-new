package ge.softlab.warehousenew.service;

import ge.softlab.warehousenew.exceptions.NotFoundException;
import ge.softlab.warehousenew.model.Product;
import ge.softlab.warehousenew.model.Provider;
import ge.softlab.warehousenew.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product get(long id) {
        String message=String.format("Customer with such an id: %d Not found ", id);
        return productRepository.findById(id).orElseThrow(()-> new NotFoundException(message));
    }

    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(long id) {
        get(id);
        productRepository.deleteById(id);

    }
}
