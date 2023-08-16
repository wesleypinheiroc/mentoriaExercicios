package br.com.gamaitau.farmaciaservice.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class KafkaListeners {
    String lastmessage;

    @KafkaListener(id="Farmacia", topics = "hospital-farmacia")
    public void listenString(String msg) {
        
        lastmessage =  msg;
        
    }

    public String getMEssage(){
        this.listenString(lastmessage);
        return lastmessage;
    }
}
