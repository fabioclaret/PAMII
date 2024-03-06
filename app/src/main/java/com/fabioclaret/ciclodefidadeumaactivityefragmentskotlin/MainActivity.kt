package com.fabioclaret.ciclodefidadeumaactivityefragmentskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fabioclaret.ciclodefidadeumaactivityefragmentskotlin.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)

        binding.tableLayout.addOnTabSelectedListener(
            object : TabLayout.OnTabSelectedListener{
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    when( tab?.position){
                        0->supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.fragment_container, FirstFragment())
                            .commit()
                        1->supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.fragment_container, SecondFragment())
                            .commit()
                        2->supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.fragment_container, ThirdFragment())
                            .commit()
                    }
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    TODO("Not yet implemented")
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                    TODO("Not yet implemented")
                }


            }
        )
    }
}
