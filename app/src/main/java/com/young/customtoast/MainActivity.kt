package com.young.customtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttom_general_toast_main_activity.setOnClickListener {

            showToast(Constants.TOAST_TYPE_GENERAL, "Genetal Toast")
        }

        buttom_success_toast_main_activity.setOnClickListener {
            showToast(Constants.TOAST_TYPE_SUCCESS, "Success Toast")
        }

        buttom_warning_toast_main_activity.setOnClickListener {
            showToast(Constants.TOAST_TYPE_WARNING, "Warning Toast")
        }

        buttom_error_toast_main_activity.setOnClickListener {
            showToast(Constants.TOAST_TYPE_ERROR, "Error Toast")
        }

    }

    private fun showToast(typeToast: Int, message: String){

        val toastView = layoutInflater.inflate(R.layout.layout_toast,findViewById(R.id.layout_toast_container))

        val toastContainer = toastView.findViewById<LinearLayout>(R.id.layout_toast_container)
        val imageIcon = toastView.findViewById<ImageView>(R.id.image_icon_toast)
        val textMessage = toastView.findViewById<TextView>(R.id.text_message_toast)

        when (typeToast) {
            Constants.TOAST_TYPE_GENERAL -> {
                toastContainer.setBackgroundResource(R.drawable.toast_general_background)
                imageIcon.setImageResource(R.drawable.ic_general_toast)
                textMessage.text = message
            }

            Constants.TOAST_TYPE_SUCCESS -> {
                toastContainer.setBackgroundResource(R.drawable.toast_success_background)
                imageIcon.setImageResource(R.drawable.ic_success_toast)
                textMessage.text = message
            }

            Constants.TOAST_TYPE_WARNING -> {
                toastContainer.setBackgroundResource(R.drawable.toast_warning_background)
                imageIcon.setImageResource(R.drawable.ic_warning_toast)
                textMessage.text = message
            }

            Constants.TOAST_TYPE_ERROR -> {
                toastContainer.setBackgroundResource(R.drawable.toast_error_background)
                imageIcon.setImageResource(R.drawable.ic_error_toast)
                textMessage.text = message
            }
        }


        with(Toast(applicationContext)){
            duration = Toast.LENGTH_SHORT
            view = toastView
            show()
        }

    }
}
