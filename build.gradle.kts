plugins {
  kotlin("jvm") version "1.3.72"
}

group = "me.ricky"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
  maven("https://raw.githubusercontent.com/JorelAli/1.13-Command-API/mvn-repo/1.13CommandAPI/")
}

dependencies {
  implementation(kotlin("stdlib"))
  api("dev.jorel:commandapi:3.0")
}
