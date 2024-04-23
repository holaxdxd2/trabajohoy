package com.example.intentsapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intentsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    val TAG = "MainActivity"
    private  lateinit var binding: ActivityMainBinding
    lateinit var nombre: String
    lateinit var apellidos: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "mano tengo sueño")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.submitButton.setOnClickListener(this)
        binding.browserButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            binding.submitButton->{
               nombre = binding.firstNameText.text.toString()
               apellidos = binding.lastNameText.text.toString()
               intent = Intent(this,
                   ShowActivity::class.java).apply {
                   putExtra("Nombres", nombre)
                   putExtra("Apellidos", apellidos)
               }
                startActivity(intent)
            }
        }
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Called")
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "start")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "pause")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "stop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart ")
    }









}