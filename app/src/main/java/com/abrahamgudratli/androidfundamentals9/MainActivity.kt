package com.abrahamgudratli.androidfundamentals9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myMovieList = listOf(
            (R.drawable.cityofgod),
            (R.drawable.fightclub),
            (R.drawable.godfather),
            (R.drawable.interstellar),
            (R.drawable.matrix),
            (R.drawable.pulpfiction),
            (R.drawable.savingryan),
            (R.drawable.shawshank),
            (R.drawable.movie)
        )

        vpMoviePages.adapter = SwipableViewAdapter(myMovieList)

        TabLayoutMediator(tabLayout, vpMoviePages) { tab, position ->
            tab.text = "${position + 1}"

        }.attach()

    }
}