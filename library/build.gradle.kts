plugins {
    kotlin("multiplatform")
}

repositories {
    mavenCentral()
}

kotlin {
    explicitApi()

    js {
        nodejs()
        browser()
        
        compilations.all {
            kotlinOptions {
                moduleKind = "umd"
                sourceMap = true
                sourceMapEmbedSources = null
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
    }

    targetFromPreset(presets["jvm"], "jvm")
    targetFromPreset(presets["iosX64"], "iosX64")
    targetFromPreset(presets["iosArm32"], "iosArm32")
    targetFromPreset(presets["iosArm64"], "iosArm64")
    targetFromPreset(presets["tvosX64"], "tvosX64")
    targetFromPreset(presets["tvosArm64"], "tvosArm64")
    targetFromPreset(presets["watchosX86"], "watchosX86")
    targetFromPreset(presets["watchosArm32"], "watchosArm32")
    targetFromPreset(presets["watchosArm64"], "watchosArm64")
    targetFromPreset(presets["macosX64"], "macosX64")
    targetFromPreset(presets["linuxArm64"], "linuxArm64")
    targetFromPreset(presets["linuxArm32Hfp"], "linuxArm32Hfp")
    targetFromPreset(presets["linuxX64"], "linuxX64")
    targetFromPreset(presets["mingwX64"], "mingw")
}

apply(from = File(rootDir, "publishing.gradle"))
