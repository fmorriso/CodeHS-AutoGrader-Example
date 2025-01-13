# CodeHS Autograder example AP CS A - 6.2.8 - Print Every Third Index
A CodeHS Autograder example based on Unit 6 of AP CS A - problem 6.2.8 Print Every Third Index

## Tools Used

| Tool     |  Version |
|:---------|---------:|
| Java     | 23.0.1.0 |
| IntelliJ | 2024.3.1 |
| VSCode   |   1.96.2 |
| json     | 20250107 |

## Change History

| Date       | Description                |
|:-----------|:---------------------------|
| 2025-01-12 | Initial creation           |
| 2025-01-13 | Rename top level directory |

## References
* [Autograder for 6.2.8](https://codehs.com/app/assignments/course/358127?module=142279256&lesson=142279267)

## Developer Notes
The following JSON library JAR file is referenced and needs to be present to run this code stand-alone:
```xml
<component name="libraryTable">
  <library name="json" type="repository">
    <properties maven-id="org.json:json:20250107" />
    <CLASSES>
      <root url="jar://$MAVEN_REPOSITORY$/org/json/json/20250107/json-20250107.jar!/" />
    </CLASSES>
    <JAVADOC />
    <SOURCES />
  </library>
</component>
```

## What Mother (CodeHS) Never Told You About Customizing Java Autograders
1. There are multiple `main` programs.  Ignore the one in ConsoleProgram.java.
1. Most of your work will be performed in `grader.java`.
   1. They ues far too many "magic strings"that have to repeat in several places instead of well chosen variable names. This make is extremely difficult to change the name of the existing tests or add new ones.
1. If all possible, try to develop a local stand-alone test harness on your own laptop, but make sure you download the extra JAR file to support the ` 
