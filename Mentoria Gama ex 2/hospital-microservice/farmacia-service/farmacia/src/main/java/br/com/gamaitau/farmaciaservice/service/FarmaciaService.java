package br.com.gamaitau.farmaciaservice.service;

import br.com.gamaitau.farmaciaservice.listeners.KafkaListeners;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class FarmaciaService {
    
    @Autowired
    KafkaListeners listener;

    public String getMensage(){
        String msg = listener.getMEssage();
        return msg;
    }

}
