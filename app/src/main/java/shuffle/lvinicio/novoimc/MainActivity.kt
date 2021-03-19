package shuffle.lvinicio.novoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.doOnAttach
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setcalc()

            }
    private fun setcalc(){
        altura.doOnAttach{text->

        }
        peso.doOnAttach {text->
        }
        peso.setOnClickListener {
            calc_Imc(peso.text.toString(),altura.text.toString())
        }
    }

//    val inputPeso = findViewById<EditText>(R.id.peso)
//    val inputAltura = findViewById<EditText>(R.id.altura)

    private fun calc_Imc(altura:String, peso:String){

    val peso = peso.toFloatOrNull()
    val altura = altura.toFloatOrNull()

    if(peso!= null && altura != null){
        val imc = (peso /(altura*altura))/100

        Resultado.text = "Seu imc: $imc".format(imc)
    }
    }
}
