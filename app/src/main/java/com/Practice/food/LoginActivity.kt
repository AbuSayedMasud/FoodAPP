package com.Practice.food

import LoginAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class LoginActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    private lateinit var facebook: FloatingActionButton
    private lateinit var google: FloatingActionButton
    private lateinit var twitter: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tabLayout = findViewById(R.id.tab_layout)
        viewPager = findViewById(R.id.view_pager)
        facebook = findViewById(R.id.fab_facebook)
        google = findViewById(R.id.fab_google)
        twitter = findViewById(R.id.fab_twitter)
        tabLayout.addTab(tabLayout.newTab().setText("Sign In"))
        tabLayout.addTab(tabLayout.newTab().setText("Sign Up"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
//        val adapter=LoginAdapter(supportFragmentManager,this,tabLayout.tabCount)
//        viewPager.adapter=adapter
//        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
//            override fun onPageScrollStateChanged(state: Int) {}
//
//            override fun onPageScrolled(
//                position: Int,
//                positionOffset: Float,
//                positionOffsetPixels: Int
//            ) {}
//
//            override fun onPageSelected(position: Int) {
//                tabLayout.getTabAt(position)?.select()
//            }
//        })
//
//        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
//            override fun onTabSelected(tab: TabLayout.Tab) {
//                viewPager.currentItem = tab.position
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab) {}
//
//            override fun onTabReselected(tab: TabLayout.Tab) {}
//        })
        val adapter = LoginAdapter(supportFragmentManager, lifecycle, tabLayout.tabCount)
        viewPager.adapter = adapter

        // Use TabLayoutMediator to associate TabLayout with ViewPager
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            if (position == 0) {
                tab.text = "Sign In"
            } else if (position == 1) {
                tab.text = "Sign Up"
            }
        }.attach()

        facebook.translationY=300f
        google.translationY=300f
        twitter.translationY=300f
        tabLayout.translationY=300f

        val v = 1f
        facebook.alpha=v
        twitter.alpha=v
        google.alpha=v
        tabLayout.alpha=v

        facebook.animate().translationY(0f).alpha(1f).setDuration(1000).setStartDelay(400).start()
        twitter.animate().translationY(0f).alpha(1f).setDuration(1000).setStartDelay(400).start()
        google.animate().translationY(0f).alpha(1f).setDuration(1000).setStartDelay(400).start()
        tabLayout.animate().translationY(0f).alpha(1f).setDuration(1000).setStartDelay(400).start()


    }
}