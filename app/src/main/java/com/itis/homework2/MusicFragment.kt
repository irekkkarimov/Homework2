package com.itis.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.itis.homework2.databinding.FragmentMusicBinding

class MusicFragment : Fragment(R.layout.fragment_music) {

    var binding : FragmentMusicBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMusicBinding.bind(view)

        binding?.run {
            btnToSeparated.setOnClickListener {
                val bundle = Bundle()
                bundle.putString("CLASS_NAME", "MusicFragment")
                findNavController().navigate(R.id.action_musicFragment_to_separatedFragment,
                    bundle)
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}