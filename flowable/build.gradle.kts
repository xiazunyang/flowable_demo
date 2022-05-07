import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    kotlin("plugin.jpa")
    kotlin("plugin.spring")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

group = "com.hedou"
version = "0.0.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_1_8

@Suppress("GradlePackageUpdate")
dependencies {
    // kotlin
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    // spring boot
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    // jackson kotlin
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    // flowable
    implementation("org.flowable:flowable-form-rest:6.7.2")
    implementation("org.flowable:flowable-form-spring-configurator:6.7.2")
    implementation("org.flowable:flowable-spring-boot-starter-process-rest:6.7.2")
    // sql server jdbc
    implementation("com.h2database:h2:2.1.212")
    // swagger
    implementation("io.springfox:springfox-swagger2:2.9.2")
    implementation("io.springfox:springfox-swagger-ui:2.9.2")
    implementation("io.github.markixy:flowable-swagger:1.0.2")
    // tests
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
