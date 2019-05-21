package com.sIeep;

import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;

public class main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        get("/", (request, response) -> {
            "Hello students!"
        }, new HandlebarsTemplateEngine());
    }
}
