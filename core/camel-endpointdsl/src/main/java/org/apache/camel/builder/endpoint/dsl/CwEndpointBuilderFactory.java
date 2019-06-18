/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.Date;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The aws-cw component is used for sending metrics to an Amazon CloudWatch.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CwEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS CloudWatch component.
     */
    public interface CwEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedCwEndpointBuilder advanced() {
            return (AdvancedCwEndpointBuilder) this;
        }
        /**
         * The metric namespace.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default CwEndpointBuilder namespace(String namespace) {
            setProperty("namespace", namespace);
            return this;
        }
        /**
         * To use the AmazonCloudWatch as the client.
         * The option is a
         * <code>com.amazonaws.services.cloudwatch.AmazonCloudWatch</code> type.
         * @group producer
         */
        default CwEndpointBuilder amazonCwClient(Object amazonCwClient) {
            setProperty("amazonCwClient", amazonCwClient);
            return this;
        }
        /**
         * To use the AmazonCloudWatch as the client.
         * The option will be converted to a
         * <code>com.amazonaws.services.cloudwatch.AmazonCloudWatch</code> type.
         * @group producer
         */
        default CwEndpointBuilder amazonCwClient(String amazonCwClient) {
            setProperty("amazonCwClient", amazonCwClient);
            return this;
        }
        /**
         * The metric name.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default CwEndpointBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * To define a proxy host when instantiating the CW client.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default CwEndpointBuilder proxyHost(String proxyHost) {
            setProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the CW client.
         * The option is a <code>java.lang.Integer</code> type.
         * @group producer
         */
        default CwEndpointBuilder proxyPort(Integer proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the CW client.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group producer
         */
        default CwEndpointBuilder proxyPort(String proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The region in which CW client needs to work.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default CwEndpointBuilder region(String region) {
            setProperty("region", region);
            return this;
        }
        /**
         * The metric timestamp.
         * The option is a <code>java.util.Date</code> type.
         * @group producer
         */
        default CwEndpointBuilder timestamp(Date timestamp) {
            setProperty("timestamp", timestamp);
            return this;
        }
        /**
         * The metric timestamp.
         * The option will be converted to a <code>java.util.Date</code> type.
         * @group producer
         */
        default CwEndpointBuilder timestamp(String timestamp) {
            setProperty("timestamp", timestamp);
            return this;
        }
        /**
         * The metric unit.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default CwEndpointBuilder unit(String unit) {
            setProperty("unit", unit);
            return this;
        }
        /**
         * The metric value.
         * The option is a <code>java.lang.Double</code> type.
         * @group producer
         */
        default CwEndpointBuilder value(Double value) {
            setProperty("value", value);
            return this;
        }
        /**
         * The metric value.
         * The option will be converted to a <code>java.lang.Double</code> type.
         * @group producer
         */
        default CwEndpointBuilder value(String value) {
            setProperty("value", value);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default CwEndpointBuilder accessKey(String accessKey) {
            setProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default CwEndpointBuilder secretKey(String secretKey) {
            setProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS CloudWatch component.
     */
    public interface AdvancedCwEndpointBuilder
            extends
                EndpointProducerBuilder {
        default CwEndpointBuilder basic() {
            return (CwEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCwEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCwEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCwEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCwEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The aws-cw component is used for sending metrics to an Amazon CloudWatch.
     * 
     * Maven coordinates: org.apache.camel:camel-aws-cw
     */
    default CwEndpointBuilder cw(String path) {
        class CwEndpointBuilderImpl extends AbstractEndpointBuilder implements CwEndpointBuilder, AdvancedCwEndpointBuilder {
            public CwEndpointBuilderImpl(String path) {
                super("aws-cw", path);
            }
        }
        return new CwEndpointBuilderImpl(path);
    }
}