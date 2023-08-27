import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.Practice.food.LoginTabFragment
import com.Practice.food.SignupTabFragment


import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class LoginAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val tabCount: Int
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return tabCount
    }

    override fun createFragment(position: Int): Fragment {
        // Return the appropriate fragment based on the position
        return when (position) {
            0 -> LoginTabFragment()  // Replace with your actual Sign In Fragment
            1 -> SignupTabFragment()  // Replace with your actual Sign Up Fragment
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}
