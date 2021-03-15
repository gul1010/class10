package com.class10;

public class Array {

	public static void main(String[] args) {
		
		char[] a=new char[6];
		a[0]='A';
		a[1]='B';
		a[2]='C';
		a[3]='D';
		a[4]='E';
		a[5]='F';
		System.out.println(a[1]);
        System.out.println("Number of arrays "+a.length);
        
        
        
        System.out.println("------------------------Task1-------------------------------");
        
        String[] names=new String[6];
        names[0]="Gul";
        names[1]="Alec";
        names[2]="Ariana";
        names[3]="Yuliya";
        names[4]="Eva";
        names[5]="Juan";
        System.out.println(names[0]+", "+names[1]+", "+names[2]);
        
        String[] names1= {"Gul","Alec","Ariana","Yuliya","Eva","Juan"};
        System.out.println(names1[4]);
        System.out.println("Total names are "+names1.length);
        
        System.out.println("------------------------Task2-----------------------------------");
        
        String[] words= {"Java","Saturday","day","coding","is"};
        
        System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
        
        System.out.println("-----------------------------------------");
        
        for(int i=0; i<names.length; i++) {
        	System.out.println(names[i]);
        }
	}

}
