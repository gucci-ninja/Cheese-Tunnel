//Name: Suhavi Sandhu
//Date: Monday, June 10, 2013
//Purpose: Like the Neopets game Meepits, the player puts together a tunnel with pipes. In this version, the tunnel accomodates a mouse.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.applet.*;
import javax.swing.*;

public class cheesetunnel2 extends Applet implements MouseListener
{
    int screen; //Global variable to hold what screen is to be displayed
    String imgname[] = {"line1.jpg", "line2.jpg", "bend1.jpg", "bend2.jpg", "bend3.jpg", "bend4.jpg", "three1.jpg", "three2.jpg", "three3.jpg", "three4.jpg", "all.jpg"}; //pipe images. "Dreamstime," http://thumbs.dreamstime.com/ (accessed May 26, 2013).
    // arrays with 'cur' are the current array consisting of randomly chosen numbers that indicate the initial position of every pipe.
    int cur1[] = { (2 + (int) (Math.random () * ((5 - 2) + 1))), (2 + (int) (Math.random () * ((5 - 2) + 1))), (int) (Math.random () * 2), (2 + (int) (Math.random () * ((5 - 2) + 1))), (2 + (int) (Math.random () * ((5 - 2) + 1))), 10, (2 + (int) (Math.random () * ((5 - 2) + 1))), (6 + (int) (Math.random () * ((3) + 1))), (6 + (int) (Math.random () * ((3) + 1))), ((int) (Math.random () * 2)), (2 + (int) (Math.random () * ((5 - 2) + 1))), (2 + (int) (Math.random () * ((5 - 2) + 1))) };
    int cur3[] = { (int) (Math.random () * 2), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 6 + (int) (Math.random () * ((3) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 6 + (int) (Math.random () * ((3) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 10, 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), 6 + (int) (Math.random () * ((3) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), (int) (Math.random () * 2), 6 + (int) (Math.random () * ((3) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), 10, (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), (int) (Math.random () * 2), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), 6 + (int) (Math.random () * ((3) + 1)), (int) (Math.random () * 2), 10, 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 10, 2 + (int) (Math.random () * ((5 - 2) + 1)), 6 + (int) (Math.random () * ((3) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2) };
    int cur2[] = {2 + (int) (Math.random () * ((5 - 2) + 1)), 6 + (int) (Math.random () * ((3) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), 10, (int) (Math.random () * 2), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 6 + (int) (Math.random () * ((3) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), (int) (Math.random () * 2), 6 + (int) (Math.random () * ((3) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 10};
    int ex = 0; //determines space between number of turns when printed out. Allows vertical printing when added to y value.
    int ex1 = 0; // int ex
    int ex2 = 0; //int ex
    Image TitleScreen, Instructions, Level1, Level2, Level3, TryAgain, Winner; //Number Images for Display and screens
    Image img[];
    int score; // number of turns
    int susie = 0; //score
    int score2 = 0; //score

    public void init ()

    {
	int cur1[] = { (2 + (int) (Math.random () * ((5 - 2) + 1))), (2 + (int) (Math.random () * ((5 - 2) + 1))), (int) (Math.random () * 2), (2 + (int) (Math.random () * ((5 - 2) + 1))), (2 + (int) (Math.random () * ((5 - 2) + 1))), 10, (2 + (int) (Math.random () * ((5 - 2) + 1))), (6 + (int) (Math.random () * ((3) + 1))), (6 + (int) (Math.random () * ((3) + 1))), ((int) (Math.random () * 2)), (2 + (int) (Math.random () * ((5 - 2) + 1))), (2 + (int) (Math.random () * ((5 - 2) + 1))) };
	int cur3[] = { (int) (Math.random () * 2), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 6 + (int) (Math.random () * ((3) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 6 + (int) (Math.random () * ((3) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 10, 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), 6 + (int) (Math.random () * ((3) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), (int) (Math.random () * 2), 6 + (int) (Math.random () * ((3) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), 10, (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), (int) (Math.random () * 2), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), 6 + (int) (Math.random () * ((3) + 1)), (int) (Math.random () * 2), 10, 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 10, 2 + (int) (Math.random () * ((5 - 2) + 1)), 6 + (int) (Math.random () * ((3) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2) };
	int cur2[] = {2 + (int) (Math.random () * ((5 - 2) + 1)), 6 + (int) (Math.random () * ((3) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), 10, (int) (Math.random () * 2), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 6 + (int) (Math.random () * ((3) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), (int) (Math.random () * 2), 6 + (int) (Math.random () * ((3) + 1)), (int) (Math.random () * 2), 2 + (int) (Math.random () * ((5 - 2) + 1)), (int) (Math.random () * 2), 10};

	setBackground (new Color (154, 90, 75));
	resize (800, 640);
	screen = 0; //start on screen 0, the Title Screen
	addMouseListener (this);
	Graphics g = getGraphics ();
	TitleScreen = getImage (getDocumentBase (), "menu.jpg");
	g.drawImage (TitleScreen, -100, -100, this);
	Instructions = getImage (getDocumentBase (), "howtoplay.jpg");
	g.drawImage (Instructions, -100, -100, this);
	Level2 = getImage (getDocumentBase (), "level2.jpg");
	g.drawImage (Level2, -100, -100, this);
	Level3 = getImage (getDocumentBase (), "level3.jpg");
	g.drawImage (Level3, -100, -100, this);
	Level1 = getImage (getDocumentBase (), "level.jpg");
	g.drawImage (Level1, -100, -100, this);
	TryAgain = getImage (getDocumentBase (), "tryagain.gif");
	g.drawImage (TryAgain, -100, -100, this);
	Winner = getImage (getDocumentBase (), "final.gif");
	g.drawImage (Winner, -100, -100, this);
	img = new Image [imgname.length];
	for (int i = 0 ; i < imgname.length ; i++) //displays pipe images
	{
	    img [i] = getImage (getDocumentBase (), imgname [i]);
	    g.drawImage (img [i], -100, -100, this);
	}
    }


    public void mouseClicked (MouseEvent e)
    {
	int x = e.getX ();
	int y = e.getY ();
	if (screen == 2)
	{
	    //condition for winning in level 1
	    if (x > 20 && x < 145 && y > 439 && y < 481 && cur1 [0] == 2 && cur1 [1] == 4 && cur1 [4] == 3 && cur1 [6] == 3 && (cur1 [7] == 8 || cur1 [7] == 7) && (cur1 [8] == 9 || cur1 [8] == 6) && cur1 [9] == 1 && cur1 [10] == 5 && cur1 [11] == 2)
	    {
		screen = 3;
		ex = 0;
		score = 0;

	    }

	}

	if (screen == 3)
	{ //condition for winning in level 2
	    if (x > 20 && x < 145 && y > 439 && y < 481 && cur2 [0] == 2 && (cur2 [1] == 7 || cur2 [1] == 9) && cur2 [2] == 1 && cur2 [3] == 4 && cur2 [9] == 2 && cur2 [10] == 1 && (cur2 [11] == 8 || cur2 [11] == 7) && cur2 [17] == 0)
		screen = 4;
	    score = 0;
	    ex = 0;
	}

	if (screen == 4)
	{
	    //condition for winning in level 3
	    if (x > 20 && x < 145 && y > 439 && y < 481 && cur3 [0] == 0 && (cur3 [8] == 6 || cur3 [8] == 8) && cur3 [16] == 2 && cur3 [17] == 4 && cur3 [25] == 2 && cur3 [27] == 1 && cur3 [28] == 4 && (cur3 [36] == 9 || cur3 [36] == 6) && cur3 [37] == 1 && cur3 [39] == 4 && cur3 [47] == 2)
	    {
		screen = 6;
		ex = 0;
		score = 0;

	    }
	}
    }


    public void mouseEntered (MouseEvent e)
    {
    }


    public void mouseExited (MouseEvent e)
    {
    }


    public void mouseReleased (MouseEvent e)
    {
    }


    public void mousePressed (MouseEvent e)
    {
	//get the x and y co-ordinates of the mouse
	int x = e.getX ();
	int y = e.getY ();

	//TITLE SCREEN

	if (screen == 0)
	{
	    if (x > 299 && x < 468 && y > 478 && y < 532) //Instructions
		screen = 1;

	    else if (x > 606 && x < 772 && y > 478 && y < 532) //Game
		screen = 2;

	}
	//INSTRUCTIONS SCREEN
	else if (screen == 1)
	{
	    if (x > 702 && x < 865 && y > 552 && y < 612) //Instructions
		screen = 0;
	}
	//LEVEL 1 SCREEN
	else if (screen == 2)
	{
	    if (x > 27 && x < 145 && y > 553 && y < 594)  //Instructions
		screen = 5;
	    else
		showStatus ("Don't click there!");
	    { // i * 78 + 250, j * 78 + 150
		if (x > 250 && x < 562 && y > 150 && y < 384)
		{
		    int i = (x - 250) / 78; //each pipe image is 78*78px. i and j determine where on the screen the player clicks and what to do in response
		    int j = (y - 150) / 78;
		    int pos = (j * 4) + i;
		    showStatus (j + " " + i + " | " + pos + " | " + cur1 [pos]);
		    //switches line positions
		    if (cur1 [pos] == 0)
			cur1 [pos] = 1;
		    else if (cur1 [pos] == 1)
			cur1 [pos] = 0;
		    //switches bendy pipe positions
		    if (cur1 [pos] == 2)
			cur1 [pos] = 3;
		    else if (cur1 [pos] == 3)
			cur1 [pos] = 4;
		    else if (cur1 [pos] == 4)
			cur1 [pos] = 5;
		    else if (cur1 [pos] == 5)
			cur1 [pos] = 2;
		    // switches positions for pipe with 3 mouths
		    if (cur1 [pos] == 6)
			cur1 [pos] = 7;
		    else if (cur1 [pos] == 7)
			cur1 [pos] = 8;
		    else if (cur1 [pos] == 8)
			cur1 [pos] = 9;
		    else if (cur1 [pos] == 9)
			cur1 [pos] = 6;

		    if (cur1 [pos] >= 0 && cur1 [pos] <= 10) //every time player makes a move
		    {
			score += 1;
			ex += 15;
			if (score > 25)
			    screen = 5;
		    }
		}
	    }
	    repaint ();
	}
	else if (screen == 3)
	{
	    if (x > 27 && x < 145 && y > 553 && y < 594)  //Instructions
		screen = 5;
	    else
		showStatus ("Don't click there!");
	    { // i * 78 + 250, j * 78 + 150
		if (x > 250 && x < 718 && y > 150 && y < 462)
		{
		    int i = (x - 250) / 78;
		    int j = (y - 150) / 78;
		    int pos = (j * 6) + i;
		    showStatus (j + " " + i + " | " + pos + " | " + cur2 [pos]);
		    //line
		    if (cur2 [pos] == 0)
			cur2 [pos] = 1;
		    else if (cur2 [pos] == 1)
			cur2 [pos] = 0;
		    //
		    if (cur2 [pos] == 2)
			cur2 [pos] = 3;
		    else if (cur2 [pos] == 3)
			cur2 [pos] = 4;
		    else if (cur2 [pos] == 4)
			cur2 [pos] = 5;
		    else if (cur2 [pos] == 5)
			cur2 [pos] = 2;

		    if (cur2 [pos] == 6)
			cur2 [pos] = 7;
		    else if (cur2 [pos] == 7)
			cur2 [pos] = 8;
		    else if (cur2 [pos] == 8)
			cur2 [pos] = 9;
		    else if (cur2 [pos] == 9)
			cur2 [pos] = 6;


		    if (cur2 [pos] >= 0 && cur2 [pos] <= 10)
		    {

			susie += 1;
			ex1 += 15;

			if (susie > 30)
			    screen = 5;
		    }
		}
		repaint ();
	    }

	}
	else if (screen == 4)
	{
	    if (x > 27 && x < 145 && y > 553 && y < 594)  //Instructions
		screen = 5;
	    else
		showStatus ("Don't click there!");
	    { // i * 78 + 250, j * 78 + 150
		if (x > 250 && x < 874 && y > 150 && y < 618)
		{
		    int i = (x - 250) / 78;
		    int j = (y - 150) / 78;
		    int pos = (j * 8) + i;
		    showStatus (j + " " + i + " | " + pos + " | " + cur3 [pos]);
		    //line
		    if (cur3 [pos] == 0)
			cur3 [pos] = 1;
		    else if (cur3 [pos] == 1)
			cur3 [pos] = 0;
		    //
		    if (cur3 [pos] == 2)
			cur3 [pos] = 3;
		    else if (cur3 [pos] == 3)
			cur3 [pos] = 4;
		    else if (cur3 [pos] == 4)
			cur3 [pos] = 5;
		    else if (cur3 [pos] == 5)
			cur3 [pos] = 2;

		    if (cur3 [pos] == 6)
			cur3 [pos] = 7;
		    else if (cur3 [pos] == 7)
			cur3 [pos] = 8;
		    else if (cur3 [pos] == 8)
			cur3 [pos] = 9;
		    else if (cur3 [pos] == 9)
			cur3 [pos] = 6;

		    if (cur3 [pos] >= 0 && cur3 [pos] <= 10)
		    {
			score2 += 1;
			ex2 += 15;
			if (score2 > 35)
			    screen = 5;
		    }
		}
	    }
	}
	repaint ();
	if (screen == 5)
	{
	    if (x > 517 && x < 701 && y > 141 && y < 199)
	    {
		screen = 0;
		randomize();
		
	    }
	}
	if (screen == 6)
	{
	    if (x > 567 && x < 810 && y > 291 && y < 345)
	    {
		screen = 0;
		randomize();

	    }
	}
    }


    public void update (Graphics g)
    { //Overide the regular update method so it doesn't clear the screen before it draws (Gets rid of annoying white flicker)
	paint (g);
    }


    public void paint (Graphics g)
    {

	if (screen == 0) //Menu
	    g.drawImage (TitleScreen, 0, 0, this);
	else if (screen == 1) //Instructions
	    g.drawImage (Instructions, 0, 0, this);

	else if (screen == 2) //Level 1
	{

	    g.drawString (" " + score, 800, 100 + ex);
	    g.drawImage (Level1, 0, 0, this);
	    int move = 0; //fills the grid for level with pipe images
	    for (int i = 0 ; i < 3 ; i++) //
	    {
		for (int j = 0 ; j < 4 ; j++)
		{
		    g.drawImage (img [cur1 [move]], j * 78 + 250, i * 78 + 150, this); //draw level 1 pipes
		    move++;
		}
	    }
	}

	else if (screen == 3) //Level 1
	{
	    g.drawString (" " + susie, 950, 100 + ex1);
	    g.drawImage (Level2, 0, 0, this);
	    int move = 0;
	    for (int i = 0 ; i < 4 ; i++)
	    {
		for (int j = 0 ; j < 6 ; j++)
		{
		    g.drawImage (img [cur2 [move]], j * 78 + 250, i * 78 + 150, this); //draw level 2 pipes
		    move++;
		}
	    }
	}

	else if (screen == 4)
	{
	    g.drawString (" " + score2, 1000, 100 + ex2);
	    g.drawImage (Level3, 0, 0, this);
	    int move = 0;
	    for (int i = 0 ; i < 6 ; i++)
	    {
		for (int j = 0 ; j < 8 ; j++)
		{
		    g.drawImage (img [cur3 [move]], j * 78 + 250, i * 78 + 150, this); //draw level 3 pipes
		    move++;
		}
	    }
	}


	else if (screen == 5)
	    g.drawImage (TryAgain, 0, 0, this); //if player fails
	else if (screen == 6)
	    g.drawImage (Winner, 0, 0, this);



    }

    public void randomize()
    {
    for (int i = 0 ; i < cur1.length ; i++)
		{
		    if (cur1 [i] <= 1)
			cur1 [i] = (int) (Math.random () * 2);
		    else if (cur1 [i] <= 5)
			cur1 [i] = 2 + (int) (Math.random () * ((5 - 2) + 1));
		    else if (cur1 [i] <= 9)
			cur1 [i] = 6 + (int) (Math.random () * ((3) + 1));


		}
		 for (int i = 0 ; i < cur2.length ; i++)
		{
		    if (cur2 [i] <= 1)
			cur2 [i] = (int) (Math.random () * 2);
		    else if (cur2 [i] <= 5)
			cur2 [i] = 2 + (int) (Math.random () * ((5 - 2) + 1));
		    else if (cur2 [i] <= 9)
			cur2 [i] = 6 + (int) (Math.random () * ((3) + 1));


		}
		 for (int i = 0 ; i < cur3.length ; i++)
		{
		    if (cur3 [i] <= 1)
			cur3 [i] = (int) (Math.random () * 2);
		    else if (cur3 [i] <= 5)
			cur3 [i] = 2 + (int) (Math.random () * ((5 - 2) + 1));
		    else if (cur3 [i] <= 9)
			cur3 [i] = 6 + (int) (Math.random () * ((3) + 1));


		}
}


}



