package com.example.bestplace_jav2;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.bestplace_jav2.databinding.ActivityMainBinding;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MapView mapview;
    private MapObjectCollection mapObjects;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        MapKitFactory.setApiKey("ad3baf25-3c25-434c-a9b9-adc1f6be7441");
        MapKitFactory.initialize(this);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_profile, R.id.navigation_map, R.id.navigation_best_places)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


        //mapview = (MapView)findViewById(R.id.mapview);
        //mapview.getMap().move(
                //new CameraPosition(new Point(55.751574, 37.573856), 11.0f, 0.0f, 0.0f),
                //new Animation(Animation.Type.SMOOTH, 0),
                //null);

        //mapview.getMap().getMapObjects().addPlacemark(new Point(55.751574, 37.573856), ImageProvider.fromResource(this, R.drawable.green_mark));
    }

    @Override
    protected void onStart() {
        //MapKitFactory.getInstance().onStart();
        //mapview.onStart();
        super.onStart();
    }

    @Override
    protected void onStop() {
        //mapview.onStop();
        //MapKitFactory.getInstance().onStop();
        super.onStop();
    }
}