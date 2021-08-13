package com.zeta.zetafintech.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zeta.zetafintech.R
import com.zeta.zetafintech.Utils
import com.zeta.zetafintech.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Utils.blackIconsStatusBar(this, R.color.light_bg)

        binding.signInButton.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        }

    }
}

