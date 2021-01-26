/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.apm.plugin.nozdormu;

import org.apache.skywalking.apm.agent.core.context.tag.AbstractTag;
import org.apache.skywalking.apm.agent.core.context.tag.Tags;
import org.apache.skywalking.apm.network.trace.component.Component;

public class Constants {

    public static final String NOZDORMU_IJOB_HANDLER = "com.chen.nozdormu.core.handler.IJobHandler";
    public static final String NOZDORMU_METHOD_JOB_HANDLER = "com.chen.nozdormu.core.handler.impl.MethodJobHandler";

    public static final AbstractTag JOB_PARAM = Tags.ofKey("jobParam");

    public static final Component COMPONENT = new Component() {
        @Override
        public int getId() {
            return 999;
        }

        @Override
        public String getName() {
            return "nozdormu";
        }
    };
}
