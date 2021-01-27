package ge.softlab.warehousenew.service;

import ge.softlab.warehousenew.model.Provider;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProviderService {
    List<Provider> getAll();

    Provider get(long id);

   Provider add(Provider provider);

    Provider update(Provider provider);

    void delete(long id);


}
