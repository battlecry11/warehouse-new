package ge.softlab.warehousenew.service;

import ge.softlab.warehousenew.exceptions.NotFoundException;
import ge.softlab.warehousenew.model.Provider;
import ge.softlab.warehousenew.model.Store;
import ge.softlab.warehousenew.repository.ProviderRepository;
import ge.softlab.warehousenew.repository.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreServiceImpl implements StoreService{
    private final StoreRepository storeRepository;

    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository =storeRepository;
    }

    @Override
    public List<Store> getAll() {
        return storeRepository.findAll();
    }

    @Override
    public Store get(long id) {
        String message=String.format("Customer with such an id: %d Not found ", id);
        return storeRepository.findById(id).orElseThrow(()-> new NotFoundException(message));
    }

    @Override
    public Store add(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public Store update(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public void delete(long id) {
        get(id);
        storeRepository.deleteById(id);
    }
}
