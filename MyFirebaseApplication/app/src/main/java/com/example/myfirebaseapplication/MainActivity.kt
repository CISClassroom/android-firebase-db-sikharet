package com.example.myfirebaseapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.security.AuthProvider

class MainActivity : AppCompatActivity() {

    lateinit var authProvider: AuthProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        button.setOnClickListener({v->singIn()})
        button2.setOnApplyWindowInsetsListener({v->singOot()})

        var gso = GoogleSignInOptions.Builder(
            GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_cloent_id))
            .requestEmail()
            .build()

        googleClient = GoogleSignIn.getClient(this,gso)
        auth = FirebaseAuth.getInstance()


    }
    private fun singOut(){
        anth.signOut()
        googleClient.signOut().addOnCompleteListener(this)( it:Task<Void!>)
        updateUI( user: null)
    }
}

private fun updateUI(user: FirebaseUser?) {
    if (user == null){
        tvStatus.text = "Signed Out"
    }else{
        tvStatus.text = "Sign In as" + user.email
    }
}
private fun singIn(){
    var signInent = googleCli
}
override fun  onActivityResult(requestCode: Int, resultCode: Int, date)
