package com.oytuns.myapplication.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.oytuns.myapplication.R
import com.oytuns.myapplication.utils.gone
import com.oytuns.myapplication.utils.visible
/*import com.patikadev.deneme1.R
import com.patikadev.deneme1.utils.gone
import com.patikadev.deneme1.utils.visible*/
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navControlelr = findNavController(R.id.nav_host_fragment_container)
        NavigationUI.setupWithNavController(bottomnavigationview, navControlelr)

    }


    fun hideNavigation() {
        bottomnavigationview.postDelayed(
            {
                bottomnavigationview.gone()

            }, 500
        )
    }

    fun showNavigation() {
        bottomnavigationview.postDelayed(
            {
                bottomnavigationview.visible()

            }, 500
        )
    }


}