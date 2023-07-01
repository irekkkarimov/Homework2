package com.itis.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.itis.homework2.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    var binding : FragmentSettingsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSettingsBinding.bind(view)

        binding?.run {
            btnToSeparated.setOnClickListener {
                val bundle = Bundle()
                bundle.putString("CLASS_NAME", "SettingsFragment")
                findNavController().navigate(R.id.action_settingsFragment_to_separatedFragment,
                    bundle)
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}