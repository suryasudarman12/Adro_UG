package com.example.petermuan11_71170231

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore



class MainActivity : AppCompatActivity() {
    val firestore: FirebaseFirestore? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNama = findViewById<EditText>(R.id.editNama)
        val editNIM = findViewById<EditText>(R.id.editNIM)
        val editIPK= findViewById<EditText>(R.id.editTIPK)
        val btnSimpan = findViewById<Button>(R.id.btnSimpan)
        val btnCari = findViewById<Button>(R.id.btnCari)
        val Output = findViewById<TextView>(R.id.Output)

        btnSimpan.setOnClickListener {
            val mahasiswa = Mahasiswa(editNama.text.toString(), editNIM.text.toString(), editIPK.text.toString().toFloat())
            editNama.setText("")
            editNIM.setText("")
            editIPK.setText("")

            firestore?.collection("mahasiswa")?.add(mahasiswa)

        }
        btnCari.setOnClickListener {
            firestore?.collection("mahasiswa")?.document(editNIM.text.toString())?.get()!!
                .addOnSuccessListener { doc ->
                    Output.setText(doc.data.toString())

                }
        }
    }
}