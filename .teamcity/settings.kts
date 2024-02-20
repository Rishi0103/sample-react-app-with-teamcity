import jetbrains.buildServer.configs.kotlin.v2023_11.*
import jetbrains.buildServer.configs.kotlin.v2023_11.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2023_11.triggers.vcs

version = "2020.2"

project {

    buildType(Build)
}

object Build : BuildType({
    name = "Build"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        script {
            name = "Install npm packages"
            scriptContent = """ npm install """
        }

        script {
            name = "Run tests"
            scriptContent = """ npm run verify """
        }
    }

    triggers {
        vcs {
        }
    }
})
