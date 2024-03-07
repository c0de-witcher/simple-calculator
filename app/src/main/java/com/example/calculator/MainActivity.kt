package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.plus.setOnClickListener{
            val input1 = binding.input1.text.toString().toFloat()
            val input2 = binding.input2.text.toString().toFloat()
            binding.output.text = (input1 + input2).toString()
        }
        binding.minus.setOnClickListener{
            val input1 = binding.input1.text.toString().toFloat()
            val input2 = binding.input2.text.toString().toFloat()
            binding.output.text = (input1 - input2).toString()
        }
        binding.divide.setOnClickListener{
            val input1 = binding.input1.text.toString().toFloat()
            val input2 = binding.input2.text.toString().toFloat()
            binding.output.text = (input1 / input2).toString()
        }
        binding.multiple.setOnClickListener{
            val input1 = binding.input1.text.toString().toFloat()
            val input2 = binding.input2.text.toString().toFloat()
            binding.output.text = (input1 * input2).toString()
        }
    }
}