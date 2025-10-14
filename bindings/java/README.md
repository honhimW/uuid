# Java Binding

[![Maven Central](https://img.shields.io/maven-central/v/io.github.honhimw/uuid.svg)](https://central.sonatype.com/artifact/io.github.honhimw/uuid)

### Supported platforms

- [x] Linux
  - [x] x86_64
  - [x] aarch64
- [x] Windows
  - [x] x86_64
  - [x] aarch64
- [x] Macos
    - [x] aarch64
    - [x] x86_64(intel)

### Usage

```groovy
// Fat jar including x86_64, aarch64 on Linux/Window/Macos
implementation 'io.github.honhimw:uuid:0.0.1'
// Single platform with classifier specified
implementation group: 'io.github.honhimw', name: 'uuid', version: '0.0.1', classifier: 'linux-x86_64'
```

```xml
<dependency>
    <groupId>io.github.honhimw</groupId>
    <artifactId>uuid</artifactId>
    <version>0.0.1</version>
    <classifier>linux-x86_64</classifier>
</dependency>
```

```java
import io.github.honhimw.uuid.UUIDS;
// Global instances
UUID v1 = UUIDs.V1.random();
UUID v3 = UUIDs.V3.random();
UUID v4 = UUIDs.V4.random();
UUID v5 = UUIDs.V5.random();
UUID v6 = UUIDs.V6.random();
UUID v7 = UUIDs.V7.random();
UUID v8 = UUIDs.V8.random();
```
