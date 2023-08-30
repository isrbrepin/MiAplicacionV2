package es.us.myapplication.ui.cirugiaabdominal.recto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import es.us.myapplication.R
import es.us.myapplication.ui.cirugiaabdominal.colon.AnestesiaColonActivity
import es.us.myapplication.ui.cirugiaabdominal.colon.HospitalColonActivity
import es.us.myapplication.ui.cirugiaabdominal.colon.IngresoColonActivity
import es.us.myapplication.ui.cirugiaabdominal.colon.PreoperatorioActivity
import es.us.myapplication.ui.cirugiaabdominal.colon.PreparacionColonActivity

class PreoperatorioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preoperatorio)
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
    }

    private fun Int.dpToPx(): Int {
        val scale = resources.displayMetrics.density
        return (this * scale + 0.5f).toInt()

    }
    fun openAnestesiaActivity(view: View) {
        val intent = Intent(this, AnestesiaRectoActivity::class.java)
        startActivity(intent)
    }
    fun openIngresoActivity(view: View) {
        val intent = Intent(this, IngresoRectoActivity::class.java)
        startActivity(intent)
    }
    fun openPreparacionActivity(view: View) {
        val intent = Intent(this, PreparacionRectoActivity::class.java)
        startActivity(intent)
    }
    fun openHospitalActivity(view: View) {
        val intent = Intent(this, HospitalRectoActivity::class.java)
        startActivity(intent)
    }
}