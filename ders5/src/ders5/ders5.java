package ders5;

import java.util.Scanner;

public class ders5 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("öðrenci sayýsýný giriniz: ");
		int öðrencisayýsý=scan.nextInt();
		
		double[] score=new double[öðrencisayýsý];
		double best=0;
		
		System.out.println("öðrencilerin notlarýný giriniz");
		
		for(int i=0;i<score.length;i++) {
			System.out.print((i+1) + ". öðrencinin notu: ");
			score[i]=scan.nextDouble();
			
			if(score[i] > best) {
				best=score[i];
			}
		}
		System.out.println("en yüksek not: "+best);
		
		char grade;
		for(int i=0;i<score.length;i++) {
			if(score[i] >= (best- 5)) {
				grade='A';
			}
			else if(score[i] >= (best-10)) {
				grade='B';
			}
			else if(score[i] >= (best-15)) {
				grade='C';
			}
			else if(score[i] >= (best-20)) {
				grade='D';
			}
			else {
				grade='F';	
			}
			System.out.println((i+1) + ". öðrencinin notu " + score[i]
					+ " ve harf notu da " + grade);
		}

			
		}
	}


