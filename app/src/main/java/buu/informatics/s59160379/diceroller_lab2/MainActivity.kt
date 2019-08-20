package buu.informatics.s59160379.diceroller_lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val RollButton: Button = findViewById(R.id.roll_button)
        roll_button.setOnClickListener{rollDice()}
    }

    private fun rollDice() {
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
    }
}
