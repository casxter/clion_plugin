package com.github.casxter.clionplugin.services

import com.intellij.openapi.project.Project
import com.github.casxter.clionplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
