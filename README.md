# TestNG-1565 bug showcase

## Environment

* TestNG 6.11
* JDK 1.8.0_112
* Windows 7 Enterprise

## Description

This is a sample project which uses a TestNG.

After upgrading TestNG from **6.9.10** to **6.11** some tests are **silently skipped**.
The problem seems to be related to the `priority` attribute, because without it, all tests in all groups are executed correctly.


## Known workarounds

* Downgrade to TestNG 6.9.10
* Do not use `priority` attribute inside `@Test` annotation
