package com.example.dialogexamples

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class TestDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
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

        val dialog = Dialog(requireContext())
        dialog.setContentView(dialogView)

        dialog.findViewById<Button>(R.id.button_ok).setOnClickListener {
            val email = editEmail.text.toString()
            Log.v("TAG", "Email: $email")
            dialog.dismiss()
        }

        dialog.findViewById<Button>(R.id.button_cancel).setOnClickListener {
            dialog.dismiss()
        }

        dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        // dialog.setCanceledOnTouchOutside(false)
        // dialog.show()
        return dialog
    }

}