package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{
	Resistor res;
	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}



	public void printColours()
	{
		for(Colour colour : colours)
		{
			System.out.println(colour);
		}
	}

	public void setup() 
	{		loadColours();
			printColours(); 
			
	}


	public void loadColours()
	{
		Table table = loadTable("colours.csv", "header");

		for (TableRow row : table.rows()) {
            Colour colour = new Colour(row);
            colours.add(colour);
        }
	}

	public void loadResistors()
	{
		Table table = loadTable("resistors.csv", "header");

		for (TableRow row : table.rows()) {
            Resistor resistor = new Resistor(row);
            resistors.add(resistor);
        }
	}

	public Colour findColour(int value)
	{
		for(Colour colour : colours)
		{
			if (value == colour.value)
			{
				return colour;
			} 
		}
		return null;
	}
	
	public void draw()
	{		
		float left = width/4;
		fill(255);
	
		float line = 50;
		float gap = 50;
		float recH = 100;
		float recW = 100;
		float right = left+line+recW;
		float cGap = 10;

		strokeWeight(3);
		line(left, gap+recH/2, left +line ,gap+recH/2 );
		rect(left + line, gap, recW, recH);
		fill(0,0,255);
		noStroke();
		rect(left + line+10, gap, 10, recH);
		fill(255,10,10);
		rect(left + line+10+20, gap, 10, recH);
		fill(100);
		rect(left + line+10+20+20, gap, 10, recH);

		fill(255);
		stroke(0);
		line(left+line+recW, gap+recH/2,left+line+recW+line , gap+recH/2);
		textSize(32);
		fill(0);
		text("618", width-(width/4),  gap+recH/2);
		fill(255);

		//second

		float gap2 = gap + recH + gap;

		strokeWeight(3);
		line(left, gap+recH/2+gap2, left +line ,gap+recH/2 +gap2);
		rect(left + line, gap+gap2, recW, recH);
		fill(0);
		noStroke();
		rect(left + line+10, gap+gap2, 10, recH);
		fill(255,0,0);
		rect(left + line+10+20, gap+gap2, 10, recH);
		fill(128,0,128);
		rect(left + line+10+20+20, gap+gap2, 10, recH);

		fill(255);
		stroke(0);
		line(left+line+recW, gap+recH/2+gap2,left+line+recW+line , gap+recH/2+gap2);
		textSize(32);
		fill(0);
		text("27", width-(width/4),  gap+recH/2+gap2);
		fill(255);

		//third
		 float gap3 = gap2 + gap2;

		 strokeWeight(3);
		 line(left, gap+recH/2+gap3, left +line ,gap+recH/2 +gap3);
		 rect(left + line, gap+gap3, recW, recH);
		 fill(165,42,42);
		 noStroke();
		 rect(left + line+10, gap+gap3, 10, recH);
		 fill(255);
		 rect(left + line+10+20, gap+gap3, 10, recH);
		 fill(0,255,0);
		 rect(left + line+10+20+20, gap+gap3, 10, recH);
 
		 fill(255);
		 stroke(0);
		 line(left+line+recW, gap+recH/2+gap3,left+line+recW+line , gap+recH/2+gap3);
		 textSize(32);
		 fill(0);
		 text("195", width-(width/4),  gap+recH/2+gap3);
		 fill(255);

		 //fourth

		 float gap4 = gap2 + gap3;

		 strokeWeight(3);
		 line(left, gap+recH/2+gap4, left +line ,gap+recH/2 +gap4);
		 rect(left + line, gap+gap4, recW, recH);
		 fill(0);
		 noStroke();
		 rect(left + line+10, gap+gap4, 10, recH);
		 fill(255);
		 rect(left + line+10+20, gap+gap4, 10, recH);
		 fill(255,165,0);
		 rect(left + line+10+20+20, gap+gap4, 10, recH);
 
		 fill(255);
		 stroke(0);
		 line(left+line+recW, gap+recH/2+gap4,left+line+recW+line , gap+recH/2+gap4);
		 textSize(32);
		 fill(0);
		 text("93", width-(width/4),  gap+recH/2+gap4);
		 fill(255);



	}

	private ArrayList<Colour> colours = new ArrayList<Colour>();
	private ArrayList<Resistor> resistors = new ArrayList<Resistor>();

}
