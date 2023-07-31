package com.stanley.finalproject

import android.os.Bundle
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private var dList = ArrayList<DisasterData>()
    private lateinit var adapter: DisasterAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.searchView)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()
        adapter = DisasterAdapter(dList)
        recyclerView.adapter = adapter
    }

    private fun addDataToList() {
        dList.add(DisasterData(R.drawable.disaster_icon, "Title", "Desc1"))
        dList.add(DisasterData(R.drawable.disaster_icon, "Title", "Desc2"))
        dList.add(DisasterData(R.drawable.disaster_icon, "Title", "Desc3"))
        dList.add(DisasterData(R.drawable.disaster_icon, "Title", "Desc4"))
        dList.add(DisasterData(R.drawable.disaster_icon, "Title", "Desc5"))
    }
}