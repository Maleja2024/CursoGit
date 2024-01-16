package com.defaultpackage.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Default2Question implements Question<String> {
    private static String name;
    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}
