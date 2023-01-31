package com.bkm.exa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.bkm.exa.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var doAnimation = false

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            randomAnim()
        }
    }


    private fun myAnimation1(){
        val animation  = AnimationUtils.loadAnimation(this,R.anim.anim_1)
        binding.image.startAnimation(animation)
        animation.setAnimationListener(object :Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {
                doAnimation = true
            }

            override fun onAnimationEnd(animation: Animation?) {
                doAnimation = false
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }
        })
    }
    private fun myAnimation2(){
        val animation  = AnimationUtils.loadAnimation(this,R.anim.anim_5)
        binding.image.startAnimation(animation)
        animation.setAnimationListener(object :Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {
                doAnimation = true
            }

            override fun onAnimationEnd(animation: Animation?) {
                doAnimation = false
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }
        })
    }
    private fun myAnimation3(){
        val animation  = AnimationUtils.loadAnimation(this,R.anim.anim_3)
        binding.image.startAnimation(animation)
        animation.setAnimationListener(object :Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {
                doAnimation = true
            }

            override fun onAnimationEnd(animation: Animation?) {
                doAnimation = false
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }
        })
    }
    private fun myAnimation4(){
        val animation  = AnimationUtils.loadAnimation(this,R.anim.anim_4)
        binding.image.startAnimation(animation)
        animation.setAnimationListener(object :Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {
                doAnimation = true
            }

            override fun onAnimationEnd(animation: Animation?) {
                val animation2  = AnimationUtils.loadAnimation(this@MainActivity,R.anim.anim_42)
                binding.image.startAnimation(animation2)
                animation2.setAnimationListener(object :Animation.AnimationListener{
                    override fun onAnimationStart(animation: Animation?) {

                    }

                    override fun onAnimationEnd(animation: Animation?) {
                        doAnimation = false
                    }

                    override fun onAnimationRepeat(animation: Animation?) {

                    }
                })
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }
        })
    }
    private fun myAnimation5(){
        val animation  = AnimationUtils.loadAnimation(this,R.anim.anim_2)
        binding.image.startAnimation(animation)
        animation.setAnimationListener(object :Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {
                doAnimation = true
            }

            override fun onAnimationEnd(animation: Animation?) {
                doAnimation = false
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }
        })
    }

    private fun randomAnim(){
        if (!doAnimation){
            when(Random.nextInt(5)){
                0->{
                  myAnimation1()
                }
                1->{
                    myAnimation2()
                }
                2->{
                    myAnimation3()
                }
                3->{
                    myAnimation4()
                }
                4->{
                    myAnimation5()
                }
            }
        }
    }

}