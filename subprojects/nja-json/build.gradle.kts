val jacksonVersion: String by project

dependencies {
    api("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:$jacksonVersion")
    api("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jacksonVersion")
    api("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
    api("org.slf4j:slf4j-api:2.0.16")

    runtimeOnly("org.slf4j:slf4j-simple:2.0.16")

    testImplementation(platform("org.junit:junit-bom:5.11.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

description = "Common JSON handling utils"
