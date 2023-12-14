package com.ld.unittest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ld.unittest.R
import com.ld.unittest.viewmodel.HotKeyViewModel

class NetActivityActivity : AppCompatActivity() {
    private val hotKeyViewModel: HotKeyViewModel by lazy {
        ViewModelProvider(this)[HotKeyViewModel::class.java]
    }

    private val tvContent: TextView by lazy { findViewById(R.id.tv_content) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_net_activity)
        observe()
        getHotKeyData()
    }

    private fun getHotKeyData() {
        hotKeyViewModel.getHotKey()
    }

    private fun observe() {
        hotKeyViewModel.hotKeyLiveData.observe(this, Observer {
            tvContent.text = it.data.toString()
        })
    }
}