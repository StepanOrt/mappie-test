
plugins {
    kotlin("jvm") version "2.2.0"
    id("tech.mappie.plugin") version "2.2.0-1.4.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}