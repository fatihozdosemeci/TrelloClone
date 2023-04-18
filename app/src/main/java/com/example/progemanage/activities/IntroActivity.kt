package com.example.progemanage.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import com.example.progemanage.R

class IntroActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        var btn_sign_in: Button = findViewById(R.id.btn_sign_in_intro)
        btn_sign_in.setOnClickListener{
            startActivity(Intent(this, SingInActivity::class.java))

        }

        var btn_sign_up: Button = findViewById(R.id.btn_sign_up_intro)
        btn_sign_up.setOnClickListener{
            startActivity(Intent(this, SignUpActivity::class.java))

        }

    }
}