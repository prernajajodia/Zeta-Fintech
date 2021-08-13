package com.zeta.zetafintech

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zeta.zetafintech.databinding.ActivityGoalsPopUpBinding

class GoalsPopUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding: ActivityGoalsPopUpBinding = ActivityGoalsPopUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Utils.blackIconsStatusBar(this, R.color.light_bg)


        binding.enterGoal.buttonOne.text = "Goal"
        binding.enterGoalAmnt.buttonOne.text = "Amount"
        binding.enterGoalAmntFreq.buttonOne.text = "Frequency"

        binding.enterGoalAmntFreq.goalsEditText.hint = "amount at frequency"
        binding.enterGoalAmnt.goalsEditText.hint = "amount"
        binding.enterGoal.goalsEditText.hint = "enter your goal"


    }
}