package com.kenneth.tourdelta
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kenneth.tourdelta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myItemAdapter: Item_Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val display: List<Item_Data_Class> = listOf(
            Item_Data_Class(
                 1
            ),

            Item_Data_Class( 1),

            Item_Data_Class(
                1),
            Item_Data_Class(
                 1),


        )

        myItemAdapter= Item_Adapter(display) // empty list
        binding.recycler.adapter =myItemAdapter



    }
}