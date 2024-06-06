package com.example.listandgridview

import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Virat Kohli", "Rohit Sharma", "Steve Smith",
            "Kane Williamson", "Ross Taylor"
        )

        var playerNames = arrayOf("Cristiano Ronaldo", "Joao Felix", "Bernado Silva", "Andre    Silve", "Bruno Fernandez", "William Carvalho", "Nelson Semedo", "Pepe", "Rui Patricio")
        var playerImages = intArrayOf(R.drawable.sttb, R.drawable.sttb, R.drawable.sttb, R.drawable.sttb, R.drawable.sttb, R.drawable.sttb, R.drawable.sttb, R.drawable.sttb, R.drawable.sttb)

//        var listView = findViewById<ListView>(R.id.listView)
//        arrayAdapter = ArrayAdapter(this,
//            android.R.layout.simple_list_item_1, users)
//        listView.adapter = arrayAdapter

        val gridView = findViewById<GridView>(R.id.gridView)

        val mainAdapter = cardAdapter(this@MainActivity, playerNames, playerImages)
        gridView.adapter = mainAdapter
        gridView.onItemClickListener = OnItemClickListener { _, _, position, _ ->
            Toast.makeText(applicationContext, "You CLicked " + playerNames[+position],
                Toast.LENGTH_SHORT).show()
        }
    }
}