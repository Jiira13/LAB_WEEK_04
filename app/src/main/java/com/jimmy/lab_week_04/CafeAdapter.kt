package com.jimmy.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjiw_title,
    R.string.kopken_title,
)

class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
        FragmentStateAdapter(fragmentManager, lifecycle) {
            override fun getItemCount(): Int {
                return TABS_FIXED.size
            }

            override fun createFragment(position: Int): Fragment {
                return CafeDetailFragment()
            }
        }
