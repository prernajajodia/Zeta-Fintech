package com.zeta.zetafintech

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zeta.zetafintech.adapters.MissionAdapter
import com.zeta.zetafintech.databinding.ActivityMissionBinding
import com.zeta.zetafintech.models.MissionModel

class MissionActivity : AppCompatActivity() {

    private val missionList: MutableList<MissionModel> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMissionBinding = ActivityMissionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Utils.blackIconsStatusBar(this, R.color.light_bg)

        initMissionList()
        binding.missionList.adapter = MissionAdapter(missionList)


    }

    private fun initMissionList() {

        var i = 0

        while (i < 10) {
            missionList.add(i, MissionModel(""))
            i++
        }

    }
}
