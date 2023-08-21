package es.us.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CancerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cancer)
    }
    fun openColonActivity(view: View) {
        val intent = Intent(this, ColonActivity::class.java)
        startActivity(intent)
    }
    fun openRectoActivity(view: View) {
        val intent = Intent(this, RectoActivity::class.java)
        startActivity(intent)
    }
    fun openHelpActivity(view: View) {
        val intent = Intent(this, HelpActivity::class.java)
        startActivity(intent)
    }
}