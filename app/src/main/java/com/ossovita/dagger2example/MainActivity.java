package com.ossovita.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ossovita.dagger2example.car.Car;
import com.ossovita.dagger2example.car.Engine;
import com.ossovita.dagger2example.dagger.CarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car; //Burada @Inject dediğimiz zaman car objesini tanımla diyoruz.
    @Inject
    Engine engine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);

    }
}