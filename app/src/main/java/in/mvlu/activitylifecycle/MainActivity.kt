package `in`.mvlu.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var tvLifecycle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvLifecycle = findViewById(/* id = */ R.id.tv_lifecycle)
        tvLifecycle.text = "OnCreate"
        Toast.makeText(this,"OnCreate",Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        tvLifecycle.text = "onStart"
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        tvLifecycle.text = "onResume"
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        tvLifecycle.text = "onPause"
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        tvLifecycle.text = "onStop"
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        tvLifecycle.text = "onRestart"
        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        tvLifecycle.text = "onDestroy"
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show()
    }

}