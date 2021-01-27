package ge.softlab.warehousenew.Controller;

import ge.softlab.warehousenew.exceptions.NotFoundException;
import ge.softlab.warehousenew.model.Provider;
import ge.softlab.warehousenew.model.Store;
import ge.softlab.warehousenew.repository.StoreRepository;
import ge.softlab.warehousenew.service.ProviderService;
import ge.softlab.warehousenew.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stores")
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;

    @GetMapping
    public List<Store> getStores() {
        return storeService.getAll();
    }

    @PostMapping
    public ResponseEntity<Store> addStore(@RequestBody Store store) {

        return ResponseEntity.status(HttpStatus.CREATED).body(storeService.add(store));

    }

    @PutMapping("{id}")
    public Store updateStore(@PathVariable long id, @RequestBody Provider unsafeStore) {Store storer = storeService.get(id);
        Store store = storeService.get(id);

        return storeService.update(store);
    }

    @GetMapping("{id}")
    public Store getStore(@PathVariable long id) {
       return storeService.get(id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteStore(@PathVariable long id) {

        storeService.delete(id);
        return ResponseEntity.noContent().build();

    }
}
