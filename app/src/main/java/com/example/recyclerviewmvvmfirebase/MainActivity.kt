package com.example.recyclerviewmvvmfirebase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter:MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = MainAdapter(this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        val dummyList= mutableListOf<Usuario>()
        dummyList.add(Usuario("https://www.facebook.com/photo.php?fbid=737591993262354&set=a.126238817731011&type=3&theater",
            "Josue Durand","Software Developer, I love music, I wanna go to the movie"))

        adapter.setListData(dummyList)
        adapter.notifyDataSetChanged()

    }
}
