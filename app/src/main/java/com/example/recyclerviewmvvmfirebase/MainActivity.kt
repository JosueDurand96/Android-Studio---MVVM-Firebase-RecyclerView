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
        dummyList.add(Usuario("https://media.licdn.com/dms/image/C5603AQGu5DRBNfNBNg/profile-displayphoto-shrink_200_200/0?e=1580947200&v=beta&t=kbzfD8RnuUIjCAsPnqgFZ0Q5alyC_NTKGnOxh7mM3u8",
            "Josue Durand","Software Developer, I love music, I wanna go to the movie"))
        dummyList.add(Usuario("https://media.licdn.com/dms/image/C5603AQGu5DRBNfNBNg/profile-displayphoto-shrink_200_200/0?e=1580947200&v=beta&t=kbzfD8RnuUIjCAsPnqgFZ0Q5alyC_NTKGnOxh7mM3u8",
            "Josue Durand","Software Developer, I love music, I wanna go to the movie"))
        dummyList.add(Usuario("https://media.licdn.com/dms/image/C5603AQGu5DRBNfNBNg/profile-displayphoto-shrink_200_200/0?e=1580947200&v=beta&t=kbzfD8RnuUIjCAsPnqgFZ0Q5alyC_NTKGnOxh7mM3u8",
            "Josue Durand","Software Developer, I love music, I wanna go to the movie"))

        adapter.setListData(dummyList)
        adapter.notifyDataSetChanged()

    }
}
