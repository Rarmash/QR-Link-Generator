plugins {
    id("java")
}

group = "com.rarmash.qr_link_generator"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("com.journeyapps:zxing-android-embedded:4.3.0")
}

tasks.test {
    useJUnitPlatform()
}