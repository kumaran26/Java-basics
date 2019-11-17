package com.examples;

public class Important {

    public static String vowelOnly(String input) {
        String vowels = "";
        for(int i=0; i<input.length(); i++){
            char individualCharacter = input.toLowerCase().charAt(i);
            if(individualCharacter == 'a' || individualCharacter == 'e' ||
                individualCharacter == 'i' || individualCharacter == 'o' || individualCharacter == 'u'){
                vowels = vowels + individualCharacter;
            }
        }
        return vowels;
    }

    public static void main(String args[]) {

        /*Difference between string and string builder
        string allocates memory every time a value is assigned but string builder stores in the same memory*/
        String name = "Google";
        name = "Facebook";
        System.out.println(name);

        StringBuilder nameBuilder = new StringBuilder ();
        nameBuilder.append ("Google");
        nameBuilder.append (" Facebook");
        System.out.println(nameBuilder); // O/P Google Facebook

        nameBuilder.insert(0, "Friend "); // O/P - Friend Google Facebook
        System.out.println(nameBuilder.toString());

        System.out.println(vowelOnly("Hello World!"));
        System.out.println(vowelOnly("Udacity Course"));
    }
}
