package com.zeta.zetafintech.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.zeta.zetafintech.R
import com.zeta.zetafintech.Utils
import com.zeta.zetafintech.adapters.GoalsAdapter
import com.zeta.zetafintech.databinding.FragmentGoalsBinding
import com.zeta.zetafintech.models.GoalsModel

class GoalsFragment : Fragment() {

    private val mutableGoalsModel: MutableList<GoalsModel> = mutableListOf()
    private var _binding: FragmentGoalsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGoalsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        Utils.blackIconsStatusBar(activity, R.color.light_bg)
        initGoalsModels()
        binding.goalsList.adapter = GoalsAdapter(mutableGoalsModel)

        binding.addGoals.setOnClickListener {
            findNavController().navigate(GoalsFragmentDirections.actionGoalsFragmentToGoalsPopUpFragment())
        }

        return root
    }

    private fun initGoalsModels() {
        var i = 0

        while (i < 10) {
            mutableGoalsModel.add(i, GoalsModel(""))
            i++
        }
    }
}