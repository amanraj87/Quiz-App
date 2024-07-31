package com.example.quizapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizapp.MainActivity
import com.example.quizapp.R
import com.example.quizapp.utils.Constants

class ResultActivity : AppCompatActivity() {

    private lateinit var textViewScore:TextView
    private lateinit var textViewName:TextView
    private lateinit var finishButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textViewName=findViewById(R.id.textview_name)
        textViewScore=findViewById(R.id.textview_score)
        finishButton=findViewById(R.id.finish_button)

        val totalQuestions=intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val score=intent.getIntExtra(Constants.SCORE,0)
        val name=intent.getStringExtra(Constants.USERNAME)

        "Your score is $score out of $totalQuestions".also { textViewScore.text = it }
        textViewName.text=name
        finishButton.setOnClickListener{
            Intent(this@ResultActivity,MainActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}