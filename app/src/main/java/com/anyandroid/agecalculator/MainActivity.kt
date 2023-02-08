package com.anyandroid.agecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.anyandroid.agecalculator.databinding.ActivityMainBinding
import com.anyandroid.agecalculator.viewmodel.CalculateAgeViewModel


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val calculateAgeViewModel: CalculateAgeViewModel by viewModels()
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            calculateAgeViewModel.calculateAge(
                binding.editTextName.text.trim().toString(),
                binding.editTextAge.text.trim().toString()
            ).observe(this) { person ->
                binding.textView.text = person.name + " is " + person.age + " years old"
            }

        }
    }
}