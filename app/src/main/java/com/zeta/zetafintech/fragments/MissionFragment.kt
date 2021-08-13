package com.zeta.zetafintech.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.zeta.zetafintech.R
import com.zeta.zetafintech.Utils
import com.zeta.zetafintech.adapters.MissionAdapter
import com.zeta.zetafintech.databinding.FragmentMissionBinding
import com.zeta.zetafintech.models.MissionModel

class MissionFragment : Fragment() {

    private val missionList: MutableList<MissionModel> = mutableListOf()
    private var _binding: FragmentMissionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMissionBinding.inflate(inflater, container, false)
        val root: View = binding.root

        Utils.blackIconsStatusBar(activity, R.color.light_bg)
        initMissionList()
        binding.missionList.adapter = MissionAdapter(missionList)

        binding.missionButton.setOnClickListener {
            findNavController().navigate(MissionFragmentDirections.actionMissionFragmentToMissionPopUpFragment())
        }

        return root
    }

    private fun initMissionList() {

        var i = 0

        while (i < 10) {
            missionList.add(i, MissionModel(""))
            i++
        }

    }
}
