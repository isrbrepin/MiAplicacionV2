package es.us.myapplication.ui.suelopelvico.incontinencia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import es.us.myapplication.R

class PreoperatorioIncontinenciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preoperatorio_incontinencia)
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
        val intent = Intent(this, AnestesiaIncontinenciaActivity::class.java)
        startActivity(intent)
    }
    fun openIngresoActivity(view: View) {
        val intent = Intent(this, IngresoIncontinenciaActivity::class.java)
        startActivity(intent)
    }
    fun openPreparacionActivity(view: View) {
        val intent = Intent(this, PreparacionIncontinenciaActivity::class.java)
        startActivity(intent)
    }
    fun openHospitalActivity(view: View) {
        val intent = Intent(this, HospitalIncontinenciaActivity::class.java)
        startActivity(intent)
    }
}