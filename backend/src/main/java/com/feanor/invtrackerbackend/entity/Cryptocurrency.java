package com.feanor.invtrackerbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cryptocurrency {
    
    private int id;
    private String name;
    private double priceEur;
    private double priceUsd;
}
