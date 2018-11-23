/*
 * Copyright © 2018 camunda services GmbH and various authors (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.client.interceptor.impl;

import org.camunda.bpm.client.interceptor.ClientRequestContext;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Tassilo Weidner
 */
public class ClientRequestContextImpl implements ClientRequestContext {

  protected Map<String, String> headers;

  protected ClientRequestContextImpl() {
    this.headers = new LinkedHashMap<>();
  }

  @Override
  public void addHeader(String name, String value) {
    headers.put(name, value);
  }

  protected Map<String, String> getHeaders() {
    return headers;
  }

}