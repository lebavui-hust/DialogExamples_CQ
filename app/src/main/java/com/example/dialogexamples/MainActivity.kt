package com.example.dialogexamples

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_show).setOnClickListener {
            val items = arrayOf("Item 1", "Item 2", "Item 3")
            val selections = BooleanArray(items.size)

            val dialogView = layoutInflater.inflate(R.layout.layout_dialog, null)
            val editEmail = dialogView.findViewById<EditText>(R.id.edit_email)
            val editPassword = dialogView.findViewById<EditText>(R.id.edit_password)

            val dialog = AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("This is a title")
                .setView(dialogView)
                .setPositiveButton("Yes") { _, _ ->
                    val email = editEmail.text.toString()
                    Log.v("TAG", "Email: $email")  }
                .setNeutralButton("Cancel", null)
                .create()

            // dialog.setCanceledOnTouchOutside(false)

            dialog.show()
        }
    }
}