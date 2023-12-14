package com.ld.unittest.robolectric.ui

import android.content.Intent
import android.widget.Button
import com.ld.unittest.R
import com.ld.unittest.ui.JumpActivity
import com.ld.unittest.ui.MainActivity
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.Shadows.shadowOf


/**
 *Create on 2023/12/13 14:59
 *author cqx
 */
@RunWith(RobolectricTestRunner::class)
class MainActivityTest {

    private lateinit var mainActivity: MainActivity

    @Before
    fun setUp() {
        Robolectric.buildActivity(MainActivity::class.java).use { controller ->
            controller.setup()
            mainActivity = controller.get()
        }
    }

    @Test
    fun testMainActivityNotNull() {
        assertNotNull(mainActivity)
    }

    @Test
    @Throws(Exception::class)
    fun clickingChangeTextButton_shouldChangeResultsButtonText() {
        val btnChangeText = mainActivity.findViewById<Button>(R.id.btn_change_text)
        assertEquals(
            btnChangeText.text.toString(),
            mainActivity.getString(R.string.unit_text_change_text_before)
        )
        btnChangeText.performClick()
        assertEquals(
            btnChangeText.text.toString(),
            mainActivity.getString(R.string.unit_text_change_text_after)
        )
    }

    @Test
    fun clickingJump_shouldStartJumpActivity() {
        mainActivity.findViewById<Button>(R.id.btn_jump).performClick()
        val expectedIntent = Intent(mainActivity, JumpActivity::class.java)
        val actual: Intent = shadowOf(RuntimeEnvironment.getApplication()).nextStartedActivity
        assertEquals(expectedIntent.component, actual.component)
    }

}