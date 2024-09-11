# ROOM Dependencies

```kotlin
val room_version = "2.6.1"

    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")
```

# KAPT (Kotlin Annotation Plugin Tool)

```kotlin
plugins {
    //other plugins
    kotlin("kapt") // Kotlin Annotation Processing Tool
}
kapt("androidx.room:room-compiler:$room_version")
```

