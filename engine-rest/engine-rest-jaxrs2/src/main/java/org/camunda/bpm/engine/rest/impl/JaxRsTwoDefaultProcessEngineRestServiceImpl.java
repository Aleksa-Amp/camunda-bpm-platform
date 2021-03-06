/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. Camunda licenses this file to you under the Apache License,
 * Version 2.0; you may not use this file except in compliance with the License.
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
package org.camunda.bpm.engine.rest.impl;

import org.camunda.bpm.engine.rest.FetchAndLockRestService;

import javax.ws.rs.Path;

/**
 * @author Tassilo Weidner
 */
@Path(DefaultProcessEngineRestServiceImpl.PATH)
public class JaxRsTwoDefaultProcessEngineRestServiceImpl extends DefaultProcessEngineRestServiceImpl {

  @Path(FetchAndLockRestService.PATH)
  public FetchAndLockRestService fetchAndLock() {
    String rootResourcePath = getRelativeEngineUri(null).toASCIIString();
    FetchAndLockRestServiceImpl subResource = new FetchAndLockRestServiceImpl(null, getObjectMapper());
    subResource.setRelativeRootResourceUri(rootResourcePath);
    return subResource;
  }

}
