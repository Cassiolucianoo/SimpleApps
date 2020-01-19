package com.example.calculate_the_race

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity(), View.OnClickListener {


    /*********************|
    | * Evento de  Click *|
     *********************/
    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.buttonCalculator){
            handleCalculate()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setTitle("Calculate race ")

        buttonCalculator.setOnClickListener(this)
    }

    /*******************|
    | * Calcular valor *|
     *******************/
    private fun handleCalculate(){

        if (isValid()){

            try {
                                                    /********************************|
                                                    | * Convertendo Texto para float*|
                                                     ********************************/
                val distance =  editDistance.text.toString().toFloat()
                val price =  editPrice.text.toString().toFloat()
                val autonomy =  editAutonomy.text.toString().toFloat()

                /*************************************************|
                | * Obtendo valores distancia x preço / autonomia*|
                 ************************************************/
                val result = ((distance * price) / autonomy)
                textResult.setText("Total em Grana: $result")


            }catch (nfe: NumberFormatException){

                /***************************************|
                | *Toast ( Alerta de mensagem na tela )*|
                 **************************************/
                Toast.makeText(this,getString(R.string.valores_validos), Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this,getString(R.string.valores_validos), Toast.LENGTH_SHORT).show()
        }

    }

    /************************************|
    | * Função validar campos em branco  *|
     ************************************/
    private fun isValid():Boolean{
       return editPrice.text.toString() != ""
                &&editDistance.text.toString() != ""
                &&editAutonomy.text.toString() != ""
                &&editAutonomy.text.toString() != "0"


    }
}
