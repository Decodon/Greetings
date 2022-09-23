package ie.wit.greetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ie.wit.greetings.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.greetingButton.setOnClickListener {
            val greetingText = getString(R.string.greeting_text)
            Toast.makeText(this, greetingText, Toast.LENGTH_LONG).show()
        }

        binding.secondGreetingButton.setOnClickListener {
            val secondGreetingText = getString(R.string.second_greeting_text)
            Toast.makeText(this, secondGreetingText, Toast.LENGTH_LONG).show()
        }
    }
}