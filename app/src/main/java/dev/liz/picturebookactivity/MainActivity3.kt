package dev.liz.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var btnBack0:Button
lateinit var btnNext3:Button
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btnBack0=findViewById(R.id.btnBack0)
        btnBack0.setOnClickListener {
            val intent=Intent(this,MyActivity2::class.java)
            startActivity(intent)
        }
        btnNext3=findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent=Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
    }
}