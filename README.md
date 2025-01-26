# nja-utils

A collection of common @NJAldwin utility libraries.  Intended mainly as a common base.

[![Maven Central Version](https://img.shields.io/maven-central/v/com.njalabs.utils/nja-json)](https://central.sonatype.com/artifact/com.njalabs.utils/nja-json)
[![javadoc](https://javadoc.io/badge2/com.njalabs.utils/nja-json/javadoc.svg)](https://javadoc.io/doc/com.njalabs.utils/nja-json)

https://central.sonatype.com/artifact/com.njalabs.utils/nja-json

https://central.sonatype.com/artifact/com.njalabs.utils/nja-kotlin

Docs (javadoc.io):
 - https://javadoc.io/doc/com.njalabs.utils/nja-json
 - https://javadoc.io/doc/com.njalabs.utils/nja-kotlin

Docs (GH pages): https://njaldwin.github.io/nja-utils/

```maven
<dependency>
    <groupId>com.njalabs.utils</groupId>
    <artifactId>nja-json</artifactId>
    <version>VERSION</version>
</dependency>
<dependency>
    <groupId>com.njalabs.utils</groupId>
    <artifactId>nja-kotlin</artifactId>
    <version>VERSION</version>
</dependency>
```

```gradle
implementation("com.njalabs.utils:nja-json:VERSION")
implementation("com.njalabs.utils:nja-kotlin:VERSION")
```

## Building

Use `./gradlew` to build the project.

e.g.

```console
./gradlew --stacktrace clean ktlintFormat build dependencyUpdates ktlintCheck test assemble publish makeDocs
```

## Repository/Publishing Setup

- set up and publish a GPG key
- add GPG key information to GitHub (`Secrets and variables -> Actions`) in `JRELEASER_GPG_PASSPHRASE`, `JRELEASER_GPG_PUBLIC_KEY`, and `JRELEASER_GPG_SECRET_KEY`
- set up a Maven Central account
- perform DNS TXT verification in Maven Central for the group ID's domain
- create a token in Maven Central
- add the Maven credentials to GitHub (`Secrets and variables -> Actions`) in `JRELEASER_MAVENCENTRAL_TOKEN` and `JRELEASER_MAVENCENTRAL_USERNAME`
- set up the `gh-pages` branch for github-pages (`Environments`)

## Publishing

To publish a release, update the version number in `build.gradle.kts`, then create a new version tag pointing to the latest commit in `master`.  Tags must be in [semver](https://semver.org/) format with a `v` prefix (i.e. `vMAJOR.MINOR.PATCH`).

The GitHub action will automatically build and publish the release to Maven Central and GitHub Pages, then create a GitHub Release.

Tags with a prerelease version (e.g. `-alpha.1`) will be marked as prereleases in GitHub and will not be linked from the `/stable` link in the docs.

## Etc

Based on https://github.com/NJAldwin/maven-central-test

Library template: https://github.com/NJAldwin/jvm-library-template
