plugins {
    kotlin("jvm")
    application
}

dependencies {
    implementation(project(":db"))
}

application {
    mainClass = "com.geno1024.home.tools.clotheschooser.Main"
}
