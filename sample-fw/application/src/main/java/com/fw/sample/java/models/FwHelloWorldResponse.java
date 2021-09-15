package com.fw.sample.java.models;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("PMD.UnusedPrivateField")
public class FwHelloWorldResponse
{
    @JsonProperty("hello")
    private final String name;

    public FwHelloWorldResponse( final String name ) {
        this.name = name;
    }
}
