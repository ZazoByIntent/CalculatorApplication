package com.example.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculatorapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    fun calculate(first: Int, second: Int, operation: String) : Int
    {
        if(operation == "add")
        {
            return first+second
        }
        else if (operation == "subtract")
        {
            return first-second
        }
        else {
            return -1
        }
    }

    fun onClickFirst(view: View?){
        val first = binding.etFirstInput.text.toString().toInt()
        val second = binding.etSecondInput.text.toString().toInt()
        val operation = "add"
        val result = calculate(first, second, operation)
        binding.tvOutput.text = result.toString()
    }

    fun onClickSecond(view: View?){
        val first = binding.etFirstInput.text.toString().toInt()
        val second = binding.etSecondInput.text.toString().toInt()
        val operation = "subtract"
        val result = calculate(first, second, operation)
        binding.tvOutput.text = result.toString()
    }
}