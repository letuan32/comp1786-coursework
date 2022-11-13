package com.example.coursework;

import android.os.Bundle;
import android.widget.ListView;
import com.example.coursework.adapters.TripListViewAdapter;
import com.example.coursework.models.Trip;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.coursework.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Trip> listTrip;
    TripListViewAdapter tripListViewAdapter;

//    ListView listViewTrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);



        listTrip = new ArrayList<>();
        listTrip.add(new Trip(1, "Iphone 6", "Destination"));
        listTrip.add(new Trip(2, "Iphone 7", "Destination"));
        listTrip.add(new Trip(3, "Sony Abc", "Destination"));
        listTrip.add(new Trip(4, "Samsung XYZ", "Destination"));
        listTrip.add(new Trip(5, "SP 5", "Destination"));
        listTrip.add(new Trip(6, "SP 6", "Destination"));
        listTrip.add(new Trip(7, "SP 7", "Destination"));
        listTrip.add(new Trip(8, "SP 8", "Destination"));

        tripListViewAdapter = new TripListViewAdapter(this, listTrip);

        ListView listViewTrip = findViewById(R.id.listview_trip);
        listViewTrip.setAdapter(tripListViewAdapter);
    }

}