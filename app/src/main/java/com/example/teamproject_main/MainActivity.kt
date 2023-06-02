package com.example.teamproject_main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.teamproject_main.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator
import com.kakao.sdk.common.util.Utility
import com.kakao.sdk.user.UserApiClient

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val textarr = arrayListOf<String>("홈","유명 루틴","루틴 보관함", "알림", "마이페이지")
    val imgarr = arrayListOf<Int>(
        R.drawable.baseline_home_24, R.drawable.baseline_search_24,
        R.drawable.img, R.drawable.baseline_notifications_24, R.drawable.baseline_person_24
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLayout()

        //val keyHash = Utility.getKeyHash(this)
        //Log.d("Hash", keyHash)
    }
    private fun initLayout(){
        binding.viewpager.adapter = MyViewPagerAdapter(this)
        TabLayoutMediator(binding.tablayout, binding.viewpager){
                tab,pos->
            tab.text=textarr[pos]
            tab.setIcon(imgarr[pos])
        }.attach()

    }

}
