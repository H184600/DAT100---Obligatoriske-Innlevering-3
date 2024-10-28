package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

String filbane = mappe + "/" + filnavn; 
        
        try {
            FileWriter writer = new FileWriter(filbane); 
            writer.write(samling.toString()); 
            writer.close();
            return true; 
        } catch (Exception e) { 
            return false; 
        }
    }

	}

