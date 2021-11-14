package com.feanor.invtrackerbackend.controller;

import com.feanor.invtrackerbackend.service.CryptocurrencyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("crypto")
public class CryptocurrencyController {

    @Autowired
    private CryptocurrencyService cryptocurrencyService;

    @GetMapping(value="/all", produces="application/json")
    public String getCurrentCryptoValues() {
        cryptocurrencyService.getAllCurrencies();
        return "These will be the values of all assets";
    }
    
}
