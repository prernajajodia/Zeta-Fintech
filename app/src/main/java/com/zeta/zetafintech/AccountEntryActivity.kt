package com.zeta.zetafintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeta.zetafintech.databinding.ActivityAccountBinding

class AccountEntryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityAccountBinding = ActivityAccountBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_account_entry)

        Utils.blackIconsStatusBar(this, R.color.light_bg)
    }
}