package com.taller.taller;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TallerService {



    public String identifyDocument(String route) throws FileNotFoundException {
        String files = "";
        if (route.contains(".csv")) {
            files = DataReaders.readCSV(route);
        } else if (route.contains(".xlsx")) {
            files = DataReaders.readXSLX(route);
        }else{
            files = "Type of data not supported";
        }
        return files;
    }



}

