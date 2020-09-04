package lj.proyects.randomimage


import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

//Declaración de variables
private lateinit var imageView: ImageView
private lateinit var randomBtn: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaración de elementos en XML
        imageView = findViewById(R.id.imageView)
        randomBtn = findViewById(R.id.randomBtn)

        //Creación de array para poder controlar las imágenes
        val cards = intArrayOf(
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
            R.drawable.seven,
            R.drawable.eight,
            R.drawable.nine,
            R.drawable.ten
        )

        //Establece una imagen aleatoria de manera inicial
        imageView.setImageResource(cards[randomImage()])

        //Cambia la imagen conforme se da click al botón
        randomBtn.setOnClickListener {
            imageView.setImageResource(cards[randomImage()])
        }
    }

    //Método que elige un número al azar de la cantidad determinada y lo regresa para visualizarlo en base al Array
    private fun randomImage(): Int {
        val r = Random()
        return r.nextInt(10)
    }
}