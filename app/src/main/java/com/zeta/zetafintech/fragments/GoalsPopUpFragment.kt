package com.zeta.zetafintech.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zeta.zetafintech.R
import com.zeta.zetafintech.Utils
import com.zeta.zetafintech.databinding.FragmentGoalsPopUpBinding

class GoalsPopUpFragment : Fragment() {

    private var _binding: FragmentGoalsPopUpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentGoalsPopUpBinding.inflate(inflater, container, false)
        val root: View = binding.root

        Utils.blackIconsStatusBar(activity, R.color.light_bg)

        binding.enterGoal.buttonOne.text = "Goal"
        binding.enterGoalAmnt.buttonOne.text = "Amount"
        binding.enterGoalAmntFreq.buttonOne.text = "Frequency"

        binding.enterGoalAmntFreq.goalsEditText.hint = "amount at frequency"
        binding.enterGoalAmnt.goalsEditText.hint = "amount"
        binding.enterGoal.goalsEditText.hint = "enter your goal"

        return root
    }
}