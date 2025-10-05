package storage.repository;

import org.springframework.stereotype.Repository;
import storage.domain.Item;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StorageRepository {
    List<Item> itens = new ArrayList<>();
    public StorageRepository() {
        itens.add(new Item("Item 1", 10, 5.0));
        itens.add(new Item("Item 2", 20, 10.0));
        itens.add(new Item("Item 3", 30, 15.0));
        itens.add(new Item("Item 4", 40, 20.0));
        itens.add(new Item("Item 5", 50, 25.0));
        itens.add(new Item("Item 6", 60, 30.0));
        itens.add(new Item("Item 7", 70, 35.0));
        itens.add(new Item("Item 8", 80, 40.0));
        itens.add(new Item("Item 9", 90, 45.0));
        itens.add(new Item("Item 10", 100, 50.0));
    }
    public List<Item> allItens(){
        return itens;
    }
}
