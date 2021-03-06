package com.zeta.zetafintech.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zeta.zetafintech.R
import com.zeta.zetafintech.Utils
import com.zeta.zetafintech.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivitySignUpBinding =
            ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Utils.blackIconsStatusBar(this, R.color.light_bg)
    }
}