package com.ossovita.dagger2example.dagger;

import com.ossovita.dagger2example.MainActivity;
import com.ossovita.dagger2example.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class,DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject (MainActivity mainActivity);

}
