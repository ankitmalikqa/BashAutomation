package com.Start.Bash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class BashFileAutomation 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Please provide the commit message");
    	String message=scan.next();
    	scan.close();
          		ProcessBuilder builder = new ProcessBuilder(
    	            "cmd.exe", "/c", "pushCode.sh '"+message+"'  && dir");
    	        builder.redirectErrorStream(true);
    	        Process p = builder.start();
    	        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
    	        String line;
    	        while (true) {
    	            line = r.readLine();
    	            if (line == null) { break; }
    	            System.out.println(line);
    	        }}}
