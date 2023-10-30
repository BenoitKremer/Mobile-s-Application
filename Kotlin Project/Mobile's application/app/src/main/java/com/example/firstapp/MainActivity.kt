package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapp.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Injecter le fragment dans notre boîte(fragment_container)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}