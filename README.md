# purescript-refs

[![Latest release](http://img.shields.io/github/release/purescript/purescript-refs.svg)](https://github.com/purescript/purescript-refs/releases)
[![Build status](https://github.com/purescript/purescript-refs/workflows/CI/badge.svg?branch=master)](https://github.com/purescript/purescript-refs/actions?query=workflow%3ACI+branch%3Amaster)
[![Pursuit](https://pursuit.purescript.org/packages/purescript-refs/badge)](https://pursuit.purescript.org/packages/purescript-refs)

This module defines functions for working with mutable value references.

## Java port

`Ref` is a one-element `Object[]`. Reads, writes and the complete `modify'`
read/callback/write operation synchronize on the cell. The callback runs once
under that monitor; its `{ state, value }` result supports Maps and generated
record classes. See the [Java reference contract](../javapurs/docs/ffi-runtime.md#références).

`./bin/test-runtime` checks allocation, identity, exceptions, self-reference and
concurrent updates using the actual Java fragment. It needs Node and a JDK.

To run the PureScript suite with the built neighboring backend, Spago, the TAST
frontend and a JDK:

```bash
./bin/test
./bin/test --help
```

The [common port runner](../javapurs/docs/testing.md#port-particulier) copies
`src/` and `test/` into an isolated workspace, rebases `spago.java.yaml` (package
set 77.7.0), and waits for synchronous `Test.Main` to return. It preserves the
source configuration, lockfile and existing outputs. `-c`/`--clean` rebuilds the
backend through its `bin/build`; unknown options fail before preparation.
`JAVAPURS_JAVA_RELEASE` defaults to 17 and `JAVAPURS_JAVA_RUNTIME` can select a
separate execution JVM. The JVM stack is 8 MiB. Failed workspaces and phase logs
are retained, with their path printed.

_Note_: [`Control.Monad.ST`](https://pursuit.purescript.org/packages/purescript-st/4.0.0/docs/Control.Monad.ST) provides a _safe_ alternative to `Ref` when mutation is restricted to a local scope.

## Installation

```
spago install refs
```

## Example

```purs
import Effect.Ref as Ref

main = do
  -- initialize a new Ref with the value 0
  ref <- Ref.new 0

  -- read from it and check it
  curr1 <- Ref.read ref
  assertEqual { actual: curr1, expected: 0 }

  -- write over the ref with 1
  Ref.write 1 ref

  -- now it is 1 when we read out the value
  curr2 <- Ref.read ref
  assertEqual { actual: curr2, expected: 1 }

  -- modify it by adding 1 to the current state
  Ref.modify_ (\s -> s + 1) ref

  -- now it is 2 when we read out the value
  curr3 <- Ref.read ref
  assertEqual { actual: curr3, expected: 2 }
```

See [tests](test/Main.purs) to see usages.

## Documentation

Module documentation is [published on Pursuit](http://pursuit.purescript.org/packages/purescript-refs).
