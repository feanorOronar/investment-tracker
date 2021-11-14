package com.feanor.invtrackerbackend.dao;

import java.util.List;

import com.feanor.invtrackerbackend.entity.Cryptocurrency;

public interface CryptocurrencyDao {
    public List<Cryptocurrency> findAll();
    public Cryptocurrency findById(int id);
    public Cryptocurrency findByName(String name);
}
