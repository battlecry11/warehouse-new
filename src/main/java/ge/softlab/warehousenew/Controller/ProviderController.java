package ge.softlab.warehousenew.Controller;

import ge.softlab.warehousenew.exceptions.NotFoundException;
import ge.softlab.warehousenew.model.Provider;
import ge.softlab.warehousenew.repository.ProviderRepository;
import ge.softlab.warehousenew.service.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("providers")
@RequiredArgsConstructor
public class ProviderController {
    private final ProviderService providerService;

    @GetMapping
    public List<Provider> getProviders() {
        return providerService.getAll();
    }

    @PostMapping
    public ResponseEntity<Provider> addProvider(@RequestBody Provider provider) {

        return ResponseEntity.status(HttpStatus.CREATED).body(providerService.add(provider));

    }

    @PutMapping("{id}")
    public Provider updateProvider(@PathVariable long id, @RequestBody Provider unsafeProvider) {
        Provider provider = providerService.get(id);

        return providerService.update(provider);
    }

    @GetMapping("{id}")
    public Provider getProvider(@PathVariable long id) {
        return providerService.get(id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteProvider(@PathVariable long id) {

        providerService.delete(id);
        return ResponseEntity.noContent().build();

    }
}