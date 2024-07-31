package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizapp.ui.QuestionsActivity
import com.example.quizapp.utils.Constants

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val startButton: Button =findViewById(R.id.button_start)
        val editTextName:EditText=findViewById(R.id.name)

        //Go to QuestionsActivity after clicking start if editTextName is not empty
        startButton.setOnClickListener {
            if(editTextName.text.isNotEmpty()){
                Intent(this@MainActivity,QuestionsActivity::class.java).also {
                    it.putExtra(Constants.USERNAME,editTextName.text.toString())
                    startActivity(it)
                    finish()
                }
            }
            else{
                Toast.makeText(this@MainActivity,"Please Enter Your Name",Toast.LENGTH_LONG
                ).show()
            }
        }

    }
}