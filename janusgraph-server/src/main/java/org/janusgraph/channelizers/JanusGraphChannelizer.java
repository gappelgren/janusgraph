// Copyright 2018 JanusGraph Authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.janusgraph.channelizers;

import org.apache.tinkerpop.gremlin.server.util.ServerGremlinExecutor;

/**
 * The JanusGraph Channelizer adheres to the TinkerPop Channelizer specification,
 * while allowing JanusGraph access to lower level GremlinServer components.
 */
public interface JanusGraphChannelizer {

    /**
     * Initializes a JanusGraphChannelizer from a {@link ServerGremlinExecutor},
     * which gives a running JanusGraph server access to lower level Gremlin Server
     * components.
     */
    public void init(final ServerGremlinExecutor serverGremlinExecutor);
}

