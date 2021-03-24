package com.ossovita.dagger2example.dagger;

import com.ossovita.dagger2example.car.Rims;
import com.ossovita.dagger2example.car.Tires;
import com.ossovita.dagger2example.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
