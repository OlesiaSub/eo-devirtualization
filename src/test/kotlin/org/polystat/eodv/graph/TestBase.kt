package org.polystat.eodv.graph

import kotlin.test.assertEquals

interface TestBase {
    fun doTest()

    fun checkOutput(
        expected: String,
        actual: String
    ) =
        assertEquals(
            expected.replace("\n", "").replace("\r", ""),
            actual.replace("\n", "").replace("\r", "")
        )

    fun constructInPath(path: String): String = "src\\test\\resources\\in\\$path.xml"

    fun constructOutPath(path: String): String


    fun getTestName() = Thread.currentThread().stackTrace[4].methodName.substring(5).replace(' ', '_')
}