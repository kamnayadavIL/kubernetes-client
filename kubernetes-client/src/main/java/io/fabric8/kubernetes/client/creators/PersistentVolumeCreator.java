/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client.creators;

import io.fabric8.kubernetes.api.model.PersistentVolume;
import io.fabric8.kubernetes.client.Client;
import io.fabric8.kubernetes.client.GenericKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.ResourceCreator;
import io.fabric8.kubernetes.client.dsl.internal.PersistentVolumeOperationsImpl;

public class PersistentVolumeCreator implements ResourceCreator<PersistentVolume> {
  @Override
  public Class<PersistentVolume> getKind() {
    return PersistentVolume.class;
  }

  @Override
  public PersistentVolume create(Client client, String namespace, PersistentVolume item) {
    return new PersistentVolumeOperationsImpl<Client>(client, namespace, null, true, item).create();
  }
}