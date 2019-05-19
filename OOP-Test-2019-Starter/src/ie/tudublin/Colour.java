package ie.tudublin;

import javafx.scene.control.TableRow;

public class Colour
{
    public float r;
    public float g;
    public float b;
    public float value;
    private String colour;

    /**
     * @return the r
     */
    public float getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(float r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public float getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(float g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString()
    {
        return colour +  "\t" + r + "\t" + g + "\t" + b + "\t" + value;
    }

    public Colour(processing.data.TableRow row)
    {
        colour = row.getString("colour");
        r = row.getFloat("r");
        g = row.getFloat("g");
        b = row.getFloat("b");
        value = row.getFloat("value");
    }

    public Colour()
    {
        
    }




}