package storage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import storage.domain.Item;
import storage.repository.StorageRepository;

import java.util.List;

@Service
public class StorageService {
    @Autowired
    StorageRepository storageRepository;
    public List<Item> allItens(){
        return storageRepository.allItens();
    }
}
