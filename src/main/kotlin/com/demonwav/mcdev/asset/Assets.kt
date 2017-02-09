/*
 * Minecraft Dev for IntelliJ
 *
 * https://minecraftdev.org
 *
 * Copyright (c) 2017 minecraft-dev
 *
 * MIT License
 */

package com.demonwav.mcdev.asset

import com.intellij.openapi.util.IconLoader

import javax.swing.Icon

object Assets {
    fun loadIcon(path: String): Icon {
        return IconLoader.getIcon(path, Assets::class.java)
    }
}
