package space.timporello.lab2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import space.timporello.lab2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewName.text = getText(R.string.name)
        binding.textViewWelcome.text = getText(R.string.welcome)

        binding.button1.text = getText(R.string.first_button)
        binding.button2.text = getText(R.string.second_button)
        binding.button3.text = getText(R.string.third_button)

        binding.button1.setOnClickListener {
            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            val web = Intent(Intent.ACTION_VIEW)
            web.data = Uri.parse("https://github.com/Timporello")
            startActivity(web)
        }

        binding.button3.setOnClickListener {
            intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

    }
}