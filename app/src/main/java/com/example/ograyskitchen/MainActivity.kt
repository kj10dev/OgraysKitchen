package com.example.ograyskitchen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.ograyskitchen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Activity binding
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //set view
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //setup toolbar
        val toolbar = binding.toolbar
        setSupportActionBar(toolbar)

        //setup BottomNavigationView
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val bottomNavView = binding.bottomNav
        bottomNavView.setupWithNavController(navController)
    }
}