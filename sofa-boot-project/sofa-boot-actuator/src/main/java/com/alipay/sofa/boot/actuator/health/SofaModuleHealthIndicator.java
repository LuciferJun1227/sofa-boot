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
 */
package com.alipay.sofa.boot.actuator.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

import com.alipay.sofa.healthcheck.impl.ModuleHealthChecker;

/**
 * module health checker which implements ${@link org.springframework.boot.actuate.health.HealthIndicator}
 *
 * @author xuanbei 18/5/16
 */
public class SofaModuleHealthIndicator implements HealthIndicator {

    @Autowired
    private ModuleHealthChecker moduleHealthChecker;

    @Override
    public Health health() {
        return moduleHealthChecker.isHealthy();
    }
}
