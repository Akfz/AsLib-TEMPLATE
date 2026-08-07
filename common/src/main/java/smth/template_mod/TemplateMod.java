package smth.template_mod;

import v.akfz.aslib.initializer.generator.GenerateInitializer;
import v.akfz.aslib.initializer.generator.InitializerClass;
import v.akfz.aslib.initializer.generator.LoaderType;

//мейн класс, обязательно GenerateInitializer и InitializerClass
@GenerateInitializer(loader = LoaderType.Both, modId = "template")
public class TemplateMod implements InitializerClass {
    @Override
    public void init() {
        System.out.println("HALLO :D");
    }
}
