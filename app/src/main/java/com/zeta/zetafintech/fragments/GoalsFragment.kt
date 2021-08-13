package com.zeta.zetafintech.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zeta.zetafintech.R
import com.zeta.zetafintech.Utils
import com.zeta.zetafintech.adapters.GoalsAdapter
import com.zeta.zetafintech.databinding.ActivityGoalsBinding
import com.zeta.zetafintech.models.GoalsModel

class GoalsFragment : AppCompatActivity() {

    private val mutableGoalsModel: MutableList<GoalsModel> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityGoalsBinding = ActivityGoalsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Utils.blackIconsStatusBar(this, R.color.light_bg)

        initGoalsModels()
        binding.goalsList.adapter = GoalsAdapter(mutableGoalsModel)
    }

    private fun initGoalsModels() {
        var i = 0

        while (i < 10) {
            mutableGoalsModel.add(i, GoalsModel(""))
            i++
        }
    }
}