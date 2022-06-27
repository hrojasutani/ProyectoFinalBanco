package com.nttdata.banco.business;

import com.nttdata.banco.model.banco.ClientModel;

import java.util.List;

public interface ClientService {

    List<ClientModel> findCars();

    ClientModel findCardByModel(String model);

}
