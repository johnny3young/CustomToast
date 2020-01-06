package com.young.customtoast

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Duration

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttom_general_toast_main_activity.setOnClickListener {

            showGeneralToast()
        }

    }

    private fun showGeneralToast(){

        val toastView = layoutInflater.inflate(R.layout.layout_toast,findViewById(R.id.layout_toast_container))

        with(Toast(applicationContext)){
            duration = Toast.LENGTH_SHORT
            view = toastView
            show()
        }

    }
}
