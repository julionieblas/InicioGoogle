package nieblas.julio.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iniciogoogle.R
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        val bundle = intent.extras

        if (bundle != null){
            val name = bundle.getString("name")
            val email = bundle.getString("email")
            tv_nombre.setText(name)
            tv_email.setText(email)
        }
        btn_cerrar.setOnClickListener {
            finish()
        }


    }
    override fun onBackPressed() {

    }

    }
