package com.example.weatherapp.adatpers

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class vpAdapter(fa: FragmentActivity, private val list: List<Fragment>): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
       return list.size
    }

    override fun createFragment(position: Int): Fragment {
       return list[position]
    }


}