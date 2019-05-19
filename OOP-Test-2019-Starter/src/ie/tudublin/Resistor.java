package ie.tudublin;

import processing.data.TableRow;

public class Resistor
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;
    UI ui;


    public  Resistor(int value)
    {
        int hundreds = (value / 100);
        int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100)  + (tens * 10));
        System.out.println(hundreds + ",");
        System.out.println(tens + ",");
        System.out.println(ones);
    }


    public Resistor()
    {
        
    }


    public Resistor(TableRow row) {
    }
    

    // public void render()
    // {
    //     ui.line(0,400,500,0);
    // }


	/**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the ones
     */
    public int getOnes() {
        return ones;
    }

    /**
     * @param ones the ones to set
     */
    public void setOnes(int ones) {
        this.ones = ones;
    }

    /**
     * @return the tens
     */
    public int getTens() {
        return tens;
    }

    /**
     * @param tens the tens to set
     */
    public void setTens(int tens) {
        this.tens = tens;
    }

    /**
     * @return the hundreds
     */
    public int getHundreds() {
        return hundreds;
    }

    /**
     * @param hundreds the hundreds to set
     */
    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }
}