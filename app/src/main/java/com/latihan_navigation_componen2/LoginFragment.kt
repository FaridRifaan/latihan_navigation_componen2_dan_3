package com.latihan_navigation_componen2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.latihan_navigation_componen2.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonLogin.setOnClickListener{
            val nameuser = binding.inputUsernameLogin.text.toString()
            val bund = Bundle()
            bund.putString("NAMEUSER", nameuser)
            findNavController().navigate(R.id.action_loginFragment2_to_homeFragment2, bund)
        }
        binding.textSign.setOnClickListener{
          findNavController().navigate(R.id.action_loginFragment2_to_registerFragment2)
        }

    }

}