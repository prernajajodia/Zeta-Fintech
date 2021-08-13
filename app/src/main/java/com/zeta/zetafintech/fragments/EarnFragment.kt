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
import com.zeta.zetafintech.databinding.FragmentEarnBinding
import com.zeta.zetafintech.models.GoalsModel

class EarnFragment : Fragment() {

    private val mutableGoalsModel: MutableList<GoalsModel> = mutableListOf()
    private var _binding: FragmentEarnBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEarnBinding.inflate(inflater, container, false)
        val root: View = binding.root

        Utils.blackIconsStatusBar(activity, R.color.light_bg)

        initGoalsModels()
        binding.coursesList.adapter = GoalsAdapter(mutableGoalsModel)
        binding.gamesList.adapter = GoalsAdapter(mutableGoalsModel)

        binding.redeemButton.setOnClickListener {
            findNavController().navigate(EarnFragmentDirections.actionNavigationEarnToRedeemFragment())
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