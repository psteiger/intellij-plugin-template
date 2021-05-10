package com.github.psteiger.intellijplugintemplate.services

import com.github.psteiger.intellijplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
