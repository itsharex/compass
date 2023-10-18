/*
 * Copyright 2023 OPPO.
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

package com.oppo.cloud.parser.domain.job;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oppo.cloud.common.constant.LogGroupType;
import com.oppo.cloud.common.domain.job.App;
import com.oppo.cloud.common.domain.job.LogInfo;
import com.oppo.cloud.common.domain.job.LogRecord;
import com.oppo.cloud.common.domain.opensearch.TaskApp;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Task Param Information
 */
@Slf4j
@Data
public class TaskParam {

    /**
     * log group type
     */
    private LogGroupType category;
    /**
     * LogRecord information
     */
    private LogRecord logRecord;
    /**
     * app information
     */
    private App app;
    /**
     * log information
     */
    private LogInfo logInfo;

    /**
     * task retry number
     */
    private int retry;

    private ObjectMapper objectMapper = new ObjectMapper();

    public TaskParam() {

    }

    public TaskParam(String category, LogRecord logRecord, App app, LogInfo logInfo) {
        this.category = LogGroupType.get(category);
        this.logRecord = logRecord;
        this.app = app;
        this.logInfo = logInfo;
    }
}
