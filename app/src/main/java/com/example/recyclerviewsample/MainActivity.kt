package com.example.recyclerviewsample

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager // import android.support.v7.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView // import android.support.v7.widget.RecyclerView
import android.widget.Adapter
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var dogList = arrayListOf<Dog>(
        Dog("Chow Chow", "Male", "4", "dog00"),
        Dog("Breed Pomeranian", "Female", "1", "dog01"),
        Dog("Golden Retriver", "Female", "3", "dog02"),
        Dog("Yorkshire Terrier", "Male", "5", "dog03"),
        Dog("Pug", "Male", "4", "dog04"),
        Dog("Alaskan Malamute", "Male", "7", "dog05"),
        Dog("Shih Tzu", "Female", "5", "dog06")
    )

    private lateinit var mRecyclerView: RecyclerView // 추가

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mRecyclerView = findViewById<RecyclerView>(R.id.mRecyclerView)
        val mAdapter = MainRvAdapter(this, dogList)

        //val mRecyclerView = R.id.mRecyclerView
        /*mRecyclerView.apply {
            layoutManager = LinearLayoutManager(this)
            adapter = mAdapter
        }*/
        mRecyclerView.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        mRecyclerView.layoutManager = lm
        mRecyclerView.setHasFixedSize(true)
        
        /*val mAdapter = MainRvAdapter(this, dogList)
        val mRecyclerView = R.id.mRecyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        mRecyclerView.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        mRecyclerView.layoutManager = lm
        mRecyclerView.setHasFixedSize(true)

        val adapter = RecyclerView.Adapter(dogList)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter*/
    }
}