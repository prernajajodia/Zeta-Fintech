package com.zeta.zetafintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeta.zetafintech.databinding.ActivityTransHistBinding
import com.zeta.zetafintech.databinding.ActivityTransactionHistoryBinding

class TransHistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityTransHistBinding = ActivityTransHistBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_trans_hist)
        Utils.blackIconsStatusBar(this, R.color.light_bg)
    }
}