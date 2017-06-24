package com.example.marcin.bmi_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val bmiCalc = BmiCalc()

    var mass: Int = 0
    var height: Int = 0
    var bmi: Float = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_button_oblicz.setOnClickListener {
            mass = main_edittext_waga.text.toString().toInt()
            height = main_edittext_wzrost.text.toString().toInt()

            bmi = bmiCalc.count(mass = mass, height = height)

            main_label_bmi.setText(bmi.toString())
        }
    }
}
