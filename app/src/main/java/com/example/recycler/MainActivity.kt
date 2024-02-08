package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var newsArray: ArrayList<News>
    lateinit var imageId:Array<Int>
    lateinit var heading:Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imageId= arrayOf(R.drawable.download,R.drawable.person1,R.drawable.download,R.drawable.download,R.drawable.person1,R.drawable.download,R.drawable.person1,R.drawable.download,R.drawable.person1,R.drawable.download,R.drawable.download,R.drawable.person1,R.drawable.download,R.drawable.person1)
        heading= arrayOf("A local hero bravely rescued","a stranded cat from a tree.","Firefighters were initially called", "but a bystander named Sarah Jones managed","to climb the tree and bring the feline", "down safely from the rod","ushwiuhuiuiwuisi jkehjehdh","A local hero bravely rescued","a stranded cat from a tree.","Firefighters were initially called", "but a bystander named Sarah Jones managed","to climb the tree and bring the feline", "down safely from the rod","ushwiuhuiuiwuisi jkehjehdh")


        newsArray= arrayListOf<News>()
        getUserData()
        binding.recycle.adapter=Adapter(newsArray)


        binding.recycle.layoutManager=LinearLayoutManager(this)
        binding.recycle.setHasFixedSize(true)


    }

    private fun getUserData(){
        for (i in imageId.indices){
            val news=News(imageId[i],heading[i])
            newsArray.add(news)
        }
    }

}