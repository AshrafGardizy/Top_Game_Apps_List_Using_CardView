package com.example.topgameapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1- RecyclerView
        val recyclerView:RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        //2- Data -- Name and Image of Games
        val gamesList:ArrayList<GameModel> = ArrayList()
        val g1 = GameModel(R.drawable.card1,"Horizon Chase")
        val g2 = GameModel(R.drawable.card2,"PUBG Mobile")
        val g3 = GameModel(R.drawable.card3,"Head Ball 2")
        val g4 = GameModel(R.drawable.card4,"FIFA 2023")
        val g5 = GameModel(R.drawable.card5,"FortNite ")
        val g6 = GameModel(R.drawable.card6,"HookedOn You")
        gamesList.add(g1)
        gamesList.add(g2)
        gamesList.add(g3)
        gamesList.add(g4)
        gamesList.add(g5)
        gamesList.add(g6)
        //3- Adapter
        val adapter = GameAdapter(gamesList)
        recyclerView.adapter = adapter
    }
}