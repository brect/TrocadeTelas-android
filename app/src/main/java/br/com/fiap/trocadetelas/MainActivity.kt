package br.com.fiap.trocadetelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun entrar (view: View){

        val usuario = user.text.toString().trim()
        val senha = password.text.toString()

        if (usuario.equals("fiap") && senha.equals("fiap")){
            val intent = Intent(this, OutraTelaActivity::class.java)
            intent.putExtra("user", usuario)
            startActivity(intent)

            user.setText("")
            password.setText("")

            user.requestFocus()

            return
        }

        Toast.makeText(this, "Usuario e/ou Senha incorreta", Toast.LENGTH_LONG).show()
    }
}
