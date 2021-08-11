package com.zeta.zetafintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeta.zetafintech.databinding.ActivityGoalsBinding
import com.zeta.zetafintech.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityPaymentBinding = ActivityPaymentBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}