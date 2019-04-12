package com.example.design_sujan;

class DesignVehicle_Sujan {
    private String make,year,color,purchaseprice,enginesize;
    int vehicle_no;

    public DesignVehicle_Sujan(int vehicle_no,String make,String year,String color,String purchaseprice,String enginesize){
        this.vehicle_no=vehicle_no;
        this.make=make;
        this.year=year;
        this.color=color;
        this.purchaseprice=purchaseprice;
        this.enginesize=enginesize;
    }

    public String Design(){
       String description;
       description=("The is Vehicle No. "+vehicle_no+"\n"+
               "Manufacturer: "+make+"\n"+ "Current Value: "+"Rs. "+purchaseprice+"\n"+
               "Year: "+year +
               ", Color:"+color+"\n"+
               " Effective engine Size: " +enginesize+" litre\n\n");
       return description;
    }
}
