package es.us.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import es.us.myapplication.ui.proctologia.fistula.FistulaActivity
import es.us.myapplication.ui.proctologia.fisura.FisuraActivity
import es.us.myapplication.ui.proctologia.hemorroides.HemorroidesActivity

class ProctologiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proctologia)

        val btnOpenOverlay: Button = findViewById(R.id.btn_open_overlay)

        btnOpenOverlay.setOnClickListener {
            val dialogView = layoutInflater.inflate(R.layout.custom_dialog, null)
            val builder = AlertDialog.Builder(this, R.style.CustomAlertDialog)
            builder.setView(dialogView)

            val dialog = builder.create()

            val layoutParams = WindowManager.LayoutParams().apply {
                copyFrom(dialog.window?.attributes)
                gravity = Gravity.TOP // Cambiar a la posición que desees
                y = 60.dpToPx()
            }
            dialog.window?.attributes = layoutParams

            dialog.show()

        }

        val textInfo = findViewById<TextView>(R.id.text_proctologia)
        val fullText = getString(R.string.text_proctologia)

        // Crear el texto con diferentes partes clicables
        val spannableString = SpannableString(fullText)

        // Definir los clics y sus comportamientos
        val patologiaClick = object : ClickableSpan() {
            override fun onClick(widget: View) {
                val intent = Intent(this@ProctologiaActivity, PatologiaActivity::class.java)
                startActivity(intent)
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = false
                ds.color = Color.parseColor("#ACF0B4")
            }
        }



        // Asignar los clics a las partes correspondientes del texto
        spannableString.setSpan(patologiaClick, 0, 18, 0)

        // Asignar el SpannableString al TextView
        textInfo.text = spannableString
        textInfo.movementMethod = LinkMovementMethod.getInstance()

    }
    private fun Int.dpToPx(): Int {
        val scale = resources.displayMetrics.density
        return (this * scale + 0.5f).toInt()
    }
    fun openHelpActivity(view: View) {
        val intent = Intent(this, HelpActivity::class.java)
        startActivity(intent)
    }
    fun openHemorroidesActivity(view: View) {
        val intent = Intent(this, HemorroidesActivity::class.java)
        startActivity(intent)
        showToast("Patología escogida correctamente")
    }
    fun openFisuraActivity(view: View) {
        val intent = Intent(this, FisuraActivity::class.java)
        startActivity(intent)
        showToast("Patología escogida correctamente")
    }
    fun openFistulaActivity(view: View) {
        val intent = Intent(this, FistulaActivity::class.java)
        startActivity(intent)
        showToast("Patología escogida correctamente")
    }
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}