package com.ossovita.dagger2example.dagger;

import com.ossovita.dagger2example.car.Engine;
import com.ossovita.dagger2example.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
