/*
 * Copyright 2018 trivago N.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.trivago.rta.json.pojo;

import com.google.gson.annotations.SerializedName;
import com.trivago.rta.constants.Status;
import com.trivago.rta.rendering.RenderingUtils;

public class Result {

    private long duration = 0;
    private String status = Status.UNDEFINED.toString();

    @SerializedName("error_message")
    private String errorMessage = "";

    public long getDuration() {
        return duration;
    }

    public void setDuration(final long duration) {
        this.duration = duration;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public boolean hasErrorMessage() {
        return !errorMessage.isEmpty();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getEncodedErrorMessage() {
        return RenderingUtils.escapeHTML(errorMessage);
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public long getDurationInMilliseconds() {
        return RenderingUtils.convertMicrosecondsToMilliseconds(duration);
    }

    public String returnDurationString() {
        return RenderingUtils.convertMicrosecondsToTimeString(duration);
    }

    @Override
    public String toString() {
        return "Result{" +
                "duration=" + duration +
                ", status='" + status + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
