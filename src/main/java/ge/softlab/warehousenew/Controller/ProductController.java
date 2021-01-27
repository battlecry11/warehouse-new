package ge.softlab.warehousenew.Controller;

import ge.softlab.warehousenew.model.Product;
import ge.softlab.warehousenew.model.Provider;
import ge.softlab.warehousenew.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAll();
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {

        return ResponseEntity.status(HttpStatus.CREATED).body(productService.add(product));

    }

    @PutMapping("{id}")
    public Product updateProvider(@PathVariable long id, @RequestBody Provider unsafeProduct) {
        Product product = productService.get(id);

        return productService.update(product);
    }

    @GetMapping("{id}")
    public Product getProduct(@PathVariable long id) {
        return productService.get(id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable long id) {

        productService.delete(id);
        return ResponseEntity.noContent().build();

    }
}

