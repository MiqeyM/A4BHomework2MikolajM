package com.daftmobile.a4bhomework2

import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redButton: Button = findViewById(R.id.red)
        redButton.setOnClickListener { view -> openDialog(view)
        }

        val greenButton: Button = findViewById(R.id.green)
        greenButton.setOnClickListener { view -> openDialog(view)
        }

        val blueButton: Button = findViewById(R.id.blue)
        blueButton.setOnClickListener { view -> openDialog(view)
        }

    }

    private fun openDialog(v : View){
        val builder = AlertDialog.Builder(this)
        val color : String
        when (v.id) {
            R.id.red -> color = "red"
            R.id.blue -> color = "blue"
            R.id.green -> color = "green"
            else -> color = "Unknown color"
        }

        builder.setMessage(getString(R.string.tap_message,color))
        builder.apply {
            setPositiveButton(R.string.ok,
                    DialogInterface.OnClickListener { dialog, id ->
                        // User clicked OK button
                    })
        }

            val dialog: AlertDialog? = builder.create()

        dialog?.show()



    }
}
