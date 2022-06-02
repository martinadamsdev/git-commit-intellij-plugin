package com.github.martinageradams.gitcommitintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.martinageradams.gitcommitintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
