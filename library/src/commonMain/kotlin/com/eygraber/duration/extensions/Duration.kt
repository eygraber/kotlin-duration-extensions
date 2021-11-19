package com.eygraber.duration.extensions

import kotlin.time.Duration
import kotlin.time.DurationUnit

/**
 * Returns the value of this duration expressed as a [Double] number of days.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
public inline val Duration.inDoubleDays: Double
  get() = toDouble(DurationUnit.DAYS)

/**
 * Returns the value of this duration expressed as an [Int] number of days.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
public inline val Duration.inWholeIntDays: Int
  get() = toInt(DurationUnit.DAYS)

/**
 * Returns the value of this duration expressed as a [Double] number of hours.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
public inline val Duration.inDoubleHours: Double
  get() = toDouble(DurationUnit.HOURS)

/**
 * Returns the value of this duration expressed as an [Int] number of hours.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
public inline val Duration.inWholeIntHours: Int
  get() = toInt(DurationUnit.HOURS)

/**
 * Returns the value of this duration expressed as a [Double] number of minutes.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
public inline val Duration.inDoubleMinutes: Double
  get() = toDouble(DurationUnit.MINUTES)

/**
 * Returns the value of this duration expressed as an [Int] number of minutes.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
public inline val Duration.inWholeIntMinutes: Int
  get() = toInt(DurationUnit.MINUTES)

/**
 * Returns the value of this duration expressed as a [Double] number of seconds.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
public inline val Duration.inDoubleSeconds: Double
  get() = toDouble(DurationUnit.SECONDS)

/**
 * Returns the value of this duration expressed as an [Int] number of seconds.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
public inline val Duration.inWholeIntSeconds: Int
  get() = toInt(DurationUnit.SECONDS)

/**
 * Returns the value of this duration expressed as a [Double] number of milliseconds.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
public inline val Duration.inDoubleMilliseconds: Double
  get() = toDouble(DurationUnit.MILLISECONDS)

/**
 * Returns the value of this duration expressed as an [Int] number of milliseconds.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
public inline val Duration.inWholeIntMilliseconds: Int
  get() = toInt(DurationUnit.MILLISECONDS)

/**
 * Returns the value of this duration expressed as a [Double] number of microseconds.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
public inline val Duration.inDoubleMicroseconds: Double
  get() = toDouble(DurationUnit.MICROSECONDS)

/**
 * Returns the value of this duration expressed as an [Int] number of microseconds.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
public inline val Duration.inWholeIntMicroseconds: Int
  get() = toInt(DurationUnit.MICROSECONDS)

/**
 * Returns the value of this duration expressed as a [Double] number of nanoseconds.
 *
 * An infinite duration value is converted either to [Double.POSITIVE_INFINITY] or [Double.NEGATIVE_INFINITY]
 * depending on its sign.
 */
public inline val Duration.inDoubleNanoseconds: Double
  get() = toDouble(DurationUnit.NANOSECONDS)

/**
 * Returns the value of this duration expressed as an [Int] number of nanoseconds.
 *
 * An infinite duration value is converted either to [Int.MAX_VALUE] or [Int.MIN_VALUE] depending on its sign.
 */
public inline val Duration.inWholeIntNanoseconds: Int
  get() = toInt(DurationUnit.NANOSECONDS)
