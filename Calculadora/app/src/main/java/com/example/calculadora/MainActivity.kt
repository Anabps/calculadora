package com.example.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var txt_valor_1: EditText? = null
    private var txt_valor_2: EditText? = null
    private var txt_resultado: TextView? = null
    private var rb1: RadioButton? = null
    private var rb2: RadioButton? = null
    private var rb3: RadioButton? = null
    private var rb4: RadioButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_valor_1 = findViewById<View>(R.id.editTextTextPersonName) as EditText
        txt_valor_2 = findViewById<View>(R.id.editTextTextPersonName2) as EditText
        txt_resultado = findViewById<View>(R.id.textView2) as TextView
        rb1 = findViewById<View>(R.id.radioButton) as RadioButton
        rb2 = findViewById<View>(R.id.radioButton2) as RadioButton
        rb3 = findViewById<View>(R.id.radioButton3) as RadioButton
        rb4 = findViewById<View>(R.id.radioButton4) as RadioButton
    }

    //@SuppressLint("SetTextI18n")
    fun calcular(view: View?) {
        val valor1: Int
        val valor2: Int
        var resultado: Double
        valor1 = txt_valor_1!!.text.toString().toInt()
        valor2 = txt_valor_2!!.text.toString().toInt()
        if (rb1!!.isChecked) {
            resultado = valor1 + valor2.toDouble()
            txt_resultado!!.text = java.lang.Double.toString(resultado)
            Log.d("myTag", "This is my message");
        }
        if (rb2!!.isChecked) {
            resultado = valor1 - valor2.toDouble()
            txt_resultado!!.text = java.lang.Double.toString(resultado)
            if (rb3!!.isChecked) {
                resultado = valor1 * valor2.toDouble()
                txt_resultado!!.text = java.lang.Double.toString(resultado)
            }
            if (rb4!!.isChecked) {
                if (valor2 != 0) {
                    resultado = valor1 / (valor2 * 1.0)
                    txt_resultado!!.text = java.lang.Double.toString(resultado)
                } else {
                    Toast.makeText(this, "Divisão não permitida", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}