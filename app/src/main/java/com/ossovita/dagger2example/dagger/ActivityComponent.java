package com.ossovita.dagger2example.dagger;

import com.ossovita.dagger2example.MainActivity;
import com.ossovita.dagger2example.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class,PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject (MainActivity mainActivity);

    @Subcomponent.Factory
    interface Factory{
        ActivityComponent create(@BindsInstance @Named("horse power") int horsePower,
                                 @BindsInstance @Named("engine capacity") int engineCapacity);
    }
}
