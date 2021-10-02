package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TableRow
import android.widget.TextView
import android.graphics.Color
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener{

            if(
                Text_version.text.toString().isEmpty()
                || Text_code.text.toString().isEmpty()) {
                Toast.makeText(this, "Text are Empty Please Enter ", Toast.LENGTH_LONG).show()
            }
            else {
                val tableRow = TableRow(getApplicationContext())
                val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
                layoutParams.setMargins(15, 10, 15, 10)
                tableRow.setLayoutParams(layoutParams)

                val value1 = TextView(this)
                value1.text = Text_version.text.toString()
                value1.layoutParams = layoutParams
                value1.textSize = 20F
                value1.setBackgroundColor(Color.parseColor("#E4A3BB"))
                val value2 = TextView(this)
                value2.text = Text_code.text.toString()
                value2.layoutParams = layoutParams
                value2.textSize = 20F
                value2.setBackgroundColor(Color.parseColor("#E4A3BB"))
                tableRow.addView(value1, 0)
                tableRow.addView(value2, 1)
                table.addView(tableRow)
                Text_version.text.clear()
                Text_code.text.clear()

            }

        }

    }

}