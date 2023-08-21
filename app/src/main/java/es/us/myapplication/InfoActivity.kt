package es.us.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

    }
    fun openCancerActivity(view: View) {
        val intent = Intent(this, CancerActivity::class.java)
        startActivity(intent)
    }
    fun openProctologiaActivity(view: View) {
        val intent = Intent(this, ProctologiaActivity::class.java)
        startActivity(intent)
    }
    fun openSueloActivity(view: View) {
        val intent = Intent(this, SueloActivity::class.java)
        startActivity(intent)
    }
    fun openHelpActivity(view: View) {
        val intent = Intent(this, HelpActivity::class.java)
        startActivity(intent)
    }
}