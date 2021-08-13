package com.zeta.zetafintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zeta.zetafintech.databinding.FragmentTransactionClickBinding

class TransactionClickFragment : Fragment(){
    private var _binding: FragmentTransactionClickBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentTransactionClickBinding.inflate(inflater, container, false)
        val root: View = binding.root

        Utils.blackIconsStatusBar(activity, R.color.light_bg)

        return root

    }
}