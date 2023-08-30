package es.us.myapplication.ui.suelopelvico.prolapso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.us.myapplication.R

class AnestesiaProlapsoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anestesia_prolapso)
        val btnOpenOverlay: android.widget.Button = findViewById(R.id.btn_open_overlay)

        btnOpenOverlay.setOnClickListener {
            val dialogView = layoutInflater.inflate(R.layout.custom_dialog, null)
            val builder = androidx.appcompat.app.AlertDialog.Builder(this, R.style.CustomAlertDialog)
            builder.setView(dialogView)

            val dialog = builder.create()

            val layoutParams = android.view.WindowManager.LayoutParams().apply {
                copyFrom(dialog.window?.attributes)
                gravity = android.view.Gravity.TOP // Cambiar a la posición que desees
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
}