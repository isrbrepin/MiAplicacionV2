package es.us.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class HeaderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_header)
    }
    fun openOverlay(view: View) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val overlayFragment = HelpFragment() // Aquí asumo que tienes una instancia de HelpFragment
        fragmentTransaction.add(R.id.overlay_container, overlayFragment)
        fragmentTransaction.addToBackStack(null) // Agregar a la pila de fragmentos

        fragmentTransaction.commit()
    }
}