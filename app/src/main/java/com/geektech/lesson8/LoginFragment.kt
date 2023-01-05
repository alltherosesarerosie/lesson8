package com.geektech.lesson8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geektech.lesson8.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private var characterr: ArrayList<Characterr> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = CharacterAdapter(characterr, this::onClick)
        binding.charRv.adapter = adapter
    }

    private fun onClick(position: Int){
        val character1 = Characterr(characterr[position].img, characterr[position].name, characterr[position].age)
        findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToMainFragment(character1))

    }

    private fun loadData() {
        characterr.add(Characterr("Bill Cipher", "1500", "https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        characterr.add(Characterr("Mabel Pines","13","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        characterr.add(Characterr("Dipper Pines","13","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        characterr.add(Characterr("Grunkle Stan","56","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        characterr.add(Characterr("Grunkle Ford","56","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        characterr.add(Characterr("Soos","28","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        characterr.add(Characterr("Wendy","16","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        characterr.add(Characterr("Pacifica","14","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        characterr.add(Characterr("Waddles","1","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        characterr.add(Characterr("Candy Chiu","13","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        characterr.add(Characterr  ("Grenda","14","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))

    }


}