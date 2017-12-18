package com.sayson.narl.spotify
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
/**
 * Created by Lran on 12/17/2017.
 */
class MusicFrag : Fragment() {

    private var music: List<String>? = null

    private val LIST_MUSIC = "list_music"
    private val LIST_ALBUM = "list_album"
    private var albums: List<String>? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        if (savedInstanceState != null) {
            music = savedInstanceState.getStringArrayList(LIST_MUSIC)
            albums = savedInstanceState.getStringArrayList(LIST_ALBUM)

        }
        val rView = inflater?.inflate(R.layout.frags, container, false)
        return rView
    }
}