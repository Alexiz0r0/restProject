package com.example.restProject.service;

import com.example.restProject.entity.Client;
import com.example.restProject.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired private ClientRepository repo;

    public List<Client> listAll(){
        return (List<Client>) repo.findAll();
    }
}
