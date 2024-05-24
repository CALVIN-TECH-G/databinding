package com.example.databindings

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.databindings.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val recyclerView: RecyclerView = findViewById(R.id.recycler)


        val items = listOf(
            Item("books", "big books"),
            Item("balls ", "small balls"),
            Item("shoes", "small shoes")
        )

        val adapter = itemAdapter(items)
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = LinearLayoutManager(this)

    }
}
