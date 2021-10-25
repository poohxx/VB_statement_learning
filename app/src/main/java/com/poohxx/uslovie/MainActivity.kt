package com.poohxx.uslovie

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.poohxx.uslovie.constance.Constance
import com.poohxx.uslovie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {
            Log.d("MyLog","id resource = ${R.drawable.director}")
            val resultValue = bindingClass.edValue.text.toString()
            bindingClass.userPic.visibility = View.VISIBLE
            when(resultValue){
                 Constance.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                     val tempText = "Hello, Mr. Director" +
                             "Your salary is ${Constance.DIRECTOR_Salary}"
                     if (bindingClass.edValue2.text.toString() == Constance.DIRECTOR_PASSWORD){
                         bindingClass.tvResult.text =  tempText
                         bindingClass.userPic.setImageResource(R.drawable.director)
                     }
                     else {
                         bindingClass.tvResult.text =  "Wrong Name Employer or PIN-Code"
                     }
                }
                 Constance.MANAGER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                     val tempText = "Hello, Mr. Manager!" +
                             "Your salary is ${Constance.MANAGER_Salary}"
                     if (bindingClass.edValue2.text.toString() == Constance.MANAGER_PASSWORD){
                         bindingClass.tvResult.text =  tempText
                         bindingClass.userPic.setImageResource(R.drawable.manager)
                     }
                     else {
                         bindingClass.tvResult.text =  "Wrong Name Employer or PIN-Code"
                     }
                }
                 Constance.ENGINEER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                     val tempText= "Hello, Mr. Engineer!" +
                             " Your salary is ${Constance.ENGINEER_Salary}"
                     if (bindingClass.edValue2.text.toString() == Constance.ENGINEER_PASSWORD){
                         bindingClass.tvResult.text =  tempText
                         bindingClass.userPic.setImageResource(R.drawable.engineer)
                     }
                     else {
                         bindingClass.tvResult.text =  "Wrong Name Employer or PIN-Code"
                     }
                }
                 Constance.OPERATOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                     val tempText= "Hello, Mr. Operator!" +
                             " Your salary is ${Constance.OPERATOR_Salary}"
                     if (bindingClass.edValue2.text.toString() == Constance.OPERATOR_PASSWORD){
                         bindingClass.tvResult.text =  tempText
                         bindingClass.userPic.setImageResource(R.drawable.operator)
                     }
                     else {
                         bindingClass.tvResult.text =  "Wrong Name Employer or PIN-Code"
                     }
                }
                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Employee isn't on the nameList"
                }

            }

        }

    }

}