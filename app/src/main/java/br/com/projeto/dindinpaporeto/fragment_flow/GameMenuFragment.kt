package br.com.projeto.dindinpaporeto.fragment_flow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import br.com.projeto.dindinpaporeto.R
import br.com.projeto.dindinpaporeto.databinding.FragmentGameMenuBinding
import br.com.projeto.dindinpaporeto.databinding.FragmentQuizBinding

class GameMenuFragment : Fragment() {

    private var _bindind: FragmentGameMenuBinding? = null
    private val binding get() = _bindind!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _bindind = FragmentGameMenuBinding.inflate(inflater, container, false)

        val root: View = binding.root
        _bindind?.goToOtherFragmentButton?.setOnClickListener { it ->
            val action = GameMenuFragmentDirections.actionGameMenuToQuizFragment()
            Navigation.findNavController(binding.root).navigate(action)
        }

        return root

    }
}