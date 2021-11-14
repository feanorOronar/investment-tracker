package com.feanor.invtrackerbackend.service;

import java.util.List;

import com.feanor.invtrackerbackend.entity.Cryptocurrency;
import com.feanor.invtrackerbackend.dao.CryptocurrencyDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CryptocurrencyService {

    @Autowired
    private CryptocurrencyDao cryptocurrencyDao;
    
    public List<Cryptocurrency> getAllCurrencies() {
        return cryptocurrencyDao.findAll();
    }
    
}
