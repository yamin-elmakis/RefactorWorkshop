package com.refactor.workshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val title = findViewById<TextView>(R.id.details_text)
        intent.getStringExtra("Details")?.let {
            title.text = it
        }
    }
}