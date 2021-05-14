package com.example.autohide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imagehide= findViewById<Button>(R.id.hideImage)

        var image =findViewById<ImageView>(R.id.image1)
        var textView= findViewById<TextView>(R.id.textview)


        imagehide.setOnClickListener {

            if (image.visibility == View.VISIBLE) {
                if(textView.visibility == View.VISIBLE){
                    image.visibility = View.GONE
                    textView.visibility= View.GONE
                }
                else if(textView.visibility == View.GONE){
                    textView.visibility= View.VISIBLE
                }

            } else if (image.visibility == View.GONE) {
                if (textView.visibility== View.VISIBLE){
                    image.visibility = View.VISIBLE
                }
                else if(textView.visibility == View.GONE) {
                    image.visibility = View.VISIBLE
                }
            }


        }
    }
}