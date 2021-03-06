package com.unicodecollective.dropwizard.hazelcast.session.example.views;


import io.dropwizard.views.View;

public class IndexPageView extends View {

    private final String name;

    public IndexPageView(String name) {
        super("/views/index.ftl");
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
