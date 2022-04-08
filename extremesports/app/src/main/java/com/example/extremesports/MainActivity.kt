package com.example.extremesports

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.extremesports.adapter.itemadapter
import com.example.extremesports.data.sourcedata

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = sourcedata().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = itemadapter(this, myDataset)

        recyclerView.setHasFixedSize(true)
    }
}