package com.Start.Bash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {
          		ProcessBuilder builder = new ProcessBuilder(
    	            "cmd.exe", "/c", "pushCode.sh 'ashoka'  && dir");
    	        builder.redirectErrorStream(true);
    	        Process p = builder.start();
    	        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
    	        String line;
    	        while (true) {
    	            line = r.readLine();
    	            if (line == null) { break; }
    	            System.out.println(line);
    	        }}}
