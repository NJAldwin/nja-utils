package com.njalabs.utils.kotlin

/**
 * Removes nulls from a map.
 */
public fun <K, V : Any> Map<K, V?>.withoutNullValues(): Map<K, V> =
    filterValues { it != null }.mapValues { it.value as V }
