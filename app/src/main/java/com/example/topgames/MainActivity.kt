package com.example.topgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1- Adapter view - Recycler view
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        // 2- Data source
            var gamesList :ArrayList<GameModel> = ArrayList()
            val v1=GameModel("Horizon Chase Turbo" , R.drawable.card1)
            val v2=GameModel("BattleGround Mobile" , R.drawable.card2)
            val v3=GameModel("Head Boys 2" , R.drawable.card3)
            val v4=GameModel("Hooked By you" , R.drawable.card4)
            val v5=GameModel("FIFA 2022 Mobile" , R.drawable.card5)
            val v6=GameModel("Fortnite" , R.drawable.card6)

            gamesList.add(v1)
            gamesList.add(v2)
            gamesList.add(v3)
            gamesList.add(v4)
            gamesList.add(v5)
            gamesList.add(v6)

        // 3- Adapter

        var adapter = MyAdapter(gamesList)
        recyclerView.adapter = adapter

    }
}