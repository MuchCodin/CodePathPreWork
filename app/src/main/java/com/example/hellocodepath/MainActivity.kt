package com.example.hellocodepath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //logic to know if user has tapped the button
        findViewById<Button>(R.id.changeTextColor).setOnClickListener {

            // for logcat to filter activity by name (Elton)
            Log.i("Elton", "Tapped on button")

            // setting the color of the textview
            findViewById<TextView>(R.id.textView).setTextColor( getResources().getColor(R.color.brick_red))

        }
        findViewById<Button>(R.id.backgroundColorChange).setOnClickListener {
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundView).setBackgroundColor( getResources().getColor(R.color.white))
        }
    }

    fun getSet(view: View) {
        val editTxt = findViewById<EditText>(R.id.editTextTextPersonName);
        val msg = editTxt.text.toString();
        val txtView = findViewById<TextView>(R.id.textView).apply {
            text = msg
        }
    }
}