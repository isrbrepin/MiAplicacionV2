package es.us.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RectoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recto)
    }
    fun openHelpActivity(view: View) {
        val intent = Intent(this, HelpActivity::class.java)
        startActivity(intent)
    }
}