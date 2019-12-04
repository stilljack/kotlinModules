package com.example.codecollections.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.codecollections.R
import com.example.codecollections.retrofit.RetroApi
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {
 val retro = RetroApi.Factory.create()
 val arrau = arrayOf<Int>()

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
        message.setOnClickListener{
            //Toast.makeText(it.context,"before return",Toast.LENGTH_SHORT).show()
            return@setOnClickListener
          //  Toast.makeText(it.context,"after return",Toast.LENGTH_SHORT).show()

        }

    }

    fun sauce() :Unit{

    }
}
