package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageId = arrayOf(
            R.drawable.giove,
            R.drawable.marte,
            R.drawable.mercurio,
            R.drawable.nettuno,
            R.drawable.pluto,
            R.drawable.saturno,
            R.drawable.terra,
            R.drawable.urano,
            R.drawable.venere,
        )

        heading = arrayOf(
            "this planet is Jupiter",
            "this planet is Mars",
            "this planet is Mercury",
            "this planet is Neptune",
            "this planet is Pluto",
            "this planet is Saturn",
            "this planet is Earth",
            "this planet is Uran",
            "this planet is Venus",
        )

        newRecyclerView = findViewById(R.id.my_recycle_view)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getData()


    }

    private fun getData() {
        for (i in imageId.indices) {

            val news = News(imageId[i], heading[i])
            newArrayList.add(news)


        }

        newRecyclerView.adapter = MyAdapter(newArrayList)


    }
}
