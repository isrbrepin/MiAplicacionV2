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
import androidx.appcompat.app.AlertDialog

class TransitoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transito)
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

        val textInfo = findViewById<TextView>(R.id.text_info)
        val fullText = getString(R.string.reconstrucci_n_del_tr_nsito)

        // Crear el texto con diferentes partes clicables
        val spannableString = SpannableString(fullText)

        // Definir los clics y sus comportamientos
        val patologiaClick = object : ClickableSpan() {
            override fun onClick(widget: View) {
                val intent = Intent(this@TransitoActivity, PatologiaActivity::class.java)
                startActivity(intent)
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = false
                ds.color = Color.parseColor("#005B14")
            }
        }

        val cirugiaClick = object : ClickableSpan() {
            override fun onClick(widget: View) {
                val intent = Intent(this@TransitoActivity, AbdomenActivity::class.java)
                startActivity(intent)
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = false
                ds.color = Color.parseColor("#005B14")
            }
        }


        // Asignar los clics a las partes correspondientes del texto
        spannableString.setSpan(patologiaClick, 0, 18, 0)
        spannableString.setSpan(cirugiaClick, 21, 38, 0)

        // Asignar el SpannableString al TextView
        textInfo.text = spannableString
        textInfo.movementMethod = LinkMovementMethod.getInstance()

    }
    private fun Int.dpToPx(): Int {
        val scale = resources.displayMetrics.density
        return (this * scale + 0.5f).toInt()
    }
}