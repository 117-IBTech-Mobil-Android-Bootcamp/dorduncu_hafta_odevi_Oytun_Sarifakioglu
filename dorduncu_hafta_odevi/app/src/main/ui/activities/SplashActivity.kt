package com.oytuns.myapplication.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.oytuns.myapplication.R
import kotlinx.android.synthetic.main.fragment_login.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        //val checkBox = findViewById<View>(R.id.checkBox)
        if(checkBox.isChecked){

        }else{
            findViewById<View>(R.id.action_loginFragment_to_homePage)
        }
    }
}