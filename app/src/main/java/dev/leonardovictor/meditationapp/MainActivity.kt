package dev.leonardovictor.meditationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import dev.leonardovictor.meditationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.hide()

        val btnLogIn = binding.activityMainTextviewLogin
        btnLogIn.setOnClickListener(View.OnClickListener {
            openSignInActivity()
        })

        val btnSignIn = binding.activityMainButtonSignup
        btnSignIn.setOnClickListener(View.OnClickListener {
            openWelcomeActivity()
        })
    }

    fun openWelcomeActivity(){
        val intent = Intent(this, WelcomeActivity::class.java)
        startActivity(intent)
    }

    fun openSignInActivity(){
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
}