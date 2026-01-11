package storage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import storage.domain.ApiResponse;
import storage.domain.Item;
import storage.services.StorageService;

import java.net.HttpURLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @GetMapping("/itens")
    public ApiResponse getAllItens() {
        ApiResponse response = new ApiResponse();
        try{
            response.setCode(HttpURLConnection.HTTP_OK);
            response.setMessage("Ok");
            List<Item> itens = storageService.allItens();
            response.setResult(itens);
            return response;
        }catch (Exception ex){
            response.setCode(HttpURLConnection.HTTP_BAD_REQUEST);
            response.setMessage(ex.getMessage());

            return response;
        }
    }
    @PostMapping("/addItem")
    public String addItem(@RequestBody Item item){return storageService.addItemService(item);}
    @GetMapping("/findItem")
    public Item findItem(@RequestParam String nome){return storageService.findItem(nome);}
    @PostMapping("/removeItem")
    public String removeItem(@RequestParam String nome){return storageService.removeItem(nome);}
}
