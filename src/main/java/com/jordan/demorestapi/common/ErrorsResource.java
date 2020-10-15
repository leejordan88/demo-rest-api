package com.jordan.demorestapi.common;

import com.jordan.demorestapi.index.IndexController;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.validation.Errors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

public class ErrorsResource extends RepresentationModel {

    public ErrorsResource(Errors content, Link... links) {
        add(linkTo(methodOn(IndexController.class).index()).withRel("index"));
    }

}
