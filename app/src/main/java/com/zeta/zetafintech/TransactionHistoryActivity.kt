package com.zeta.zetafintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeta.zetafintech.databinding.ActivityAccountBinding
import com.zeta.zetafintech.databinding.ActivityTransactionHistoryBinding

class TransactionHistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityTransactionHistoryBinding = ActivityTransactionHistoryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_transaction_history)

        Utils.blackIconsStatusBar(this, R.color.light_bg)
    }
}