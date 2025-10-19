package storage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import storage.domain.Item;
import storage.services.StorageService;

import java.util.List;

@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @GetMapping("/itens")
    public List<Item> getAllItens() {
        return storageService.allItens();
    }
    @PostMapping("/addItem")
    public String addItem(@RequestBody Item item){return storageService.addItemService(item);}
}
