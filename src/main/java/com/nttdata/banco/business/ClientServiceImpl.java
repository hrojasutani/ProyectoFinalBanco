package com.nttdata.banco.business;

import com.nttdata.banco.model.banco.ClientModel;
import com.nttdata.banco.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements CarService {

    @Autowired
    private ClientRepository carRepository;

    @Override
    public List<ClientModel> findCars() {
        return carRepository.findAll();
    }

    @Override
    public ClientModel findCardByModel(String model) {
        return carRepository.findByModel(model);
    }

}
