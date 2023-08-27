package com.Practice.food

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import org.w3c.dom.Text

class LoginTabFragment : Fragment() {

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var button: AppCompatButton
    private lateinit var forgetPassword: TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.login_tab_fragment, container, false)
        email = rootView.findViewById(R.id.email)
        password = rootView.findViewById(R.id.password)
        button = rootView.findViewById(R.id.button)
        forgetPassword = rootView.findViewById(R.id.forget_text)
        email.translationY=300f
        password.translationY=300f
        button.translationY=300f
        forgetPassword.translationY=300f

        val v = 1f
        email.alpha=v
        password.alpha=v
        button.alpha=v
        forgetPassword.alpha=v

        email.animate().translationY(0f).alpha(1f).setDuration(1000).setStartDelay(400).start()
        password.animate().translationY(0f).alpha(1f).setDuration(1000).setStartDelay(400).start()
        button.animate().translationY(0f).alpha(1f).setDuration(1000).setStartDelay(400).start()
        forgetPassword.animate().translationY(0f).alpha(1f).setDuration(1000).setStartDelay(400).start()
        return rootView
    }
}