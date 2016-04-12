package com.ohmerhe.kolley.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ohmerhe.kolley.request.request

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        request<Weather>(this) {

            url("http://api.openweathermap.org/data/2.5/weather")

            params {
                "q" - "shanghai"
            }

            success { weather ->
                Log.d("MainActivity", weather.toString())
            }

            fail { error ->
                Log.d("MainActivity", error.toString())
            }

        }
    }
}