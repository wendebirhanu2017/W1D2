package com.example.w1d2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var foodList = ArrayList(listOf("Hamburger", "Pizza", "Mexican", "American", "Chinese"))

        decideBtn.setOnClickListener{
            var randomNumber = Random.nextInt(0,foodList.size)
            randText.text = foodList[randomNumber]
        }

        addBtn.setOnClickListener{
            var value: String?= edit.text.toString()
            if(value?.length!! >0) {
                foodList.add(edit.text.toString())
                edit.text.clear()
            }
        }
    }
}