package com.example.teamproject_main

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter


class MyViewPagerAdapter(fragmentActivity: MainActivity) : FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> HomeFragment()
            1-> PopularRoutineFragment()
            2-> RoutineStorageFragment()
            3-> NoticeFragment()
            4-> MypageFragment()
            else-> HomeFragment()
        }
    }

}