package com.zeta.zetafintech.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.zeta.zetafintech.R
import com.zeta.zetafintech.Utils
import com.zeta.zetafintech.databinding.FragmentTransactionHistoryBinding

class TransactionHistoryFragment : Fragment() {
    private var _binding: FragmentTransactionHistoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentTransactionHistoryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        Utils.blackIconsStatusBar(activity, R.color.light_bg)

        binding.buttonTrans1.setOnClickListener {
            findNavController().navigate(TransactionHistoryFragmentDirections.actionTransactionHistoryFragmentToTransactionClickFragment())
        }
        binding.buttonTrans2.setOnClickListener {
            findNavController().navigate(TransactionHistoryFragmentDirections.actionTransactionHistoryFragmentToTransactionClickFragment())
        }
        binding.buttonTrans3.setOnClickListener {
            findNavController().navigate(TransactionHistoryFragmentDirections.actionTransactionHistoryFragmentToTransactionClickFragment())
        }
        binding.buttonTrans4.setOnClickListener {
            findNavController().navigate(TransactionHistoryFragmentDirections.actionTransactionHistoryFragmentToTransactionClickFragment())
        }

        return root

    }
}