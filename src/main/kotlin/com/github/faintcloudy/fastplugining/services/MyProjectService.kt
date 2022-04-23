package com.github.faintcloudy.fastplugining.services

import com.intellij.openapi.project.Project
import com.github.faintcloudy.fastplugining.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
