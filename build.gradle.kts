plugins { java }
group = "com.fivemcodehub"
version = "1.0.0"
java { toolchain.languageVersion.set(JavaLanguageVersion.of(21)) }
repositories { mavenCentral(); maven("https://repo.papermc.io/repository/maven-public/") }
dependencies { compileOnly("com.velocitypowered:velocity-api:3.4.0-SNAPSHOT"); annotationProcessor("com.velocitypowered:velocity-api:3.4.0-SNAPSHOT") }
