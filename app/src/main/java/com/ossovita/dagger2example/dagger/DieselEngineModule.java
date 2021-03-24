package com.ossovita.dagger2example.dagger;

import com.ossovita.dagger2example.car.DieselEngine;
import com.ossovita.dagger2example.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
