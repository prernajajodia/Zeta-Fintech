package com.zeta.zetafintech.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zeta.zetafintech.R
import com.zeta.zetafintech.Utils
import com.zeta.zetafintech.databinding.FragmentMissionPopUpBinding

class MissionPopUpFragment : Fragment() {

    private var _binding: FragmentMissionPopUpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMissionPopUpBinding.inflate(inflater, container, false)
        val root: View = binding.root

        Utils.blackIconsStatusBar(activity, R.color.light_bg)

        binding.enterMission.buttonOne.text = "Mission"
        binding.enterMissionTargetAmnt.buttonOne.text = "Amount"
        binding.enterMissionDate.buttonOne.text = "Date"
        binding.enterMissionTime.buttonOne.text = "Time"

        binding.enterMission.goalsEditText.hint = "Your Mission"
        binding.enterMissionTargetAmnt.goalsEditText.hint = "Amount"
        binding.enterMissionTime.goalsEditText.hint = "Mission ends at"
        binding.enterMissionDate.goalsEditText.hint = "DD/MM/YY"
        return root
    }
}