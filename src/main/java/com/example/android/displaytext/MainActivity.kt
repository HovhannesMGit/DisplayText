package com.example.android.displaytext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.output_text)
        val button: Button = findViewById(R.id.click_id)
        val editText: EditText = findViewById(R.id.input_text)

        val input = editText.text

        button.setOnClickListener { textView.setText(input) }





    }
}
