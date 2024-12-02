plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "assignment"
include("assignment-api")
include("assignment-domain")
include("assignment-service")
include("assignment-core")
