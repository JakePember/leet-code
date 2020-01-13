Leet Code Project
===============================

The Purpose of this project is to get better at programming interview questions using the leet code platform.
This will collect the problems I have already solved from the website.
 

Prerequisites
-------------
- JDK 7 or higher
- Gradle use `gradlew` wrapper
- Google formatter

Building with Gradle
--------------------
Type:

    ./gradlew clean test

Downloaded files (including the Gradle distribution itself) will be stored in the Gradle user home directory (typically *user_home*`/.gradle`).

Creating an Eclipse project
---------------------------
Type:

    ./gradlew cleanEclipse eclipse

Make sure you have a recent version of the Groovy Eclipse plugin installed. After importing the generated project into a workspace, go to Preferences->Java->Build Path->Classpath Variables and add a variable named `GRADLE_CACHE` with value *user_home*`/.gradle/cache`. (If you have an environment variable `GRADLE_USER_HOME` set, the correct value is *GRADLE_USER_HOME*`/cache`.) You should now be able to build the project, and to run the specs like you would run a JUnit test. See http://wiki.spockframework.org/GettingStarted#Eclipse for more information on how to get started with Spock and Eclipse.

Creating an IDEA project
---------------------------
Just open the project directory with Intelli IDEA and it should auto-detect the project settings. 

Alternativly Type:

    ./gradlew cleanIdea idea

Open the generated project in IDEA. You should now be able to build the project, and to run the specs like you would run a JUnit test.

NOTE: you might also want to install https://github.com/mycila/gmavenplus-intellij-plugin so that `src/test/groovy` is correctly recognized as a test classes root.

Getting hold of the Jars used in this project
---------------------------------------------
Type:

    ./gradlew collectJars

The Jars will be copied to `build/output/lib`. The comments in `build.gradle` explain what they are needed for.

Further Resources
-----------------

* [Spock homepage](http://spockframework.org)
* [Main documentation](http://docs.spockframework.org/)
* [Gradle homepage](http://www.gradle.org)
* [Groovy homepage](http://groovy-lang.org/)

