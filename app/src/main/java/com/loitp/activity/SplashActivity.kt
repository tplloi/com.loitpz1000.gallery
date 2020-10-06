package com.loitp.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.core.common.Constants
import com.core.helper.girl.ui.GirlSplashActivity
import com.core.utilities.LActivityUtil
import com.loitp.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, GirlSplashActivity::class.java)
        intent.putExtra(Constants.AD_UNIT_ID_BANNER, getString(R.string.str_b))

        val listBkg = ArrayList<String>()
        listBkg.add("https://live.staticflickr.com/4657/26146170428_894243ab3c_b.jpg")
        listBkg.add("https://live.staticflickr.com/4782/26128440717_a00e7cbec1_h.jpg")
        listBkg.add("https://live.staticflickr.com/817/26128440867_1a90f7f8ec_h.jpg")
        listBkg.add("https://live.staticflickr.com/789/26128436937_84ecab7cdf_h.jpg")
        listBkg.add("https://live.staticflickr.com/4794/26128436737_69e5dfca7b_h.jpg")
        intent.putExtra(Constants.BKG_SPLASH_SCREEN, listBkg.random())
        startActivity(intent)
        LActivityUtil.tranIn(this)
    }
}
