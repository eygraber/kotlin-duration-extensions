package com.eygraber.duration.extensions

import kotlin.time.Duration
import kotlin.time.DurationUnit
import kotlin.time.ExperimentalTime

/** Returns a [Duration] equal to this [Int] number of nanoseconds. */
@ExperimentalTime
public inline val Int.nanoseconds: Duration get() = Duration.nanoseconds(this)

/** Returns a [Duration] equal to this [Long] number of nanoseconds. */
@ExperimentalTime
public inline val Long.nanoseconds: Duration get() = Duration.nanoseconds(this)

/**
 * Returns a [Duration] equal to this [Double] number of nanoseconds.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
public inline val Double.nanoseconds: Duration get() = Duration.nanoseconds(this)

/** Returns a [Duration] equal to this [Int] number of microseconds. */
@ExperimentalTime
public inline val Int.microseconds: Duration get() = Duration.microseconds(this)

/** Returns a [Duration] equal to this [Long] number of microseconds. */
@ExperimentalTime
public inline val Long.microseconds: Duration get() = Duration.microseconds(this)

/**
 * Returns a [Duration] equal to this [Double] number of microseconds.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
public inline val Double.microseconds: Duration get() = Duration.microseconds(this)

/** Returns a [Duration] equal to this [Int] number of milliseconds. */
@ExperimentalTime
public inline val Int.milliseconds: Duration get() = Duration.milliseconds(this)

/** Returns a [Duration] equal to this [Long] number of milliseconds. */
@ExperimentalTime
public inline val Long.milliseconds: Duration get() = Duration.milliseconds(this)

/**
 * Returns a [Duration] equal to this [Double] number of milliseconds.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
public inline val Double.milliseconds: Duration get() = Duration.milliseconds(this)

/** Returns a [Duration] equal to this [Int] number of seconds. */
@ExperimentalTime
public inline val Int.seconds: Duration get() = Duration.seconds(this)

/** Returns a [Duration] equal to this [Long] number of seconds. */
@ExperimentalTime
public inline val Long.seconds: Duration get() = Duration.seconds(this)

/**
 * Returns a [Duration] equal to this [Double] number of seconds.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
public inline val Double.seconds: Duration get() = Duration.seconds(this)

/** Returns a [Duration] equal to this [Int] number of minutes. */
@ExperimentalTime
public inline val Int.minutes: Duration get() = Duration.minutes(this)

/** Returns a [Duration] equal to this [Long] number of minutes. */
@ExperimentalTime
public inline val Long.minutes: Duration get() = Duration.minutes(this)

/**
 * Returns a [Duration] equal to this [Double] number of minutes.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
public inline val Double.minutes: Duration get() = Duration.minutes(this)

/** Returns a [Duration] equal to this [Int] number of hours. */
@ExperimentalTime
public inline val Int.hours: Duration get() = Duration.hours(this)

/** Returns a [Duration] equal to this [Long] number of hours. */
@ExperimentalTime
public inline val Long.hours: Duration get() = Duration.hours(this)

/**
 * Returns a [Duration] equal to this [Double] number of hours.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
public inline val Double.hours: Duration get() = Duration.hours(this)

/** Returns a [Duration] equal to this [Int] number of days. */
@ExperimentalTime
public inline val Int.days: Duration get() = Duration.days(this)

/** Returns a [Duration] equal to this [Long] number of days. */
@ExperimentalTime
public inline val Long.days: Duration get() = Duration.days(this)

/**
 * Returns a [Duration] equal to this [Double] number of days.
 *
 * @throws IllegalArgumentException if this `Double` value is `NaN`.
 */
@ExperimentalTime
public inline val Double.days: Duration get() = Duration.days(this)

/**
 * Returns the value of this duration expressed as a [Double] number of days.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inDoubleDays: Double
  get() = toDouble(DurationUnit.DAYS)

/**
 * Returns the value of this duration expressed as a [Int] number of days.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inWholeIntDays: Int
  get() = toInt(DurationUnit.DAYS)


/**
 * Returns the value of this duration expressed as a [Double] number of hours.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inDoubleHours: Double
  get() = toDouble(DurationUnit.HOURS)

/**
 * Returns the value of this duration expressed as a [Int] number of hours.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inWholeIntHours: Int
  get() = toInt(DurationUnit.HOURS)

/**
 * Returns the value of this duration expressed as a [Double] number of minutes.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inDoubleMinutes: Double
  get() = toDouble(DurationUnit.MINUTES)

/**
 * Returns the value of this duration expressed as a [Int] number of minutes.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inWholeIntMinutes: Int
  get() = toInt(DurationUnit.MINUTES)

/**
 * Returns the value of this duration expressed as a [Double] number of seconds.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inDoubleSeconds: Double
  get() = toDouble(DurationUnit.SECONDS)

/**
 * Returns the value of this duration expressed as a [Int] number of seconds.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inWholeIntSeconds: Int
  get() = toInt(DurationUnit.SECONDS)

/**
 * Returns the value of this duration expressed as a [Double] number of milliseconds.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inDoubleMilliseconds: Double
  get() = toDouble(DurationUnit.MILLISECONDS)

/**
 * Returns the value of this duration expressed as a [Int] number of milliseconds.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inWholeIntMilliseconds: Int
  get() = toInt(DurationUnit.MILLISECONDS)

/**
 * Returns the value of this duration expressed as a [Double] number of microseconds.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inDoubleMicroseconds: Double
  get() = toDouble(DurationUnit.MICROSECONDS)

/**
 * Returns the value of this duration expressed as a [Int] number of microseconds.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inWholeIntMicroseconds: Int
  get() = toInt(DurationUnit.MICROSECONDS)

/**
 * Returns the value of this duration expressed as a [Double] number of nanoseconds.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inDoubleNanoseconds: Double
  get() = toDouble(DurationUnit.NANOSECONDS)

/**
 * Returns the value of this duration expressed as a [Int] number of nanoseconds.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
@ExperimentalTime
public inline val Duration.inWholeIntNanoseconds: Int
  get() = toInt(DurationUnit.NANOSECONDS)
