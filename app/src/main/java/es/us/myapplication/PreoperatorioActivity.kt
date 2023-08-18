package es.us.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PreoperatorioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preoperatorio)
    }
    fun openAnestesiaActivity(view: View) {
        val intent = Intent(this, AnestesiaActivity::class.java)
        startActivity(intent)
    }
    fun openPreparacionActivity(view: View) {
        val intent = Intent(this, PreparacionActivity::class.java)
        startActivity(intent)
    }
    fun openIngresoActivity(view: View) {
        val intent = Intent(this, IngresoActivity::class.java)
        startActivity(intent)
    }
    fun openHospitalActivity(view: View) {
        val intent = Intent(this, HospitalActivity::class.java)
        startActivity(intent)
    }
}