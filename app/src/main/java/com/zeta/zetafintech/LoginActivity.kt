package com.zeta.zetafintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeta.zetafintech.databinding.ActivityLoginBinding
import com.zeta.zetafintech.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Utils.blackIconsStatusBar(this, R.color.light_bg)

    }
}

