package com.feanor.invtrackerbackend.dao;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.feanor.invtrackerbackend.entity.Cryptocurrency;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CryptocurrencyDaoImpl implements CryptocurrencyDao {

    @Value("${crypto.data.eur.path}")
    private String pathEur;

    @Value("${crypto.data.usd.path}")
    private String pathUsd;

    @Override
    public List<Cryptocurrency> findAll() {
        return readFromFile();
    }

    @Override
    public Cryptocurrency findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cryptocurrency findByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    private List<Cryptocurrency> readFromFile() {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(pathEur));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray cryptoList = (JSONArray) jsonObject.get("data");
            Iterator<JSONObject> iterator = cryptoList.iterator();
            while(iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
    
}
