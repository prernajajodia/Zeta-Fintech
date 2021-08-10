package com.zeta.zetafintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeta.zetafintech.databinding.ActivityAccountBinding
import com.zeta.zetafintech.databinding.ActivityGoalsBinding

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityAccountBinding = ActivityAccountBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Utils.blackIconsStatusBar(this, R.color.light_bg)
    }
}