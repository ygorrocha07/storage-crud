package storage.repository;

import org.springframework.stereotype.Repository;
import storage.domain.Item;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StorageRepository {
    List<Item> itens = new ArrayList<>();
    public StorageRepository() {

    }
    public List<Item> allItens(){
        if(itens.size() > 0) {
            return itens;
        } else{
            throw new RuntimeException("Não há itens na lista!");
        }
    }

    public String addItens (Item item){
        itens.add(item);
        return "Item adicionado com sucesso!";
    }
    public Item findItem(String nome){
        for(int i = 0; i <= itens.size(); i++){
            if(itens.get(i).getNome().equalsIgnoreCase(nome)){
                return itens.get(i);
            }
        }
        return null;
    }
    private Item findItemPrivado(String nome){
        if(itens.isEmpty()){
            return null;
        }
        for(int i = 0; i < itens.size(); i++){
            if(itens.get(i).getNome().equalsIgnoreCase(nome)){
                return itens.get(i);
            }
        }
        return null;
    }
    public String removeItem(String nome){
        Item item = findItemPrivado(nome);
        if(item == null){
            return "Item não encontrado!";
        } else{
            itens.remove(item);
            return "Item removido!";
        }

    }
}
