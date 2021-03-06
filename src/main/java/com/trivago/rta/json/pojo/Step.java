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

import com.trivago.rta.rendering.RenderingUtils;

import java.util.ArrayList;
import java.util.List;

public class Step extends ResultMatch {
    private int line;
    private String name = "";
    private String keyword = "";
    private List<String> output = new ArrayList<>();
    private List<Row> rows = new ArrayList<>();
    private List<Embedding> embeddings = new ArrayList<>();

    public int getLine() {
        return line;
    }

    public void setLine(final int line) {
        this.line = line;
    }

    public String getName() {
        return !name.isEmpty() ? name : "[Unnamed]";
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(final String keyword) {
        this.keyword = keyword;
    }

    public List<Embedding> getEmbeddings() {
        return embeddings;
    }

    public void setEmbeddings(final List<Embedding> embeddings) {
        this.embeddings = embeddings;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(final List<Row> rows) {
        this.rows = rows;
    }

    public List<String> getOutput() {
        return output;
    }

    public List<String> getEncodedOutput() {
        List<String> encodedOutput = new ArrayList<>();
        for (String outputString : output) {
            encodedOutput.add(RenderingUtils.escapeHTML(outputString));
        }
        return encodedOutput;
    }

    public void setOutput(final List<String> output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "Step{" +
                "line=" + line +
                ", name='" + name + '\'' +
                ", keyword='" + keyword + '\'' +
                ", output=" + output +
                ", rows=" + rows +
                ", embeddings=" + embeddings +
                '}';
    }
}
