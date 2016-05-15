/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

 
public class testing2 {
    public static void main(String[] args){
        testing2 x = new testing2();
        x.hash("pushpitha");
    }
   
    public void hash(String s){
        char[] bytes = s.toCharArray();
        String salt = "";
        for(char x:bytes){
            salt+=x^23;
            System.out.println(Character.toChars(x^23+5));
        }
        System.out.println(salt);
    }
}
