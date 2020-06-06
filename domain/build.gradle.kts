plugins {
  id("java-library")
  id("kotlin")
  id(KtLint.name)
}

dependencies {
  implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
  testImplementation(project(":coroutinetestrule"))

  implementation(Kotlin.stdblib_jdk)
  api(KotlinCoroutine.core)

  implementation(CommonLibs.javaxInject)
}

ktlint {
  android.set(false)
}