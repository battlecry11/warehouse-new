package ge.softlab.warehousenew.service;

import ge.softlab.warehousenew.model.Provider;
import ge.softlab.warehousenew.model.Store;

import java.util.List;

public interface StoreService {
    List<Store> getAll();

    Store get(long id);

    Store add(Store store);

    Store update(Store store);

    void delete(long id);


}
