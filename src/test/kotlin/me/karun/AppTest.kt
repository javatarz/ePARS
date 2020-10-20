package me.karun

import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
  @Test
  fun testAppHasAGreeting() {
    val classUnderTest = App()
    assertNotNull(classUnderTest.message(), "app should have a greeting")
  }
}
