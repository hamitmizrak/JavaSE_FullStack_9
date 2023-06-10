package com.hamitmizrak.lesson9_Generics;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GenericsTutorials <T> {

    private T data;

    public GenericsTutorials() {
    }

    public GenericsTutorials(T data) {
        this.data = data;
    }

    // Method
    public <M> void genericsMethod(M adi, String soyadi){
        System.out.println(adi+" "+soyadi);
    }
}


class MainPsvm{
    public static void main(String[] args) {
        GenericsTutorials genericsTutorials=new GenericsTutorials();
        genericsTutorials.setData("Malatya");
        System.out.println(genericsTutorials.getData());

        genericsTutorials.setData(44);
        System.out.println(genericsTutorials.getData());
        System.out.println("***********************");
        genericsTutorials.genericsMethod(444444,"Mızrak");

    }
}