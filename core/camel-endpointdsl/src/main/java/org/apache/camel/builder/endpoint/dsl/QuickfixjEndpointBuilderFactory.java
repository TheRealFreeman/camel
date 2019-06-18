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
 * The quickfix component allows to send Financial Interchange (FIX) messages to
 * the QuickFix engine.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface QuickfixjEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the QuickFix component.
     */
    public interface QuickfixjEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedQuickfixjEndpointConsumerBuilder advanced() {
            return (AdvancedQuickfixjEndpointConsumerBuilder) this;
        }
        /**
         * The configFile is the name of the QuickFIX/J configuration to use for
         * the FIX engine (located as a resource found in your classpath).
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default QuickfixjEndpointConsumerBuilder configurationName(
                String configurationName) {
            setProperty("configurationName", configurationName);
            return this;
        }
        /**
         * This option allows to create QuickFIX/J engine on demand. Value true
         * means the engine is started when first message is send or there's
         * consumer configured in route definition. When false value is used,
         * the engine is started at the endpoint creation. When this parameter
         * is missing, the value of component's property lazyCreateEngines is
         * being used.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        default QuickfixjEndpointConsumerBuilder lazyCreateEngine(
                boolean lazyCreateEngine) {
            setProperty("lazyCreateEngine", lazyCreateEngine);
            return this;
        }
        /**
         * This option allows to create QuickFIX/J engine on demand. Value true
         * means the engine is started when first message is send or there's
         * consumer configured in route definition. When false value is used,
         * the engine is started at the endpoint creation. When this parameter
         * is missing, the value of component's property lazyCreateEngines is
         * being used.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        default QuickfixjEndpointConsumerBuilder lazyCreateEngine(
                String lazyCreateEngine) {
            setProperty("lazyCreateEngine", lazyCreateEngine);
            return this;
        }
        /**
         * The optional sessionID identifies a specific FIX session. The format
         * of the sessionID is:
         * (BeginString):(SenderCompID)/(SenderSubID)/(SenderLocationID)-(TargetCompID)/(TargetSubID)/(TargetLocationID).
         * The option is a <code>quickfix.SessionID</code> type.
         * @group common
         */
        default QuickfixjEndpointConsumerBuilder sessionID(Object sessionID) {
            setProperty("sessionID", sessionID);
            return this;
        }
        /**
         * The optional sessionID identifies a specific FIX session. The format
         * of the sessionID is:
         * (BeginString):(SenderCompID)/(SenderSubID)/(SenderLocationID)-(TargetCompID)/(TargetSubID)/(TargetLocationID).
         * The option will be converted to a <code>quickfix.SessionID</code>
         * type.
         * @group common
         */
        default QuickfixjEndpointConsumerBuilder sessionID(String sessionID) {
            setProperty("sessionID", sessionID);
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
        default QuickfixjEndpointConsumerBuilder bridgeErrorHandler(
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
        default QuickfixjEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the QuickFix component.
     */
    public interface AdvancedQuickfixjEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default QuickfixjEndpointConsumerBuilder basic() {
            return (QuickfixjEndpointConsumerBuilder) this;
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
        default AdvancedQuickfixjEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedQuickfixjEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedQuickfixjEndpointConsumerBuilder exchangePattern(
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
        default AdvancedQuickfixjEndpointConsumerBuilder exchangePattern(
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
        default AdvancedQuickfixjEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedQuickfixjEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedQuickfixjEndpointConsumerBuilder synchronous(
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
        default AdvancedQuickfixjEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the QuickFix component.
     */
    public interface QuickfixjEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedQuickfixjEndpointProducerBuilder advanced() {
            return (AdvancedQuickfixjEndpointProducerBuilder) this;
        }
        /**
         * The configFile is the name of the QuickFIX/J configuration to use for
         * the FIX engine (located as a resource found in your classpath).
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default QuickfixjEndpointProducerBuilder configurationName(
                String configurationName) {
            setProperty("configurationName", configurationName);
            return this;
        }
        /**
         * This option allows to create QuickFIX/J engine on demand. Value true
         * means the engine is started when first message is send or there's
         * consumer configured in route definition. When false value is used,
         * the engine is started at the endpoint creation. When this parameter
         * is missing, the value of component's property lazyCreateEngines is
         * being used.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        default QuickfixjEndpointProducerBuilder lazyCreateEngine(
                boolean lazyCreateEngine) {
            setProperty("lazyCreateEngine", lazyCreateEngine);
            return this;
        }
        /**
         * This option allows to create QuickFIX/J engine on demand. Value true
         * means the engine is started when first message is send or there's
         * consumer configured in route definition. When false value is used,
         * the engine is started at the endpoint creation. When this parameter
         * is missing, the value of component's property lazyCreateEngines is
         * being used.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        default QuickfixjEndpointProducerBuilder lazyCreateEngine(
                String lazyCreateEngine) {
            setProperty("lazyCreateEngine", lazyCreateEngine);
            return this;
        }
        /**
         * The optional sessionID identifies a specific FIX session. The format
         * of the sessionID is:
         * (BeginString):(SenderCompID)/(SenderSubID)/(SenderLocationID)-(TargetCompID)/(TargetSubID)/(TargetLocationID).
         * The option is a <code>quickfix.SessionID</code> type.
         * @group common
         */
        default QuickfixjEndpointProducerBuilder sessionID(Object sessionID) {
            setProperty("sessionID", sessionID);
            return this;
        }
        /**
         * The optional sessionID identifies a specific FIX session. The format
         * of the sessionID is:
         * (BeginString):(SenderCompID)/(SenderSubID)/(SenderLocationID)-(TargetCompID)/(TargetSubID)/(TargetLocationID).
         * The option will be converted to a <code>quickfix.SessionID</code>
         * type.
         * @group common
         */
        default QuickfixjEndpointProducerBuilder sessionID(String sessionID) {
            setProperty("sessionID", sessionID);
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
        default QuickfixjEndpointProducerBuilder lazyStartProducer(
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
        default QuickfixjEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the QuickFix component.
     */
    public interface AdvancedQuickfixjEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default QuickfixjEndpointProducerBuilder basic() {
            return (QuickfixjEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedQuickfixjEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedQuickfixjEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedQuickfixjEndpointProducerBuilder synchronous(
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
        default AdvancedQuickfixjEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the QuickFix component.
     */
    public interface QuickfixjEndpointBuilder
            extends
                QuickfixjEndpointConsumerBuilder, QuickfixjEndpointProducerBuilder {
        default AdvancedQuickfixjEndpointBuilder advanced() {
            return (AdvancedQuickfixjEndpointBuilder) this;
        }
        /**
         * The configFile is the name of the QuickFIX/J configuration to use for
         * the FIX engine (located as a resource found in your classpath).
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default QuickfixjEndpointBuilder configurationName(
                String configurationName) {
            setProperty("configurationName", configurationName);
            return this;
        }
        /**
         * This option allows to create QuickFIX/J engine on demand. Value true
         * means the engine is started when first message is send or there's
         * consumer configured in route definition. When false value is used,
         * the engine is started at the endpoint creation. When this parameter
         * is missing, the value of component's property lazyCreateEngines is
         * being used.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        default QuickfixjEndpointBuilder lazyCreateEngine(
                boolean lazyCreateEngine) {
            setProperty("lazyCreateEngine", lazyCreateEngine);
            return this;
        }
        /**
         * This option allows to create QuickFIX/J engine on demand. Value true
         * means the engine is started when first message is send or there's
         * consumer configured in route definition. When false value is used,
         * the engine is started at the endpoint creation. When this parameter
         * is missing, the value of component's property lazyCreateEngines is
         * being used.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        default QuickfixjEndpointBuilder lazyCreateEngine(
                String lazyCreateEngine) {
            setProperty("lazyCreateEngine", lazyCreateEngine);
            return this;
        }
        /**
         * The optional sessionID identifies a specific FIX session. The format
         * of the sessionID is:
         * (BeginString):(SenderCompID)/(SenderSubID)/(SenderLocationID)-(TargetCompID)/(TargetSubID)/(TargetLocationID).
         * The option is a <code>quickfix.SessionID</code> type.
         * @group common
         */
        default QuickfixjEndpointBuilder sessionID(Object sessionID) {
            setProperty("sessionID", sessionID);
            return this;
        }
        /**
         * The optional sessionID identifies a specific FIX session. The format
         * of the sessionID is:
         * (BeginString):(SenderCompID)/(SenderSubID)/(SenderLocationID)-(TargetCompID)/(TargetSubID)/(TargetLocationID).
         * The option will be converted to a <code>quickfix.SessionID</code>
         * type.
         * @group common
         */
        default QuickfixjEndpointBuilder sessionID(String sessionID) {
            setProperty("sessionID", sessionID);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the QuickFix component.
     */
    public interface AdvancedQuickfixjEndpointBuilder
            extends
                AdvancedQuickfixjEndpointConsumerBuilder, AdvancedQuickfixjEndpointProducerBuilder {
        default QuickfixjEndpointBuilder basic() {
            return (QuickfixjEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedQuickfixjEndpointBuilder basicPropertyBinding(
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
        default AdvancedQuickfixjEndpointBuilder basicPropertyBinding(
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
        default AdvancedQuickfixjEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedQuickfixjEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The quickfix component allows to send Financial Interchange (FIX)
     * messages to the QuickFix engine.
     * Maven coordinates: org.apache.camel:camel-quickfix
     */
    default QuickfixjEndpointBuilder quickfixj(String path) {
        class QuickfixjEndpointBuilderImpl extends AbstractEndpointBuilder implements QuickfixjEndpointBuilder, AdvancedQuickfixjEndpointBuilder {
            public QuickfixjEndpointBuilderImpl(String path) {
                super("quickfix", path);
            }
        }
        return new QuickfixjEndpointBuilderImpl(path);
    }
}