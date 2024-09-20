/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java library project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.10.1/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

val someConfiguration by configurations.creating

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
    maven { url = uri( "https://jitpack.io") }
}

dependencies {
    // Use JUnit Jupiter for testing.

    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is exported to consumers, that is to say found on their compile classpath.
    api(libs.commons.math3)
    implementation("com.github.gcajal:ClassRoom-Notifier:5c2599a24c")
    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation(libs.guava)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

tasks.register("run") {
    dependsOn(gradle.includedBuild("libs").task(":app:run"))
}
tasks.register<Copy>("copyDependencies") {
    from(configurations.runtimeClasspath)
    into("./build/libs")
}

tasks.named("build") {
    dependsOn("copyDependencies")
}
/*
tasks.buildDependents. (type: Copy) {
    from configurations.runtime
            into "lib"
}
*/
