package com.template;

import v.akfz.db.generator.GenerateInitializer;
import v.akfz.db.generator.LoaderType;

@GenerateInitializer(loader = LoaderType.Both, modId = "temp")
public class TemplateMod {
    public void init() {
        System.out.println("Test");
    }
}
