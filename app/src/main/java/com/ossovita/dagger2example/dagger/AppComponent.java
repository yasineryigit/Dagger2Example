package com.ossovita.dagger2example.dagger;

import com.ossovita.dagger2example.car.Driver;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent  {

    ActivityComponent.Factory getActivityComponentFactory();

    @Component.Factory
    interface Factory{
        AppComponent create(DriverModule driverModule);
    }



}
