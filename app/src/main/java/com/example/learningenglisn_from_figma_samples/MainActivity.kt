package com.example.learningenglisn_from_figma_samples

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import com.example.learningenglisn_from_figma_samples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // создается для binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // сохраняем экземпляр привязки, layoutInflater связывает разметку с activity
        setContentView(binding.root)
        // neutral
        // correct
        // incorrect
        binding.layoutAnswer3.setOnClickListener {
            markAnswerCorrect()
        }
    }

    private fun markAnswerCorrect() {
        binding.layoutAnswer3.background = ContextCompat.getDrawable(
            this@MainActivity,
            R.drawable.shape_rounded_containers_correct
        )
        binding.btnSkip.isVisible = false
        binding.layoutCorrectAnswerContinue.isVisible = true
    }
}