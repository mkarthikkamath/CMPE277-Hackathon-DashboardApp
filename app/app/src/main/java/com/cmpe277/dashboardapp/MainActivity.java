package com.cmpe277.dashboardapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        // Assuming you want to show the Macroeconomic fragment as the default fragment
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new MacroeconomicFragment()).commit();
            bottomNav.setSelectedItemId(R.id.navigation_macroeconomic); // Highlight the Macroeconomic menu item
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    int itemId = item.getItemId();
                    if (itemId == R.id.navigation_macroeconomic) {
                        selectedFragment = new MacroeconomicFragment();
                    } else if (itemId == R.id.navigation_agriculture) {
                        selectedFragment = new AgricultureFragment();
                    } else if (itemId == R.id.navigation_trade) {
                        selectedFragment = new TradeFragment();
                    } else if (itemId == R.id.navigation_chatgpt) {
                        selectedFragment = new ChatGPTFragment(); // Ensure this class is created
                    }

                    if (selectedFragment != null) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                selectedFragment).commit();
                    }

                    return true; // Return true to display the selected item as the selected menu item
                }
            };

}
