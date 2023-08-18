package es.us.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PostoperatorioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postoperatorio)
    }
    fun openAltaActivity(view: View) {
        val intent = Intent(this, AltaActivity::class.java)
        startActivity(intent)
    }
    fun openOstomiaActivity(view: View) {
        val intent = Intent(this, OstomiaActivity::class.java)
        startActivity(intent)
    }
}