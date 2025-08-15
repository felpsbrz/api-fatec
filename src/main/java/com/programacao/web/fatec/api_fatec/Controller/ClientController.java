package com.programacao.web.fatec.api_fatec.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("")
    public String teste(){
        return "teste Client";
    }
    
}
