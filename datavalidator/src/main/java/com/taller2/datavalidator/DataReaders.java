package com.taller2.datavalidator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataReaders {

    public static String readCSV(String route)  {
      return CSValidator.validators(route);
    }

    //XSLX Validator
    public static  String readXSLX(String route) {
        return XSLXValidator.validateXSLX(route);
    }


}
