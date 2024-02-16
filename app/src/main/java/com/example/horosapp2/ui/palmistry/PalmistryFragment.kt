package com.example.horosapp2.ui.palmistry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horosapp2.R
import com.example.horosapp2.databinding.FragmentLuckBinding
import com.example.horosapp2.databinding.FragmentPalmistryBinding

class PalmistryFragment : Fragment() {


    private var _binding: FragmentPalmistryBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPalmistryBinding.inflate(layoutInflater,container, false)
        return binding.root
    }


}