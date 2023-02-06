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
    lateinit var distance: Array<String>
    lateinit var km: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageId = arrayOf(
            R.drawable.mercurio,
            R.drawable.venere,
            R.drawable.terra,
            R.drawable.marte,
            R.drawable.giove,
            R.drawable.saturno,
            R.drawable.urano,
            R.drawable.nettuno,
            R.drawable.pluto,
        )

        heading = arrayOf(
            "Mercury",
            "Venus",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Uran",
            "Neptune",
            "Pluto",
        )

        distance = arrayOf(
            "Distance from the sun",
            "Distance from the sun",
            "Distance from the sun",
            "Distance from the sun",
            "Distance from the sun",
            "Distance from the sun",
            "Distance from the sun",
            "Distance from the sun",
            "Distance from the sun",
        )

        km = arrayOf(
            "57.910.000 km",
            "108.209.000 km",
            "149.600.000 km",
            "227.944.000 km",
            "778.400.000 km",
            "1.426.670.000 km",
            "2.870.660.000 km",
            "4.498.400.000 km",
            "39.44 UA",
        )



        newRecyclerView = findViewById(R.id.my_recycle_view)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getData()


    }

    private fun getData() {
        for (i in imageId.indices) {

            val news = News(imageId[i], heading[i],distance[i],km[i])
            newArrayList.add(news)


        }

        newRecyclerView.adapter = MyAdapter(newArrayList)


    }
}
