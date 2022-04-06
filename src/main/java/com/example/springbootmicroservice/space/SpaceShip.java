package com.example.springbootmicroservice.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class SpaceShip {
    private String captain;
    private int fuel;
}