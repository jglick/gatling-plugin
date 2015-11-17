/**
 * Copyright 2011-2015 GatlingCorp (http://gatling.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gatling.jenkins;

import hudson.FilePath;

/**
 * This class is basically just a struct to hold information about one
 * or more gatling simulations that were archived for a given
 * instance of {@link GatlingBuildAction}.
 */
public class BuildSimulation {
  private final String simulationName;
  private final RequestReport requestReport;
  private final FilePath simulationDirectory;

  public BuildSimulation(String simulationName, RequestReport requestReport, FilePath simulationDirectory) {
    this.simulationName = simulationName;
    this.requestReport = requestReport;
    this.simulationDirectory = simulationDirectory;
  }

  public String getSimulationName() {
    return simulationName;
  }

  public RequestReport getRequestReport() {
    return requestReport;
  }

  public FilePath getSimulationDirectory() {
    return simulationDirectory;
  }
}
