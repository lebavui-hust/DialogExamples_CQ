package com.example.dialogexamples

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.ProgressDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_show).setOnClickListener {
//            val items = arrayOf("Item 1", "Item 2", "Item 3")
//            val selections = BooleanArray(items.size)

            val dialogView = layoutInflater.inflate(R.layout.layout_dialog, null)
            val editEmail = dialogView.findViewById<EditText>(R.id.edit_email)
            val editPassword = dialogView.findViewById<EditText>(R.id.edit_password)

//            val dialog = AlertDialog.Builder(this)
//                .setIcon(android.R.drawable.ic_dialog_alert)
//                .setTitle("This is a title")
//                .setView(dialogView)
//                .setPositiveButton("Yes") { _, _ ->
//                    val email = editEmail.text.toString()
//                    Log.v("TAG", "Email: $email")  }
//                .setNeutralButton("Cancel", null)
//                .create()

//            val dialog = Dialog(this)
//            dialog.setContentView(dialogView)
//
//            dialog.findViewById<Button>(R.id.button_ok).setOnClickListener {
//                val email = editEmail.text.toString()
//                Log.v("TAG", "Email: $email")
//                dialog.dismiss()
//            }
//
//            dialog.findViewById<Button>(R.id.button_cancel).setOnClickListener {
//                dialog.dismiss()
//            }
//
//            dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
//
//            // dialog.setCanceledOnTouchOutside(false)
//            dialog.show()

//            TestDialogFragment().show(supportFragmentManager, "TAG")

//            val c = Calendar.getInstance()
//            val day = c.get(Calendar.DAY_OF_MONTH)
//            val month = c.get(Calendar.MONTH)
//            val year = c.get(Calendar.YEAR)
//            val dialog = DatePickerDialog(this, { _, year, month, day ->
//                Log.v("TAG", "$year - $month - $day")
//            }, year, month, day)
//            dialog.show()

//            val c = Calendar.getInstance()
//            val minute = c.get(Calendar.MINUTE)
//            val hour = c.get(Calendar.HOUR)
//            val dialog = TimePickerDialog(this, { _, hour, minute ->
//                Log.v("TAG", "$hour - $minute")
//            }, hour, minute, true)
//            dialog.show()

//            Toast.makeText(this, "This is a toast", Toast.LENGTH_LONG).show()

            Snackbar.make(it, "This is a snackbar", Snackbar.LENGTH_LONG)
                .setAction("ACTION") {  }
                .show()
        }

        findViewById<Button>(R.id.button_call).setOnClickListener {
//            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://hust.edu.vn"))
//            startActivity(intent)

//            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:0987654321"))
//            intent.putExtra("sms_body", "Hello.")
//            startActivity(intent)

//            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:0987654321"))
//            startActivity(intent)

//            val intent = Intent(Intent.ACTION_SEND)
//            intent.type = "text/plain"
//            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("tester1@gmail.com", "tester2@gmai.com"))
//            intent.putExtra(Intent.EXTRA_SUBJECT, "Email subject")
//            intent.putExtra(Intent.EXTRA_TEXT, "Email content")
//            startActivity(intent)

//            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Bachkhoa"))
//            startActivity(intent)

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("param1", 123)
            intent.putExtra("param2", 3.14)
            intent.putExtra("param3", "Hello World")
            startActivity(intent)
        }
    }
}