package com.example.teamproject_main

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "76c40e4299c7bd3b66bcd425d38bfeea")
    }
}