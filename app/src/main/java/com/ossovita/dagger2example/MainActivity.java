package com.ossovita.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ossovita.dagger2example.car.Car;
import com.ossovita.dagger2example.car.Engine;
import com.ossovita.dagger2example.dagger.CarComponent;
import com.ossovita.dagger2example.dagger.DaggerCarComponent;
import com.ossovita.dagger2example.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1,car2; //Burada @Inject dediğimiz zaman car objesini tanımla diyoruz.
    @Inject
    Engine engine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();

        car1.drive();
        car2.drive();

    }
}