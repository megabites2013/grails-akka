/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class AkkaGrailsPlugin {
    def version = "0.6.1"
    def grailsVersion = "2.0 > *"
    def title = "Akka Integration"
    def author = "Sandro Martini"
    def authorEmail = "sandro.martini@gmail.com"
    def description = 'Akka actors integration from Groovy and Java, in a Servlet 3.x environment'
    def documentation = "http://smartiniongithub.github.com/grails-akka/"

    def license = "APACHE"
    def issueManagement = [ system: "github", url: "https://github.com/smartiniOnGitHub/grails-akka/issues/" ]
    def scm = [ url: "https://github.com/smartiniOnGitHub/grails-akka/" ]

    def pluginExcludes = [
        'src/docs/**',
        'src/groovy/**'
    ]
}
