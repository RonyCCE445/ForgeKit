# ForgeKit

ForgeKit is a modular Java developer toolkit built to demonstrate modern Apache Maven practices through a real-world multi-module project.

The primary goal of ForgeKit is educational: to learn Maven by building a clean, modular application rather than a traditional CRUD or web application.

---

## Features

* Reverse text
* Count words in text files
* Read and write files
* Read all lines from a file
* Count file lines
* SHA-256 file hashing
* Pretty-print JSON
* Minify JSON
* Validate JSON
* Convert Java objects to JSON
* Command-line interface (CLI)

---

## Project Structure

```
forgekit/
│
├── forgekit-core
│   Shared utilities and core classes
│
├── forgekit-file
│   File utilities
│
├── forgekit-json
│   JSON utilities powered by Jackson
│
└── forgekit-cli
    Command-line application
```

---

## Technologies

* Java 17
* Apache Maven
* JUnit 5
* Jackson Databind

---

## Building

Clone the repository:

```bash
git clone https://github.com/RonyCCE445/forgekit.git
cd forgekit
```

Build the project:

```bash
mvn clean package
```

Run the tests:

```bash
mvn test
```

---

## CLI Commands

Reverse text:

```bash
reverse ForgeKit
```

Word count:

```bash
wc sample.txt
```

Pretty-print JSON:

```bash
json-pretty sample.json
```

---

## Learning Objectives

This project demonstrates:

* Maven project structure
* Multi-module Maven builds
* Parent and child POMs
* Dependency management
* Internal module dependencies
* External dependencies
* Maven lifecycle
* Unit testing with JUnit
* Modular Java application design

---

## Version

Current release:

```
1.0.0
```

---

## Future Improvements

* Additional text utilities
* More file operations
* Additional JSON features
* Executable fat JAR using the Maven Shade Plugin
* Publishing to Maven Central

---

## License

This project is licensed under the MIT License.
