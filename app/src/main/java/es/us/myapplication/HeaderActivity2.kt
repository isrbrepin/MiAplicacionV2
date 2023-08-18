package es.us.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.OnBackPressedDispatcher

class HeaderActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_header2)

    }
    override fun onBackPressed() {
        finish()

        this@HeaderActivity2.overridePendingTransition(
            R.anim.left_in,
            R.anim.left_out
        )
    }
}

