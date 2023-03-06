package com;

import java.util.Scanner;

public class CountEachChar
{

    public static void main(String[] args)
        {
            String str;
            int[] counter = new int[256];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String:");
            str = sc.nextLine();
            for(int i = 0; i<str.length(); i++)
            {
                counter[(int)str.charAt(i)]++;
            }
            for(int i = 0; i < 256; i++)
            {
                if(counter[i] != 0)
                {
                    System.out.println((char)i +" is found "+counter[i]);
                }
            }

        }
    }

