package com.nttdata.banco.repository;

import com.nttdata.banco.model.banco.ClientModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ClientRepository extends MongoRepository<CLientModel, String> {

    @Query("{model: ?0}")
    ClientModel findByModel(String model);

}
