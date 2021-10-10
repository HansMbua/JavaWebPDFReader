package com.company;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TextStore{
    /*
    store text
    other classes like button can manipulate text
     */
     private List<String> list;
     private BufferedReader br;

    public TextStore() {
    }

    //store text
    public void setStore(){
        this.list = new ArrayList();
    }

    public String getText(String fileName) throws IOException {
//        try {
//         //Scanner s = new Scanner(new File(fileName));
//            br = new BufferedReader(new FileReader(fileName));
//            System.out.println("<< inside getText method ");
//            String line;
//            while ((line = br.readLine()) != null) {
//                list.add(line);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                br.close();
//            }
//        }

        String text1 = "";

        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);


            PDDocument document = Loader.loadPDF(file);


           text1 = new PDFTextStripper().getText(document);
            System.out.println("Text in PDF\\n---------------------------------");
            System.out.println(text1);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }


        return text1;
    }

    public String displayText() {
//        list.stream().forEach(System.out::println);
        String text = " ";

//       for(int i = 0; i< list.size(); i++ ){
//           text = list.get(i);
//       }
       return text;
    }
}
