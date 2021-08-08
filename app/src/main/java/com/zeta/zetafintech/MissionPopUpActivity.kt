package com.zeta.zetafintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeta.zetafintech.databinding.ActivityGoalsPopUpBinding
import com.zeta.zetafintech.databinding.ActivityMissionPopUpBinding

class MissionPopUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMissionPopUpBinding= ActivityMissionPopUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Utils.blackIconsStatusBar(this, R.color.light_bg)

        binding.enterMission.buttonOne.text = "Mission"
        binding.enterMissionTargetAmnt.buttonOne.text = "Amount"
        binding.enterMissionDate.buttonOne.text = "Date"
        binding.enterMissionTime.buttonOne.text = "Time"

        binding.enterMission.goalsEditText.hint = "Your Mission"
        binding.enterMissionTargetAmnt.goalsEditText.hint = "Amount"
        binding.enterMissionTime.goalsEditText.hint = "Mission ends at"
        binding.enterMissionDate.goalsEditText.hint = "DD/MM/YY"

    }
}