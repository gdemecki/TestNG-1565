# TestNG-1565 bug showcase

## UPDATE

Since version `6.13.1` this bug is fixed, but unfortunately new ones have appeared. Time to finish with TestNG for good.

## Environment

* TestNG 6.11
* JDK 1.8.0_112
* Windows 7 Enterprise

## Description

This is a sample project which uses a TestNG.

After upgrading TestNG from **6.9.10** to **6.11** some tests are **silently skipped**.
The problem seems to be related to the `priority` attribute, because without it, all tests in all groups are executed correctly.

## Steps to reproduce

Please run `mvn clean test` and see that 3 tests are mysteriously skipped.

Then downgrade TestNG version to 6.9.10 and run `mvn clean test` again. All tests are executed correctly.

## Known workarounds

* Downgrade to TestNG 6.9.10
* Do not use `priority` attribute inside `@Test` annotation
