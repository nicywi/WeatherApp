package com.nkcdev.weatherapp;

import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private TextView city,temperature,weatherCondition,humidity,maxTemperature,minTemperature,pressure,wind;
    private ImageView imageView;
    private FloatingActionButton fab;

//    LocationManager locationManager;
//    LocationListener locationListener;
//    double lat,lon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        city = findViewById(R.id.textViewCity);
        temperature = findViewById(R.id.textViewTemp);
        weatherCondition = findViewById(R.id.textViewWeatherCondition);
        humidity = findViewById(R.id.textViewHumidity);
        maxTemperature = findViewById(R.id.textViewMaxTemp);
        minTemperature = findViewById(R.id.textViewMinTemp);
        pressure = findViewById(R.id.textViewPressure);
        wind = findViewById(R.id.textViewWind);
        imageView = findViewById(R.id.imageView);
        fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,WeatherActivity.class);
                startActivity(intent);

            }
        });
    }
}