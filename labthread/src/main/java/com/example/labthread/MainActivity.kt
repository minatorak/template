package com.example.labthread

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var thread: Thread? = null
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCounter.text = ""
        thread = Thread(Runnable {
            for (i in 0..100) {
                count++
                try {
                    Thread.sleep(1000)
                }catch (e:InterruptedException){
                    return@Runnable
                }
                runOnUiThread(Runnable {
                    tvCounter.text = count.toString()
                })
            }
        })
        thread!!.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        thread?.interrupt()
    }
}
