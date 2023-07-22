package com.example.businesscardapp

import android.content.Intent
import android.net.Uri
import android.provider.ContactsContract.Intents
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.espresso.intent.matcher.IntentMatchers
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BusinessCardAppTest {

    @get:Rule
    val composeTestRule = createComposeRule()



    @Before
    fun setup() {
        androidx.test.espresso.intent.Intents.init()
    }

    @After
    fun tearDown() {
        androidx.test.espresso.intent.Intents.release()
    }

    @Test
    fun doesImageExist() {
        composeTestRule.setContent { MainActivity() }

        composeTestRule.onNodeWithTag("Profile Pic")
    }

    @Test
    fun doesTextExist() {
        composeTestRule.setContent { MainActivity() }

        composeTestRule.onNodeWithText("Thet Pine")

        composeTestRule.onNodeWithText("https://github.com/Thet9354")
        composeTestRule.onNodeWithText("thetpine254@gmail.com")

    }

    @Test
    fun doesIconExist() {
        composeTestRule.setContent { MainActivity() }

        composeTestRule.onNodeWithContentDescription("Phone Icon")
        composeTestRule.onNodeWithContentDescription("Web Icon")

    }

    @Test
    fun doesJobTitleExist() {
        composeTestRule.setContent { MainActivity() }

        composeTestRule.onNodeWithText("Android Developer")
    }

    @Test
    fun doesPhoneNumberDisplayCorrectly() {
        composeTestRule.setContent { MainActivity() }

        val expectedPhoneNumber = "+65 93542856" //Defining the expected phone number to be displayed

        composeTestRule.onNodeWithText(expectedPhoneNumber)
    }

    @Test
    fun doesWebURLDisplayCorrectly() {
        composeTestRule.setContent {
            MainActivity()
        }

        // Find the web URL text node and verify its content
        val expectedWebURL = "https://github.com/Thet9354"
        composeTestRule.onNodeWithText(expectedWebURL)
    }

    @Test
    fun doesEmailDisplayCorrectly() {
        composeTestRule.setContent {
            MainActivity()
        }

        // Find the email text node and verify its content
        val expectedEmail = "thetpine254@gmail.com"
        composeTestRule.onNodeWithText(expectedEmail)
    }

//    @Test
//    fun doesPhoneNumberLaunchDialer() {
//        composeTestRule.setContent {
//            MainActivity()
//        }
//
//        // Find the phone number text and perform a click action
//        composeTestRule.onNodeWithText("+65 93542856").performClick()
//
//        // Verify if the phone dialer intent is sent with the correct data
//        val phoneUri = Uri.parse("tel:+65 93542856")
//        androidx.test.espresso.intent.Intents.intended(IntentMatchers.hasAction(Intent.ACTION_DIAL))
//        androidx.test.espresso.intent.Intents.intended(IntentMatchers.hasData(phoneUri))
//    }


//    @Test
//    fun doesEmailIconNavigateToEmail() {
//        // Set the content for the test
//        composeTestRule.setContent {
//            BusinessCardAppTheme {
//                MainActivity()
//            }
//        }
//
//        // Wait for Compose to be idle
//        composeTestRule.waitForIdle()
//
//        // Find the email icon and check if it has a click action
//        composeTestRule.onNodeWithContentDescription("Email Icon")
//            .assertHasClickAction()
//
//        // Perform the click action on the email icon
//        composeTestRule.onNodeWithContentDescription("Email Icon")
//            .performClick()
//
//        // Verify if the email intent is sent with the correct data
//        val expectedEmail = "thetpine254@gmail.com"
//        val emailUri = Uri.parse("mailto:$expectedEmail")
//        androidx.test.espresso.intent.Intents.intended(IntentMatchers.hasAction(Intent.ACTION_SENDTO))
//        androidx.test.espresso.intent.Intents.intended(IntentMatchers.hasData(emailUri))
//    }
}
