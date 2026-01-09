package com.example.petshop;

import java.util.Date;

public class Calm extends Mood{
    public Calm(Date date){
        super(date);
    }


    @Override
    public String name() {
        return "Calm";
    }
}

