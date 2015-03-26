package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        File file;
        InputStream stream;

        Expression objfunc;
        ArrayList<Expression> constraints;

        if (args.length == 0){

            file = new File("data/ITIP_problem.txt");

        }
        else if (args.length == 1) {

            System.out.println("ITIP: Reading from file " + args[0] + "...");
            file = new File(args[0]);

        } else {

            System.out.println("ITIP: The format of ITIP should be either:");
            System.out.println("ITIP or");
            System.out.println("ITIP filename");

            return;
        }

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            stream = new ByteArrayInputStream(line.getBytes(StandardCharsets.UTF_8));
            objfunc = new Expression();

            Analyzer analyzer = new Analyzer(stream);
            analyzer.analyze(objfunc);

            objfunc.print();

            constraints = new ArrayList<Expression>();
            Expression expr;

            while( (line = bufferedReader.readLine())!= null ){

                stream = new ByteArrayInputStream(line.getBytes(StandardCharsets.UTF_8));
                //analyzer = new Analyzer(stream);
                analyzer.ReInit(stream);
                expr = new Expression();
                analyzer.analyze(expr);
                constraints.add(expr);
                expr.print();

            }

        } catch (Exception e) {
            System.out.println("Error occurs.");
        }


    }
}
