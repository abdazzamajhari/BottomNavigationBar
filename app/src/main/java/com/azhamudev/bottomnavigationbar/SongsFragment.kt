package com.azhamudev.bottomnavigationbar

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Chike on 1/9/2018.
 */
class SongsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.activity_songs_fragment, container, false)

    companion object {
        fun newInstance(): SongsFragment = SongsFragment()
    }
}