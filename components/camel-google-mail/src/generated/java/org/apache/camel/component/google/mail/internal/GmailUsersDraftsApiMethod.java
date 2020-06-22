
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.mail.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.google.api.services.gmail.Gmail.Users.Drafts;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.google.api.services.gmail.Gmail$Users$Drafts
 */
public enum GmailUsersDraftsApiMethod implements ApiMethod {

    CREATE(
        com.google.api.services.gmail.Gmail.Users.Drafts.Create.class,
        "create",
        arg("userId", String.class),
        arg("content", com.google.api.services.gmail.model.Draft.class)),

    CREATE_1(
        com.google.api.services.gmail.Gmail.Users.Drafts.Create.class,
        "create",
        arg("userId", String.class),
        arg("content", com.google.api.services.gmail.model.Draft.class),
        arg("mediaContent", com.google.api.client.http.AbstractInputStreamContent.class)),

    DELETE(
        com.google.api.services.gmail.Gmail.Users.Drafts.Delete.class,
        "delete",
        arg("userId", String.class),
        arg("id", String.class)),

    GET(
        com.google.api.services.gmail.Gmail.Users.Drafts.Get.class,
        "get",
        arg("userId", String.class),
        arg("id", String.class)),

    LIST(
        com.google.api.services.gmail.Gmail.Users.Drafts.List.class,
        "list",
        arg("userId", String.class)),

    SEND(
        com.google.api.services.gmail.Gmail.Users.Drafts.Send.class,
        "send",
        arg("userId", String.class),
        arg("content", com.google.api.services.gmail.model.Draft.class)),

    SEND_1(
        com.google.api.services.gmail.Gmail.Users.Drafts.Send.class,
        "send",
        arg("userId", String.class),
        arg("content", com.google.api.services.gmail.model.Draft.class),
        arg("mediaContent", com.google.api.client.http.AbstractInputStreamContent.class)),

    UPDATE(
        com.google.api.services.gmail.Gmail.Users.Drafts.Update.class,
        "update",
        arg("userId", String.class),
        arg("id", String.class),
        arg("content", com.google.api.services.gmail.model.Draft.class)),

    UPDATE_1(
        com.google.api.services.gmail.Gmail.Users.Drafts.Update.class,
        "update",
        arg("userId", String.class),
        arg("id", String.class),
        arg("content", com.google.api.services.gmail.model.Draft.class),
        arg("mediaContent", com.google.api.client.http.AbstractInputStreamContent.class));

    

    private final ApiMethod apiMethod;

    private GmailUsersDraftsApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Drafts.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
