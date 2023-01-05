package com.geektech.lesson8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.geektech.lesson8.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var navArgs:MainFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            navArgs = MainFragmentArgs.fromBundle(it)
        }
        Glide.with(binding.imgIv2).load("https://upload.wikimedia.org/wikipedia/commons/d/dc/Young_cats.jpg")
            .into(binding.imgIv2)
        binding.nameTv2.text=navArgs.name.age
        binding.ageTv2.text=navArgs.name.img
    }

}