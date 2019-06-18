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

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The gora component allows you to work with NoSQL databases using the Apache
 * Gora framework.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoraEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Gora component.
     */
    public interface GoraEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGoraEndpointConsumerBuilder advanced() {
            return (AdvancedGoraEndpointConsumerBuilder) this;
        }
        /**
         * Instance name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default GoraEndpointConsumerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The type of the dataStore.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default GoraEndpointConsumerBuilder dataStoreClass(String dataStoreClass) {
            setProperty("dataStoreClass", dataStoreClass);
            return this;
        }
        /**
         * The type class of the key.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default GoraEndpointConsumerBuilder keyClass(String keyClass) {
            setProperty("keyClass", keyClass);
            return this;
        }
        /**
         * The type of the value.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default GoraEndpointConsumerBuilder valueClass(String valueClass) {
            setProperty("valueClass", valueClass);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Number of concurrent consumers.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder concurrentConsumers(
                int concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Number of concurrent consumers.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * The End Key.
         * The option is a <code>java.lang.Object</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder endKey(Object endKey) {
            setProperty("endKey", endKey);
            return this;
        }
        /**
         * The End Key.
         * The option will be converted to a <code>java.lang.Object</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder endKey(String endKey) {
            setProperty("endKey", endKey);
            return this;
        }
        /**
         * The End Time.
         * The option is a <code>long</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder endTime(long endTime) {
            setProperty("endTime", endTime);
            return this;
        }
        /**
         * The End Time.
         * The option will be converted to a <code>long</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder endTime(String endTime) {
            setProperty("endTime", endTime);
            return this;
        }
        /**
         * The Fields.
         * The option is a <code>com.google.common.base.Strings</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder fields(Object fields) {
            setProperty("fields", fields);
            return this;
        }
        /**
         * The Fields.
         * The option will be converted to a
         * <code>com.google.common.base.Strings</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder fields(String fields) {
            setProperty("fields", fields);
            return this;
        }
        /**
         * The Key Range From.
         * The option is a <code>java.lang.Object</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder keyRangeFrom(Object keyRangeFrom) {
            setProperty("keyRangeFrom", keyRangeFrom);
            return this;
        }
        /**
         * The Key Range From.
         * The option will be converted to a <code>java.lang.Object</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder keyRangeFrom(String keyRangeFrom) {
            setProperty("keyRangeFrom", keyRangeFrom);
            return this;
        }
        /**
         * The Key Range To.
         * The option is a <code>java.lang.Object</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder keyRangeTo(Object keyRangeTo) {
            setProperty("keyRangeTo", keyRangeTo);
            return this;
        }
        /**
         * The Key Range To.
         * The option will be converted to a <code>java.lang.Object</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder keyRangeTo(String keyRangeTo) {
            setProperty("keyRangeTo", keyRangeTo);
            return this;
        }
        /**
         * The Limit.
         * The option is a <code>long</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder limit(long limit) {
            setProperty("limit", limit);
            return this;
        }
        /**
         * The Limit.
         * The option will be converted to a <code>long</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder limit(String limit) {
            setProperty("limit", limit);
            return this;
        }
        /**
         * The Start Key.
         * The option is a <code>java.lang.Object</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder startKey(Object startKey) {
            setProperty("startKey", startKey);
            return this;
        }
        /**
         * The Start Key.
         * The option will be converted to a <code>java.lang.Object</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder startKey(String startKey) {
            setProperty("startKey", startKey);
            return this;
        }
        /**
         * The Start Time.
         * The option is a <code>long</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder startTime(long startTime) {
            setProperty("startTime", startTime);
            return this;
        }
        /**
         * The Start Time.
         * The option will be converted to a <code>long</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder startTime(String startTime) {
            setProperty("startTime", startTime);
            return this;
        }
        /**
         * The Time Range From.
         * The option is a <code>long</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder timeRangeFrom(long timeRangeFrom) {
            setProperty("timeRangeFrom", timeRangeFrom);
            return this;
        }
        /**
         * The Time Range From.
         * The option will be converted to a <code>long</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder timeRangeFrom(String timeRangeFrom) {
            setProperty("timeRangeFrom", timeRangeFrom);
            return this;
        }
        /**
         * The Time Range To.
         * The option is a <code>long</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder timeRangeTo(long timeRangeTo) {
            setProperty("timeRangeTo", timeRangeTo);
            return this;
        }
        /**
         * The Time Range To.
         * The option will be converted to a <code>long</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder timeRangeTo(String timeRangeTo) {
            setProperty("timeRangeTo", timeRangeTo);
            return this;
        }
        /**
         * The Timestamp.
         * The option is a <code>long</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder timestamp(long timestamp) {
            setProperty("timestamp", timestamp);
            return this;
        }
        /**
         * The Timestamp.
         * The option will be converted to a <code>long</code> type.
         * @group consumer
         */
        default GoraEndpointConsumerBuilder timestamp(String timestamp) {
            setProperty("timestamp", timestamp);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Gora component.
     */
    public interface AdvancedGoraEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default GoraEndpointConsumerBuilder basic() {
            return (GoraEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        default AdvancedGoraEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        default AdvancedGoraEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedGoraEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedGoraEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedGoraEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedGoraEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Hadoop Configuration.
         * The option is a <code>org.apache.hadoop.conf.Configuration</code>
         * type.
         * @group advanced
         */
        default AdvancedGoraEndpointConsumerBuilder hadoopConfiguration(
                Object hadoopConfiguration) {
            setProperty("hadoopConfiguration", hadoopConfiguration);
            return this;
        }
        /**
         * Hadoop Configuration.
         * The option will be converted to a
         * <code>org.apache.hadoop.conf.Configuration</code> type.
         * @group advanced
         */
        default AdvancedGoraEndpointConsumerBuilder hadoopConfiguration(
                String hadoopConfiguration) {
            setProperty("hadoopConfiguration", hadoopConfiguration);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedGoraEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedGoraEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Gora component.
     */
    public interface GoraEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGoraEndpointProducerBuilder advanced() {
            return (AdvancedGoraEndpointProducerBuilder) this;
        }
        /**
         * Instance name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default GoraEndpointProducerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The type of the dataStore.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default GoraEndpointProducerBuilder dataStoreClass(String dataStoreClass) {
            setProperty("dataStoreClass", dataStoreClass);
            return this;
        }
        /**
         * The type class of the key.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default GoraEndpointProducerBuilder keyClass(String keyClass) {
            setProperty("keyClass", keyClass);
            return this;
        }
        /**
         * The type of the value.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default GoraEndpointProducerBuilder valueClass(String valueClass) {
            setProperty("valueClass", valueClass);
            return this;
        }
        /**
         * Flush on every operation.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default GoraEndpointProducerBuilder flushOnEveryOperation(
                boolean flushOnEveryOperation) {
            setProperty("flushOnEveryOperation", flushOnEveryOperation);
            return this;
        }
        /**
         * Flush on every operation.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default GoraEndpointProducerBuilder flushOnEveryOperation(
                String flushOnEveryOperation) {
            setProperty("flushOnEveryOperation", flushOnEveryOperation);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default GoraEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default GoraEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Gora component.
     */
    public interface AdvancedGoraEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default GoraEndpointProducerBuilder basic() {
            return (GoraEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedGoraEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedGoraEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Hadoop Configuration.
         * The option is a <code>org.apache.hadoop.conf.Configuration</code>
         * type.
         * @group advanced
         */
        default AdvancedGoraEndpointProducerBuilder hadoopConfiguration(
                Object hadoopConfiguration) {
            setProperty("hadoopConfiguration", hadoopConfiguration);
            return this;
        }
        /**
         * Hadoop Configuration.
         * The option will be converted to a
         * <code>org.apache.hadoop.conf.Configuration</code> type.
         * @group advanced
         */
        default AdvancedGoraEndpointProducerBuilder hadoopConfiguration(
                String hadoopConfiguration) {
            setProperty("hadoopConfiguration", hadoopConfiguration);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedGoraEndpointProducerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedGoraEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Gora component.
     */
    public interface GoraEndpointBuilder
            extends
                GoraEndpointConsumerBuilder, GoraEndpointProducerBuilder {
        default AdvancedGoraEndpointBuilder advanced() {
            return (AdvancedGoraEndpointBuilder) this;
        }
        /**
         * Instance name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default GoraEndpointBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The type of the dataStore.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default GoraEndpointBuilder dataStoreClass(String dataStoreClass) {
            setProperty("dataStoreClass", dataStoreClass);
            return this;
        }
        /**
         * The type class of the key.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default GoraEndpointBuilder keyClass(String keyClass) {
            setProperty("keyClass", keyClass);
            return this;
        }
        /**
         * The type of the value.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default GoraEndpointBuilder valueClass(String valueClass) {
            setProperty("valueClass", valueClass);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Gora component.
     */
    public interface AdvancedGoraEndpointBuilder
            extends
                AdvancedGoraEndpointConsumerBuilder, AdvancedGoraEndpointProducerBuilder {
        default GoraEndpointBuilder basic() {
            return (GoraEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedGoraEndpointBuilder basicPropertyBinding(
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
        default AdvancedGoraEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Hadoop Configuration.
         * The option is a <code>org.apache.hadoop.conf.Configuration</code>
         * type.
         * @group advanced
         */
        default AdvancedGoraEndpointBuilder hadoopConfiguration(
                Object hadoopConfiguration) {
            setProperty("hadoopConfiguration", hadoopConfiguration);
            return this;
        }
        /**
         * Hadoop Configuration.
         * The option will be converted to a
         * <code>org.apache.hadoop.conf.Configuration</code> type.
         * @group advanced
         */
        default AdvancedGoraEndpointBuilder hadoopConfiguration(
                String hadoopConfiguration) {
            setProperty("hadoopConfiguration", hadoopConfiguration);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedGoraEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedGoraEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The gora component allows you to work with NoSQL databases using the
     * Apache Gora framework.
     * Maven coordinates: org.apache.camel:camel-gora
     */
    default GoraEndpointBuilder gora(String path) {
        class GoraEndpointBuilderImpl extends AbstractEndpointBuilder implements GoraEndpointBuilder, AdvancedGoraEndpointBuilder {
            public GoraEndpointBuilderImpl(String path) {
                super("gora", path);
            }
        }
        return new GoraEndpointBuilderImpl(path);
    }
}