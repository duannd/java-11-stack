# Java 11 Tech Stack

    This project to learn/talk about Java 11 features

## Overview (/index)

0. Overview
    - Java 11 is the first long-term support (LTS) release after Java 8

1. Oracle vs. Open JDK
2. Developer Features
    - New String Methods
    - New File Methods
    - Collection to an Array
    - The Not Predicate Method
    - Local-Variable Syntax for Lambda
    - HTTP Client
    - Nest Based Access Control
    - Running Java Files
3. Performance Enhancements
    - Dynamic Class-File Constants
    - Improved Aarch64 Intrinsics
    - A No-Op Garbage Collector
    - Flight Recorder
4. Removed and Deprecated Modules
   - Java EE and CORBA
   - JMC and JavaFX
   - Deprecated Modules
5. Miscellaneous Changes

    Java 11 introduced a few more changes that are important to mention:
    - New ChaCha20 and ChaCha20-Poly1305 cipher implementations replace the insecure RC4 stream cipher
    - Support for cryptographic key agreement with Curve25519 and Curve448 replace the existing ECDH scheme
    - Upgraded Transport Layer Security (TLS) to version 1.3 brings security and performance improvements
    - Introduced a low latency garbage collector, ZGC, as an experimental feature with low pause times
    - Support for Unicode 10 brings more characters, symbols, and emojis

##  New String Methods
    This module to talk about new string methods.

- [New String Methods](./string-api/README.md)