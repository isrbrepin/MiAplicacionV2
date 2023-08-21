package es.us.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HeaderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_header)

    }
    fun openHelpActivity(view: View) {
        // Mostrar un Toast con información de contacto
        val contactoInfo = "Información de contacto:\nCorreo: example@example.com\nTeléfono: +123456789"
        Toast.makeText(this, contactoInfo, Toast.LENGTH_LONG).show()
    }


}