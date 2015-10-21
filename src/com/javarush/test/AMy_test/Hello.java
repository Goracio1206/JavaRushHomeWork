package com.javarush.test.AMy_test;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Hello{


    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input First Name: ");
        String fName = reader.readLine();
        System.out.println("Input Second Name: ");
        String sName = reader.readLine();
        System.out.println("Input Service Type Name: ");
        String serviceType = reader.readLine();
        System.out.println("Input Client Product: ");
        String clProd = reader.readLine();
        System.out.println("Input Model: ");
        String model = reader.readLine();
        System.out.println("Input Client Phone:");
        long phone  = Long.parseLong(reader.readLine());

        Services firstClient = new Services(fName, sName, serviceType, clProd, model, phone);
        System.out.println(firstClient.toString());

        System.out.println(firstClient.newClient());
        firstClient.save(firstClient.newClient());
    }

    static class Services extends saveToFile {
        private String clientFirstName;
        private String clientSecondName;
        private String servicesType;
        private String clientProduct;
        private String productModel;
        private long clientPhone;
        private String dateIncome;
        private String dateRelease;
        private String jobState;



        public void setClientSecondName(String sName){
            this.clientSecondName = sName;
        }
        public String setClientFirstName(String sName){
            return this.clientSecondName;
        }
        public void setServicesType(String servicesType){
            this.servicesType = servicesType;
        }
        public String getServicesType(String servicesType){
            return this.servicesType;
        }
        public void setClientProduct(String clientProdModel){
            this.clientProduct = clientProdModel;
        }
        public String getClientProduct(){
            return this.clientProduct;
        }
        public void setProductModel(String Model){
            this.productModel = Model;
        }
        public String getProductModel(){
            return this.productModel;
        }
        public void setClientPhone(int phone){
            this.clientPhone = phone;
        }
        public long getClientPhone(){
            return this.clientPhone;
        }
        public void setDateIncome(String dateIncome){
            this.dateIncome = dateIncome;
        }
        public String getDateIncome(){
            return this.dateIncome;
        }
        public void setDateRelease(String dateRelease){
            this.dateRelease = dateRelease;
        }
        public String getDateRelease(){
            return this.dateRelease;
        }
        public void setJobState(String jobState){
            this.jobState = jobState;
        }
        public String getJobState(){
            return this.jobState;
        }

        protected String date(){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            return dateFormat.format(date);
        }

        public Services(){

        }
        public Services(String fName, String sName, String servType, String clientProd, String model, long phone ){
            this.clientFirstName = fName;
            this.clientSecondName = sName;
            this.servicesType = servType;
            this.clientProduct = clientProd;
            this.productModel = model;
            this.clientPhone = phone;
            this.dateIncome = date();
            this.dateRelease = "-";
            this.jobState = "Unresolved";
        }

        private ArrayList<String> newClient(){
            ArrayList<String> customer = new ArrayList<String>();
            customer.add("Client First Name: " + this.clientFirstName);
            customer.add("Client Second Name: " + this.clientSecondName);
            customer.add("Services Type: " + this.servicesType);
            customer.add("Client Product: " + this.clientProduct);
            customer.add("Service Type: " + this.servicesType);
            customer.add("Product Model: " + this.productModel);
            customer.add("Client Phone: " + String.valueOf(this.clientPhone));
            customer.add("Date income: " + this.date());
            customer.add("Date out: " + "-");
            customer.add("Job State: " + this.jobState);
            return customer;
        }

        @Override
        public String toString() {
            return "clientFirstName: " + clientFirstName + "\n" +
                    "clientSecondName: " + clientSecondName + '\n' +
                    "servicesType: " + servicesType + '\n' +
                    "clientProduct: " + clientProduct + '\n' +
                    "productModel: " + productModel + '\n' +
                    "clientPhone: " + clientPhone + "\n" +
                    "dateIncome: " + dateIncome + '\n' +
                    "dateRelease: " + dateRelease + '\n' +
                    "jobState: " + jobState + '\n';
        }

    }
static class saveToFile{

        public void save(ArrayList<String> list) throws IOException {
            FileWriter fileOut = new FileWriter("d:/out.txt", true);
            BufferedWriter bwriter = new BufferedWriter(fileOut);
            for (int i = 0; i < list.size(); i++) {
            bwriter.write(list.get(i));
            bwriter.newLine();
            }
            bwriter.flush();
            bwriter.close();
        }
    }
}
