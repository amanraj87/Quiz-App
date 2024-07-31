package com.example.quizapp.utils

import com.example.quizapp.model.Question
import com.example.quizapp.R

object Constants {

    const val USERNAME="user_name"
    const val TOTAL_QUESTIONS="total_questions"
    const val SCORE="correct_answers"

    fun getQuestions(): MutableList<Question> {
        val questions= mutableListOf<Question>()

        val quest1=Question(
            1,
            "What Country does this flag Belong?",
            R.drawable.australia,
            "Cuba","Australia","India","Brazil",2
        )
        questions.add(quest1)
        val quest2=Question(
            2,
            "What Country does this flag Belong?",
            R.drawable.brazil,
            "Finland","Australia","India","Brazil",4
        )
        questions.add(quest2)
        val quest3=Question(
            3,
            "What Country does this flag Belong?",
            R.drawable.canada,
            "Italy","Canada","India","Brazil",2
        )
        questions.add(quest3)
        val quest4=Question(
            4,
            "What Country does this flag Belong?",
            R.drawable.egypt,
            "Canada","Australia","Egypt","Germany",3
        )
        questions.add(quest4)
        val quest5=Question(
            5,
            "What Country does this flag Belong?",
            R.drawable.england,
            "Italy","England","India","Brazil",2
        )
        questions.add(quest5)
        val quest6=Question(
            6,
            "What Country does this flag Belong?",
            R.drawable.germany,
            "Egypt","Australia","Germany","Cuba",3
        )
        questions.add(quest6)
        val quest7=Question(
            7,
            "What Country does this flag Belong?",
            R.drawable.india,
            "Italy","Australia","India","Brazil",3
        )
        questions.add(quest7)
        val quest8=Question(
            8,
            "What Country does this flag Belong?",
            R.drawable.united_kingdom,
            "USA","England","NewZealand","UK",4
        )
        questions.add(quest8)
        val quest9=Question(
            9,
            "What Country does this flag Belong?",
            R.drawable.united_states,
            "Italy","USA","India","Brazil",2
        )
        questions.add(quest9)
        val quest10=Question(
            10,
            "What Country does this flag Belong?",
            R.drawable.austria,
            "Italy","USA","Austria","Brazil",3
        )
        questions.add(quest10)
        return questions
    }
}