package com.example

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings

class Catch2ConfigurationPlugin implements Plugin<Settings> {
    @Override
    void apply(Settings settings) {
        settings.with {
            rootProject.name = 'catch2'
            gradle.rootProject {
                apply plugin: 'org.gradle.samples.cmake-library'
                group = 'com.github.catchorg'
                cmake {
                    binary = 'src/libCatch2.a'
                    includeDirectory = layout.projectDirectory.dir('single_include/catch2')
                }
            }
        }
    }
}
