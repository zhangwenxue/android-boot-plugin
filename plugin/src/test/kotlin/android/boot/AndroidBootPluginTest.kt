/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package android.boot

import org.gradle.testfixtures.ProjectBuilder
import kotlin.test.Test
import kotlin.test.assertNotNull

/**
 * A simple unit test for the 'android.boot.greeting' plugin.
 */
class AndroidBootPluginTest {
    @Test fun `plugin registers task`() {
        // Create a test project and apply the plugin
        val project = ProjectBuilder.builder().build()
        project.plugins.apply("android.boot.greeting")

        // Verify the result
        assertNotNull(project.tasks.findByName("greeting"))
    }
}
