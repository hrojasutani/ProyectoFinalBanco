package com.nttdata.banco.controller;

import com.nttdata.banco.business.ClientService;
import com.nttdata.banco.model.banco.ClientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/cliente")
    public List<ClientModel> findAllCars() {
        return clientService.findCars();
    }

    @GetMapping(value = "/cars/model", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ClientModel findCardByModel(@RequestBody String model) {
        return clientService.findCardByModel(model);
    }

}
