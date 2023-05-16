package com.example.wearablerecyclerviewlab

import android.app.Activity
import android.os.Bundle
import androidx.wear.widget.WearableLinearLayoutManager
import com.example.wearablerecyclerviewlab.databinding.WearableRecyclerViewBinding

class WearableRecyclerViewActivity : Activity() {

    private lateinit var binding: WearableRecyclerViewBinding
    private lateinit var adapter: WearableRecyclerViewAdapter
    private lateinit var technologyList: MutableList<Technology>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = WearableRecyclerViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        technologyList = ArrayList()
        technologyList.add(Technology(1, R.drawable.java_icon, getString(R.string.technology_1)))
        technologyList.add(Technology(2, R.drawable.kotlin_icon, getString(R.string.technology_2)))
        technologyList.add(Technology(3, R.drawable.retrofit_icon, getString(R.string.technology_3)))
        technologyList.add(Technology(4, R.drawable.volley_icon, getString(R.string.technology_4)))
        technologyList.add(Technology(5, R.drawable.spring_icon, getString(R.string.technology_5)))

        adapter = WearableRecyclerViewAdapter(technologyList, this)
        binding.wearableRecyclerView.isEdgeItemsCenteringEnabled = true
        binding.wearableRecyclerView.layoutManager = WearableLinearLayoutManager(this)
        binding.wearableRecyclerView.isCircularScrollingGestureEnabled = true;
        binding.wearableRecyclerView.isEdgeItemsCenteringEnabled = true
        binding.wearableRecyclerView.adapter = adapter
    }
}

data class Technology(var id: Int, var image: Int, var name: String)