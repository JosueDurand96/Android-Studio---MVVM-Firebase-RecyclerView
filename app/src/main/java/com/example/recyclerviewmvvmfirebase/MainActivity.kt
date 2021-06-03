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
        dummyList.add(Usuario("https://1.bp.blogspot.com/-5joOd2PWBI4/U_tWLWpwgiI/AAAAAAAAjE4/6lYPmYQDhgs/s1600/harvey-specter-look.jpg",
            "Josue Durand","Software Developer, I love music, I wanna go to the movie"))
        dummyList.add(Usuario("https://1.bp.blogspot.com/-5joOd2PWBI4/U_tWLWpwgiI/AAAAAAAAjE4/6lYPmYQDhgs/s1600/harvey-specter-look.jpg",
            "Josue Durand","Software Developer, I love music, I wanna go to the movie"))
        dummyList.add(Usuario("https://1.bp.blogspot.com/-5joOd2PWBI4/U_tWLWpwgiI/AAAAAAAAjE4/6lYPmYQDhgs/s1600/harvey-specter-look.jpg",
            "Josue Durand","Software Developer, I love music, I wanna go to the movie"))

        adapter.setListData(dummyList)
        adapter.notifyDataSetChanged()

    }
}
