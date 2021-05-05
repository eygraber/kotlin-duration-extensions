# Kotlin Duration Extensions

The `Int`, `Long`, and `Double` extension properties for creating a `Duration` [have been deprecated in Kotlin 1.5](https://blog.jetbrains.com/kotlin/2021/04/kotlin-1-5-0-rc-released/#duration-api-changes).

There's been some discussion about it on the [Kotlin Slack channel](https://kotlinlang.slack.com/archives/C0922A726/p1618965104032100) and [the KEEP for Duration and time measurement API](https://github.com/Kotlin/KEEP/issues/190#issuecomment-778821179), and it seems unlikely that it will come back in the stdlib.

This library brings them back 🎉

In addition, since `Duration` was changed to be backed by a `Long` instead of a `Double`, all of the `Duration.in*` functions (`inMilliseconds`, `inSeconds`, etc…) have been deprecated in favor of `Duration.inWhole*` (`inWholeMilliseconds`, `inWholeSeconds`, etc…).

This library provides `Duration.inDouble*` extension functions to retrieve the `Duration` in a `Double` format (`inDoubleMilliseconds`, `inDoubleSeconds`, etc…). They delegate to the stdlib `Duration.toDouble(DurationUnit)` function.
### Usage

It provides factories from creating a `Duration` from `Int`, `Long`, and `Double`:

```kotlin
2.nanoseconds
2.microseconds
2.milliseconds
2.seconds
2.minutes
2.hours
2.days
```

Since the `Duration` API switched to being backed by `Long` the `in*` getters (`inMilliseconds`, `inSeconds`, etc…) have been renamed to `inWhole*` (`inWholeMilliseconds`, `inWholeSeconds`, etc…).

This library also provides extension properties on `Duration` to get the underlying value as a `Double`:

```kotlin
2.seconds.inDoubleNanoseconds
2.seconds.inDoubleMicroseconds
2.seconds.inDoubleMilliseconds
2.seconds.inDoubleSeconds
2.seconds.inDoubleMinutes
2.seconds.inDoubleHours
2.seconds.inDoubleDays
```

### Gradle

Groovy
```
repositories {
  mavenCentral()
}

implementation 'com.eygraber:kotlin-duration-extensions:1.0.0'
```

Kotlin
```
repositories {
  mavenCentral()
}

implementation("com.eygraber:kotlin-duration-extensions:1.0.0")
```

#### Snapshots

Snapshots can be found at the Sonatype s01 repository:

Groovy
```
repositories {
  maven { url 'https://s01.oss.sonatype.org/content/repositories/snapshots' }
}
```

Kotlin
```
repositories {
  maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots")
}
```
