package com.Practice.food

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class SignupTabFragment : Fragment() {
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var button: AppCompatButton
    private lateinit var mobileNumber: EditText
    private lateinit var confirmPassword: EditText

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.signup_tab_fragment, container, false)
        email = rootView.findViewById(R.id.email)
        password = rootView.findViewById(R.id.password)
        button = rootView.findViewById(R.id.button)
        mobileNumber = rootView.findViewById(R.id.mobile_number)
        confirmPassword = rootView.findViewById(R.id.confirm_password)
        email.translationY = 300f
        password.translationY = 300f
        button.translationY = 300f
        mobileNumber.translationY = 300f
        confirmPassword.translationY = 300f

        val v = 1f
        email.alpha = v
        password.alpha = v
        button.alpha = v
        mobileNumber.alpha = v
        confirmPassword.alpha = v

        email.animate().translationY(0f).alpha(1f).setDuration(1000).setStartDelay(400).start()
        password.animate().translationY(0f).alpha(1f).setDuration(1000).setStartDelay(400).start()
        button.animate().translationY(0f).alpha(1f).setDuration(1000).setStartDelay(400).start()
        mobileNumber.animate().translationY(0f).alpha(1f).setDuration(1000).setStartDelay(400)
            .start()
        confirmPassword.animate().translationY(0f).alpha(1f).setDuration(1000).setStartDelay(400)
            .start()
        return rootView
    }
}