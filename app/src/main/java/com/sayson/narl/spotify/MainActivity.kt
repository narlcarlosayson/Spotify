package com.sayson.narl.spotify

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyc = findViewById<RecyclerView>(R.id.recyclerView1)
        recyc.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val listeners = ArrayList<Music>()

        listeners.add(Music("Gang Related", "Logic", " • Under Pressure(Deluxe)"))
        listeners.add(Music("Him & I(with Halsey)", "G-Eazy,Halsey", " • The Beautiful & Damned"))
        listeners.add(Music("Candy Paint", "Post Malone", " • Candy Paint"))
        listeners.add(Music("I Fall Apart", "Post Malone", " • Stoney(Deluxe)"))
        listeners.add(Music("Wake Up Alone", "The Chainsmokers", " • Memories...Do Not Open"))
        listeners.add(Music("Fast Car", "Jonas Blue,Dakota", " • Fast Car"))
        listeners.add(Music("Glow Like Dat", "Rich Chigga", " • Glow Like Dat"))
        listeners.add(Music("Stay With You", "Cheat Codes", " • Stay With You"))
        listeners.add(Music("Still Got Time", "ZAYN, PARTYNEXTDOOR", " • Still Got Time"))
        listeners.add(Music("Mama", "Jonas Blue,William Singe", " • Mama"))
        listeners.add(Music("rockstar", "Post Malone,21 Savage", " • rockstar"))
        var adapter = PlistAdapter(listeners)
        recyc.adapter = adapter



    }
}
