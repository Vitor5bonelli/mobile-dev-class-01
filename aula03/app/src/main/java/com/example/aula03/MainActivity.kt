package com.example.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.aula03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amb: ActivityMainBinding
    private companion object{
        const val CICLO_PDM = "CICLO_PDM"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

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