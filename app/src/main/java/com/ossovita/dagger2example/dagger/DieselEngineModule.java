package com.ossovita.dagger2example.dagger;

import com.ossovita.dagger2example.car.DieselEngine;
import com.ossovita.dagger2example.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }
}
