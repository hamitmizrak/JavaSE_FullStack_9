package com.hamitmizrak.lesson3;

public class _18_AccessModifier {

    //Field
    public String publicData="public data";
    protected String protectedData="protected data";
    private String privateData="private data";
    String defaultData="default data";


    public static void main(String[] args) {
        _18_AccessModifier instance=new _18_AccessModifier();
        System.out.println(instance.publicData);
        System.out.println(instance.protectedData);
        System.out.println(instance.privateData);
        System.out.println(instance.defaultData);
    }
}
