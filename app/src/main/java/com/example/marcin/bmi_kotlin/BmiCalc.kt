package com.example.marcin.bmi_kotlin

import android.widget.Toast

/**
 * Created by Marcin on 21.06.2017.
 */

class BmiCalc{

    //class BmiCalc constructor() {
    //}

    fun count(mass : Int, height : Int, isKgCm  : Boolean = true) : Float{

        if(mass == 0 || height == 0){
            return 0f
        }
        if(isKgCm){
            val heightInMeters = height/100f
            return mass / (heightInMeters*heightInMeters)
        }
        else{
            return 703f * (mass / (height*height))
        }
    }
}