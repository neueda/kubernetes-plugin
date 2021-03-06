/*
 * The MIT License
 *
 * Copyright (c) 2017, CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.csanchez.jenkins.plugins.kubernetes.model;

import io.fabric8.kubernetes.api.model.EnvVar;

/**
 * @author Carlos Sanchez
 * @since 0.13
 */
public interface TemplateEnvVar {

    String getKey();

    EnvVar buildEnvVar();

    class EnvironmentVariableNames {

        public static final String JENKINS_URL = "JENKINS_URL";
        public static final String JENKINS_LOCATION_URL = "JENKINS_LOCATION_URL";
        public static final String JENKINS_TUNNEL = "JENKINS_TUNNEL";
        public static final String JENKINS_SECRET = "JENKINS_SECRET";
        public static final String JENKINS_NAME = "JENKINS_NAME";
        public static final String JENKINS_JNLP_URL = "JENKINS_JNLP_URL";
        public static final String HOME = "HOME";

        private EnvironmentVariableNames() {}

    }

}
