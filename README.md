# Kotlin Duration Extensions

[![Download](https://img.shields.io/maven-central/v/com.eygraber/kotlin-duration-extensions/1.1.0)](https://search.maven.org/artifact/com.eygraber/kotlin-duration-extensions)

### Gradle

Groovy
```
repositories {
  mavenCentral()
}

implementation 'com.eygraber:kotlin-duration-extensions:1.1.0'
```

Kotlin
```
repositories {
  mavenCentral()
}

implementation("com.eygraber:kotlin-duration-extensions:1.1.0")
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

#### Number extension properties

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

##### Warning

As of version 1.1.0 the above extension properties are removed from the library.

This is because Kotlin 1.6.0 added support for them through the `kotlin.time.Duration.Companion.*` properties.

#### Duration extension properties

There are extension properties supplied on `Duration` to get the underlying value as a `Double` and as an `Int`:

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

The `Duration` properties that returned the value as a `Double` have been deprecated.  This is because `Duration` is now backed by a `Long`.

The new way to retrieve the value as a `Double` is to use `Duration.toDouble(DurationUnit)`. That can be a little verbose, so this library provides `Duration.inDouble*` functions.

Since a lot of existing APIs accept an `Int` amount of milliseconds/seconds/etc, this library also provides `Duration.inWholeInt*` functions.
