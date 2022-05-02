package com.example.pertemuan9_71170231

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.example.pertemuan9_71170231.databinding.ActivityMainBinding
import android.widget.EditText




open class MainActivity : AppCompatActivity() {
    var sp: SharedPreferences?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

    btnLogin.setOnClickListener {
       val user = username.text.toString()
        val pass = password.text.toString()

        sp = getSharedPreferences("MYPREF", MODE_PRIVATE)

        val userDetail = sp?.getString(user + pass + "data","username dan password benar!!")

        sp?.edit()?.putString("tampilan", userDetail)?.commit()

        val intent = Intent(this,Tampilan::class.java)
        intent.putExtra("User", username.text.toString())
        intent.putExtra("password", password.text.toString() )
        startActivity(intent)
    }

    }
}