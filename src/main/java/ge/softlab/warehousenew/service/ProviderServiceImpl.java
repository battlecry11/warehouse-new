package ge.softlab.warehousenew.service;

import ge.softlab.warehousenew.exceptions.NotFoundException;
import ge.softlab.warehousenew.model.Provider;
import ge.softlab.warehousenew.repository.ProviderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProviderServiceImpl implements ProviderService{
     private final ProviderRepository providerRepository;

    public ProviderServiceImpl(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Override
    public List<Provider> getAll() {
        return providerRepository.findAll();
    }

    @Override
    public Provider get(long id) {
        String message=String.format("Customer with such an id: %d Not found ", id);
        return providerRepository.findById(id).orElseThrow(()-> new NotFoundException(message));
    }

    @Override
    public Provider add(Provider provider) {
        return providerRepository.save(provider);
    }

    @Override
    public Provider update(Provider provider) {
        return providerRepository.save(provider);
    }

    @Override
    public void delete(long id) {
        get(id);
        providerRepository.deleteById(id);
    }
}
