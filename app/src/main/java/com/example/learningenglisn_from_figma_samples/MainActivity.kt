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
import com.example.learningenglisn_from_figma_samples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // создается для binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // сохраняем экземпляр привязки, layoutInflater связывает разметку с activity
        enableEdgeToEdge()

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

//      Есть два способа подтянуть ID элементов
        // findViewById
        // ViewBinding

        // findViewById:
//        setContentView(R.layout.activity_main)
//        val tvQuestionWord: TextView = findViewById(R.id.tvQuestionWord)
//        tvQuestionWord.text = "Dream"
//        tvQuestionWord.setTextColor(Color.BLUE)
//
//        // НАИБОЛЕЕ ПРЕДПОЧТИТЕЛЬНО
//        // цвет buttonBlueColor лежит в values/colors.xml
//        tvQuestionWord.setTextColor(ContextCompat.getColor(this, R.color.buttonBlueColor))

        //ViewBinding
        //Включить зависимость в кфг градла build.gradle.kts
        setContentView(binding.root)


        binding.tvQuestionWord.text = "Dream"
        binding.tvQuestionWord.setTextColor(ContextCompat.getColor(this, R.color.buttonBlueColor))

    }
}