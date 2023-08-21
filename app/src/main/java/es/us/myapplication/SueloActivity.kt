package es.us.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SueloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suelo)
    }
    fun openHelpActivity(view: View) {
        val intent = Intent(this, HelpActivity::class.java)
        startActivity(intent)
    }
}