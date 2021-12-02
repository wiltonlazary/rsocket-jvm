/*
 * Copyright 2020 - present Maksym Ostroverkhov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jauntsdn.rsocket;

import io.helidon.common.reactive.Single;
import java.util.concurrent.Flow;
import java.util.function.Function;

public interface RSocketRpcInstrumentation {

  <T> Function<? super Flow.Publisher<T>, ? extends Flow.Publisher<T>> instrumentMulti(
      String role, String service, String method, boolean isStream);

  <T> Function<? super Single<T>, ? extends Single<T>> instrumentSingle(
      String role, String service, String method);
}
