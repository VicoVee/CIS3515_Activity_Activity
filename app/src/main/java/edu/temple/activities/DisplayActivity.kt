package edu.temple.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // TODO Step 3: Extract transferred value and use for lyricsDisplayView text size
        with (findViewById<TextView>(R.id.lyricsDisplayTextView)) {
            textSize = intent.getIntExtra(DISPLAY_KEY, 0).toFloat()
        }

//        findViewById<Button>(R.id.returnButton).setOnClickListener{
//            val returnIntent = Intent(this, MainActivity::class.java)
//            returnIntent.putExtra(RETURN_KEY, "Wow you came back")
//            startActivity(returnIntent)
//
//        }


    }
}