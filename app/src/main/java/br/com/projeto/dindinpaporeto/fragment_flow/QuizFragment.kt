package br.com.projeto.dindinpaporeto.fragment_flow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.projeto.dindinpaporeto.R
import br.com.projeto.dindinpaporeto.databinding.FragmentQuizBinding

class QuizFragment : Fragment() {

    private var _binding: FragmentQuizBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQuizBinding.inflate(inflater, container, false)

        return binding?.root
    }

}