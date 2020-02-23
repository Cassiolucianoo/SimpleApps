package com.cassiolucianodasilva.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.cassiolucianodasilva.myapplication.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var  mSecurityPreferences: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mSecurityPreferences = SecurityPreferences(this)

        if(supportActionBar != null){
            supportActionBar!!.hide()
        }
        buttonSave.setOnClickListener(this)

        //salvando  dados usando o sharedpreferences
        val shared = this.getSharedPreferences("mensagem", Context.MODE_PRIVATE)
        shared.edit().putString("key", "values").apply()
    }

    override fun onClick(view: View?) {
        val id = view?.id
        if(id == R.id.buttonSave){
            handlesave()

        }

    }

    private fun handlesave(){
        val name = editName.text.toString()

//      se nome for diferente
        if(name !=""){

            mSecurityPreferences.storeString("name",name)

            // avança para activity principal
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
//          outra forma de navegar entre activity
           // startActivity(Intent(this,MainActivity::class.java))

        }
        //Se o campo estiver em branco, alerta o usuario para cadastrar
        else{
            Toast.makeText(this,getString(R.string.tost_informename),Toast.LENGTH_SHORT).show()
        }
    }
}

