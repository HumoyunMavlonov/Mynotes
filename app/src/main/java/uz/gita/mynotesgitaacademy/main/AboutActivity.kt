package uz.gita.mynotesgitaacademy.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.gita.mynotesgitaacademy.databinding.AboutNotesBinding


class AboutActivity : AppCompatActivity() {
    private lateinit var binding: AboutNotesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= AboutNotesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}