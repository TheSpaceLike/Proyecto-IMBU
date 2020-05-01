package acatictla.alan.proyecto_imbu

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
//import androidx.test.orchestrator.junit.BundleJUnitUtils.getResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import kotlinx.android.synthetic.main.activity_login_iniciar.*


class MainActivity : AppCompatActivity() {
    val RC_SIGN_IN = 123
    lateinit var mGoogleSignInClient: GoogleSignInClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_registrar_usuario)

        setContentView(R.layout.activity_login_iniciar)
        val gso =
            GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build()
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        login_google.setOnClickListener{
            val signInIntent = mGoogleSignInClient.signInIntent
            startActivityForResult(signInIntent, RC_SIGN_IN)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) { // The Task returned from this call is always completed, no need to attach
// a listener.
            val task =
                GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }
    }

    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account =
                completedTask.getResult(ApiException::class.java)
            // Signed in successfully, show authenticated UI.
            updateUI(account)
        } catch (e: ApiException) { // The ApiException status code indicates the detailed failure reason.
// Please refer to the GoogleSignInStatusCodes class reference for more information.
            //Log.w(FragmentActivity.TAG, "signInResult:failed code=" + e.statusCode)
            println(e)
            Toast.makeText(this,"La autentifacion falló con "+e.message,Toast.LENGTH_LONG).show()
            Toast.makeText(this, "Abriendo pantalla principal... Aun así...",Toast.LENGTH_SHORT).show()
            updateUI(null)
        }
    }

    private fun updateUI(account: GoogleSignInAccount?) {
        if(account != null){
            val intent = Intent(this, MenuPrincipalActivity::class.java)
            intent.putExtra("name", account.displayName)
            intent.putExtra("email", account.email)
            var nombre: String  = account.displayName.toString()
            Toast.makeText(this,"Usuario: "+ nombre +" se autentificó con exito",Toast.LENGTH_SHORT).show()
            startActivity(intent)
        } else  {
            val intent = Intent(this, MenuPrincipalActivity::class.java)
            startActivity(intent)
        }

    }
}
