package com.refactor.workshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        findViewById<Button>(R.id.main_btn).setOnClickListener {
            val detailsIntent = Intent(it.context, DetailsActivity::class.java)
            detailsIntent.putExtra("Details", "SomeJsonObject")
            startActivity(detailsIntent)
        }
    }
}