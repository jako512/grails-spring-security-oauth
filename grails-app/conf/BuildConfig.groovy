grails.project.work.dir = 'target'
grails.project.target.level = 1.6

grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        mavenLocal()
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
        grailsRepo "http://grails.org/plugins"
    }

    dependencies {
        runtime "org.scribe:scribe:1.3.2"
        test "org.spockframework:spock-grails-support:0.7-groovy-2.0"
    }

    plugins {
        compile ":spring-security-core:2.0-RC2"
        compile ":oauth:2.2.1", {
            transitive = false
        }

        build ":release:2.2.0", ":rest-client-builder:1.0.3", {
            export = false
        }

        test(":spock:0.7") {
            exclude "spock-grails-support"
        }
    }

}
