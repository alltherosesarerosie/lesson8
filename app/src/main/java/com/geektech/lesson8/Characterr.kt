package com.geektech.lesson8

import java.io.Serializable

data class Characterr(
    var name: String = "unreachable name",
    var age: String = "unreachable age",
    var img: String = "unreachable image"
): Serializable
