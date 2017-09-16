package com.example.minato.template

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun callService() {
        FakeNetwork.getFakeOrderDetail(object : FakeNetwork.OnResultCallback() {
            fun onOrderDetailCallback(orderDetail: OrderDetail) {
                setOrderDetail(orderDetail)
            }
        })
    }

    private fun setOrderDetail(orderDetail: OrderDetail) {
        // TODO Render orderDetail to Recycler View
    }
}

