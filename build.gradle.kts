plugins {
    id("com.android.application") version "8.1.2" apply false
    id("com.android.library") version "8.1.2" apply false
    id("com.google.dagger.hilt.android") version "2.48" apply false
    kotlin("android") version "1.9.10" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
