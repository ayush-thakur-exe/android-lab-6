package com.project.activitylifecycle

import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
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
import com.project.activitylifecycle.ui.theme.ActivityLifecycleTheme

class MainActivity : ComponentActivity() {

    private var etUsername : EditText? = null
    private var etPassword: EditText? = null
    private var btnLogin : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Main Activity", "onCreate")

        super.setContentView(R.layout.activity_main)
        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Main Activity", "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Main Activity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main Activity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main Activity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main Activity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main Activity", "onDestroy")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d("Main Activity", "onConfigurationChange")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("Main Activity", "onSaveInstance")
        outState.putString("username", etUsername?.text.toString())
        outState.putString("password", etPassword?.text.toString())
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Log.d("Main Activity", "onRestoreInstanceState")
        if (savedInstanceState != null) {
            etUsername?.setText(savedInstanceState.getString("username"))
            etPassword?.setText(savedInstanceState.getString("password"))
        }
    }
}