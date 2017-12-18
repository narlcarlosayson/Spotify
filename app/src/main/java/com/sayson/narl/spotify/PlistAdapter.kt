package com.sayson.narl.spotify
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
/**
 * Created by Lran on 12/17/2017.
 */
class PlistAdapter(val playList: ArrayList<Music>) : RecyclerView.Adapter<PlistAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.music?.text = playList[position].Title
        holder?.artist?.text = playList[position].Artist
        holder?.album?.text = playList[position].Album
        holder?.linearLayout?.setOnClickListener {

            holder.music.setTextColor(Color.parseColor("#1DB954"))


        }

    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.spotify_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return playList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val fragMusic = itemView.findViewById<TextView>(R.id.frag_music)
        val fragArtist = itemView.findViewById<TextView>(R.id.frag_album)
        val music = itemView.findViewById<TextView>(R.id.txtMusic)
        val artist = itemView.findViewById<TextView>(R.id.textArtist)
        val album = itemView.findViewById<TextView>(R.id.Albumtxt)
        val linearLayout = itemView.findViewById<RelativeLayout>(R.id.linn)


    }


}