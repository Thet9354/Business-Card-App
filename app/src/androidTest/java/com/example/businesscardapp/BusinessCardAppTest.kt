package com.example.businesscardapp

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BusinessCardAppTest {

    @get:Rule
    val composeTestRule = createComposeRule()

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
}
