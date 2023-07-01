package com.itis.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.itis.homework2.databinding.FragmentSeparatedBinding

class SeparatedFragment : Fragment(R.layout.fragment_separated) {

    var binding : FragmentSeparatedBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSeparatedBinding.bind(view)

        val class_name = arguments?.getString("CLASS_NAME")
        Snackbar.make(view, class_name.toString(), Snackbar.LENGTH_LONG).show()

        binding?.run {
            btnBack.setOnClickListener {
                when (class_name) {
                    "MainFragment" -> findNavController().navigate(R.id.action_separatedFragment_to_mainFragment)
                    "MusicFragment" -> findNavController().navigate(R.id.action_separatedFragment_to_musicFragment)
                    "NewsFragment" -> findNavController().navigate(R.id.action_separatedFragment_to_newsFragment)
                    "ProfileFragment" -> findNavController().navigate(R.id.action_separatedFragment_to_profileFragment)
                    "SettingsFragment" -> findNavController().navigate(R.id.action_separatedFragment_to_settingsFragment)
                }
            }
        }
    }
}