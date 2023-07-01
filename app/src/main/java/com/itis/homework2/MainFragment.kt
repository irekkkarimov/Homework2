package com.itis.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.itis.homework2.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    var binding : FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding?.run {
            btnToSettings.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_settingsFragment)
            }
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}