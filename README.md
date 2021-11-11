# Kotlin Duration Extensions

[![Download](https://img.shields.io/maven-central/v/com.eygraber/kotlin-duration-extensions/1.0.1)](https://search.maven.org/artifact/com.eygraber/kotlin-duration-extensions)

### Gradle

Groovy
```
repositories {
  mavenCentral()
}

implementation 'com.eygraber:kotlin-duration-extensions:1.0.1'
```

Kotlin
```
repositories {
  mavenCentral()
}

implementation("com.eygraber:kotlin-duration-extensions:1.0.1")
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

### Usage

Extension properties are supplied on `Int`, `Long`, and `Double` to make creating a `Duration` simpler:

```kotlin
2.nanoseconds
2.microseconds
2.milliseconds
2.seconds
2.minutes
2.hours
2.days
```

There are also extension properties supplied on `Duration` to get the underlying value as a `Double` and as an `Int`:

```kotlin
val duration = 2.seconds

duration.inDoubleNanoseconds
duration.inDoubleMicroseconds
duration.inDoubleMilliseconds
duration.inDoubleSeconds
duration.inDoubleMinutes
duration.inDoubleHours
duration.inDoubleDays

duration.inWholeIntNanoseconds
duration.inWholeIntMicroseconds
duration.inWholeIntMilliseconds
duration.inWholeIntSeconds
duration.inWholeIntMinutes
duration.inWholeIntHours
duration.inWholeIntDays
```

### Rationale

The `Int`, `Long`, and `Double` extension properties for creating a `Duration` [have been deprecated in Kotlin 1.5](https://blog.jetbrains.com/kotlin/2021/04/kotlin-1-5-0-rc-released/#duration-api-changes).

There's been some discussion about it on the [Kotlin Slack channel](https://kotlinlang.slack.com/archives/C0922A726/p1618965104032100) and [the KEEP for Duration and time measurement API](https://github.com/Kotlin/KEEP/issues/190#issuecomment-778821179), and it seems unlikely that it will come back in the stdlib.

This library brings them back 🎉

In addition, the `Duration` properties that returned the value as a `Double` have been deprecated.  This is because `Duration` is now backed by a `Long`.

The new way to retrieve the value as a `Double` is to use `Duration.toDouble(DurationUnit)`. That can be a little verbose, so this library provides `Duration.inDouble*` functions.

Since a lot of existing APIs accept an `Int` amount of milliseconds/seconds/etc, this library also provides `Duration.inWholeInt*` functions.
