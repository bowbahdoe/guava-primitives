/*
 * Copyright (C) 2010 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

/**
 * Static utilities for the eight primitive types and {@code void}, and value types for treating
 * them as unsigned or storing them in immutable arrays.
 *
 * <p>This package is a part of the open-source <a href="https://github.com/google/guava">Guava</a>
 * library.
 *
 * <p>See the Guava User Guide article on <a
 * href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
 *
 * <h2>Contents</h2>
 *
 * <h3>Value types</h3>
 *
 * <ul>
 *   <li>{@link dev.mccue.guava.primitives.ImmutableDoubleArray}
 *   <li>{@link dev.mccue.guava.primitives.ImmutableIntArray}
 *   <li>{@link dev.mccue.guava.primitives.ImmutableLongArray}
 *   <li>{@link dev.mccue.guava.primitives.UnsignedInteger}
 *   <li>{@link dev.mccue.guava.primitives.UnsignedLong}
 * </ul>
 *
 * <h3>Per-type static utilities</h3>
 *
 * <ul>
 *   <li>{@link dev.mccue.guava.primitives.Booleans}
 *   <li>{@link dev.mccue.guava.primitives.Bytes}
 *       <ul>
 *         <li>{@link dev.mccue.guava.primitives.SignedBytes}
 *         <li>{@link dev.mccue.guava.primitives.UnsignedBytes}
 *       </ul>
 *   <li>{@link dev.mccue.guava.primitives.Chars}
 *   <li>{@link dev.mccue.guava.primitives.Doubles}
 *   <li>{@link dev.mccue.guava.primitives.Floats}
 *   <li>{@link dev.mccue.guava.primitives.Ints}
 *       <ul>
 *         <li>{@link dev.mccue.guava.primitives.UnsignedInts}
 *       </ul>
 *   <li>{@link dev.mccue.guava.primitives.Longs}
 *       <ul>
 *         <li>{@link dev.mccue.guava.primitives.UnsignedLongs}
 *       </ul>
 *   <li>{@link dev.mccue.guava.primitives.Shorts}
 * </ul>
 *
 * <h3>General static utilities</h3>
 *
 * <ul>
 *   <li>{@link dev.mccue.guava.primitives.Primitives}
 * </ul>
 */
@ParametersAreNonnullByDefault
@CheckReturnValue
package dev.mccue.guava.primitives;

import com.google.errorprone.annotations.CheckReturnValue;
import dev.mccue.jsr305.ParametersAreNonnullByDefault;
import dev.mccue.guava.primitives.*;