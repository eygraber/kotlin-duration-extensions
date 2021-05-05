buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.5.0"))
        classpath("com.vanniktech:gradle-maven-publish-plugin:0.15.1")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.4.32")
    }
}
