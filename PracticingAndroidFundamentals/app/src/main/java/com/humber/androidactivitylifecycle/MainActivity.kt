package com.humber.androidactivitylifecycle
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.humber.androidactivitylifecycle.ui.theme.AndroidActivityLifeCycleTheme
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : ComponentActivity() {

    private var txtLogin: EditText? = null
    private var txtpassword: EditText? = null
    private var btnLogin: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val txtLogin:EditText = findViewById(R.id.login);
        val txtpassword:EditText=findViewById(R.id.password);
        val btnLogin:Button= findViewById(R.id.btn_login);
        Log.d("mainActivity","OnCreate");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("mainActivity","OnRestart");
    }
    override fun onStart() {
        super.onStart()
        Log.d("mainActivity","onStart");
    }

    override fun onResume() {
        super.onResume()
        Log.d("mainActivity","onResume");
    }

    override fun onPause() {
        super.onPause()
        Log.d("mainActivity","onPause");
    }

    override fun onStop() {
        super.onStop()
        Log.d("mainActivity","onStop");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("mainActivity","onDestroy");
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d("mainActivity","onConfigurationChanged");
    }
    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("mainActivity","onSaveInstanceState");
        outState.putString("login",txtLogin?.text.toString());
        outState.putString("Password",txtpassword?.text.toString());
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Log.d("mainActivity","onRestoreInstanceStace");
        var login = savedInstanceState?.getString("login");
        var password = savedInstanceState?.getString("password");
        txtLogin?.setText(login);
        txtpassword?.setText(password)
    }
}
