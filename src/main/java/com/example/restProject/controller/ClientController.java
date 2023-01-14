package com.example.restProject.controller;

import com.example.restProject.entity.Client;
import com.example.restProject.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ClientController {
    @Autowired private ClientService service;

    @GetMapping("/list")
    public List<Client> getClient(){
        return service.listAll();
    }
}
