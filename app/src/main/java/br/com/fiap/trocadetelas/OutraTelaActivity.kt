package br.com.fiap.trocadetelas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_outra_tela.*

class OutraTelaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outra_tela)


        val extras = intent.extras

        if (extras != null){
            val user = extras.getString("user")
            textSaudacao.setText("Olá ${user}")
        }

    }
}
