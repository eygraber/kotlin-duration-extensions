rootProject.name = "kotlin-duration-extensions"
include(":library")

plugins {
  id("com.gradle.enterprise") version "3.6.1"
}

gradleEnterprise {
  val isCiBuild = System.getenv("CI") != null

  buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    if (isCiBuild) {
      termsOfServiceAgree = "yes"
      publishAlways()
    }
  }
}
