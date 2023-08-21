package es.us.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun openInfoActivity(view: View) {
        val intent = Intent(this, InfoActivity::class.java)
        startActivity(intent)
        this@MainActivity.overridePendingTransition(
            R.anim.left_in,
            R.anim.left_out
        )
    }
    fun openPreoperatorioActivity(view: View) {
        val intent = Intent(this, PreoperatorioActivity::class.java)
        startActivity(intent)
    }
    fun openPostoperatorioActivity(view: View) {
        val intent = Intent(this, PostoperatorioActivity::class.java)
        startActivity(intent)
    }
    fun openHelpActivity(view: View) {
        val intent = Intent(this, HelpActivity::class.java)
        startActivity(intent)
    }
}