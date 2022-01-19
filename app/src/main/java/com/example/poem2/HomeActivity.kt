package com.example.poem2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.poem2.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)


        val view = binding.root
// bring String text
        val poem = intent.getStringExtra("key")
        val id = intent.getStringExtra("id")
        binding.textView.text = poem
//action bar and title
        val actionBar = supportActionBar
        actionBar?.title =id
        actionBar?.setDisplayHomeAsUpEnabled(true)

        setContentView(view)

    }
//action bar click
    override fun onSupportNavigateUp(): Boolean {
       onBackPressed()
        return true
    }
}