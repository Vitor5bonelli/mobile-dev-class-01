package com.example.aula03

import android.app.ActionBar.LayoutParams
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBar
import com.example.aula03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amb: ActivityMainBinding
    private lateinit var dinamicoEt: EditText
    private companion object{
        const val CICLO_PDM = "CICLO_PDM"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        val parametroView = ActionBar.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT
        )

        parametroView.setMargins(0, 0, 0, 0)
        dinamicoEt = EditText(this)
        dinamicoEt.hint = "EditText dinâmico"
        dinamicoEt.layoutParams = parametroView
        amb.root.addView(dinamicoEt)

        Log.v(CICLO_PDM, "onCreate: Iniciando ciclo COMPLETO")
    }

    override fun onStart() {
        super.onStart()

        Log.v(CICLO_PDM, "onStart: Iniciando ciclo VISÍVEL")
    }

    override fun onResume() {
        super.onResume()

        Log.v(CICLO_PDM, "onResume: Iniciando ciclo de PRIMEIRO PLANO")
    }

    override fun onPause() {
        super.onPause()

        Log.v(CICLO_PDM, "onPause: Finalizando ciclo de PRIMEIRO PLANO")
    }

    override fun onStop() {
        super.onStop()

        Log.v(CICLO_PDM, "onStop: Finalizando ciclo VISÍVEL")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.v(CICLO_PDM, "onDestroy: Finalizando ciclo COMPLETO")
    }
}