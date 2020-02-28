package com.cassiolucianodasilva.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cassiolucianodasilva.myapplication.R
import com.cassiolucianodasilva.myapplication.infra.MotivationConstants
import com.cassiolucianodasilva.myapplication.infra.SecurityPreferences
import com.cassiolucianodasilva.myapplication.repository.Mock
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var  mSecurityPreferences: SecurityPreferences
    private var mPhraseFilter : Int = MotivationConstants.PHRASEFILTER.ALL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSecurityPreferences = SecurityPreferences(this)
        textUserName.text = mSecurityPreferences.getString(MotivationConstants.KEY.PERSONAL_NAME)

        //logica inicial de selção

        imageAll.setColorFilter(resources.getColor(R.color.buttonSelectedMenu))
        handleNewPhrase()

        buttonMessage.setOnClickListener(this)
        imageLove.setOnClickListener(this)
        imageHappy.setOnClickListener(this)
        imageAll.setOnClickListener(this)

        if(supportActionBar!= null){
            supportActionBar!!.hide()
        }


    }
    override fun onClick(view: View) {

        val id =  view.id
        val listFilter = listOf(R.id.imageAll ,R.id.imageHappy, R.id.imageLove)

        if(id == R.id.buttonMessage){

            handleNewPhrase()

        }else if (id in listFilter){

            handleFilter(id)
        }

    }

    private fun handleFilter(id: Int){

        imageAll.setColorFilter(resources.getColor(R.color.menuItemUnSelected))
        imageHappy.setColorFilter(resources.getColor(R.color.menuItemUnSelected))
        imageLove.setColorFilter(resources.getColor(R.color.menuItemUnSelected))

        when(id){
            R.id.imageAll ->{

                imageAll.setColorFilter(resources.getColor(R.color.buttonSelectedMenu))
                mPhraseFilter  = MotivationConstants.PHRASEFILTER.ALL

            }

            R.id.imageHappy->{

                imageHappy.setColorFilter(resources.getColor(R.color.buttonSelectedMenu))
                mPhraseFilter  = MotivationConstants.PHRASEFILTER.HAPPY
            }

            R.id.imageLove ->{

                imageLove.setColorFilter(resources.getColor(R.color.buttonSelectedMenu))
                mPhraseFilter  = MotivationConstants.PHRASEFILTER.LOVE
            }

        }

    }

    private fun handleNewPhrase(){

        val phrase = Mock().getPhrase(mPhraseFilter)
        textPhrase.text = phrase

        //simplificado
        //textPhrase.text =  Mock().getPhrase(mPhraseFilter)

    }

}
