package com.ossovita.dagger2example.car;

import javax.inject.Inject;

public class Wheels {

    private Rims rims;
    private Tires tires;

    @Inject
    public Wheels(Rims rims, Tires tires){

    }
}
