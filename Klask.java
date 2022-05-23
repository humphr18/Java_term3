public class Klask{
	// Generate the game arena
	private GameArena game1 = new GameArena(800,500);
	// Line borders for the Klask game
	private Line left_line = new Line(100.0,100.0,100.0,400.0,15.0,"GREY",4);
	private Line bottom_line = new Line(100.0,400.0,700.0,400.0,15.0,"GREY",4);
	private Line right_line = new Line(700.0,400.0,700.0,100.0,15.0,"GREY",4);
	private Line top_line = new Line(700.0,100.0,100.0,100.0,15.0,"GREY",4);
	// Main game ball
	private Ball the_ball = new Ball(400.0,300.0,10,"YELLOW",6);
	// Generating the pucks right puck --v
	private Ball right_puckball = new Ball(550.0,250.0,20,"BLACK",2);
	private Line right_puckline = new Line(550.0,250.0,550.0,230.0,10,"BLACK",2);
	// Left puck --v
	private Ball left_puckball = new Ball(250.0,250.0,20,"BLACK",2);
	private Line left_puckline = new Line(250.0,250.0,250.0,230.0,10,"BLACK",2);
	// Making the quatercircles
	private Ball topleft_ball = new Ball(100.0,100.0,100,"GREY",2);
	private Ball bottomleft_ball = new Ball(100.0,400.0,100,"GREY",2);
	private Ball topright_ball = new Ball(700.0,100.0,100,"GREY",2);
	private Ball bottomright_ball = new Ball(700.0,400.0,100,"GREY",2);
	// Creating the filling for the quatercircles
	private Ball topleft_gap = new Ball(100.0,100.0,90,"BLUE",3);
	private Ball bottomleft_gap = new Ball(100.0,400.0,90,"BLUE",3);
	private Ball topright_gap = new Ball(700.0,100.0,90,"BLUE",3);
	private Ball bottomright_gap = new Ball(700.0,400.0,90,"BLUE",3);
	// Blue game background
	private Rectangle background = new Rectangle(100.0,100.0,600.0,300.0,"BLUE",1);
	// Creating the black borders to cover the corner circles
	private Line border1 = new Line(0.0,0.0,0.0,500.0,190,"BLACK",5);
	private Line border2 = new Line(0.0,500.0,800.0,500.0,190,"BLACK",5);
	private Line border3 = new Line(800.0,500.0,800.0,0.0,190,"BLACK",5);
	private Line border4 = new Line(800.0,0.0,0.0,0.0,190,"BLACK",5);
	// Creating the goals
	private Ball left_goal = new Ball(150.0,250.0,50,"GREY",2);
	private Ball right_goal = new Ball(650.0,250.0,50,"GREY",2);
	// Middle line through the game
	private Line middle_line = new Line(400.0,0.0,400.0,500.0,0.5,"BLACK",2);
	// Creating the middle magnets
	private Ball top_magnet = new Ball(400.0,175.0,10,"WHITE",3);
	private Ball middle_magnet = new Ball(400.0,250.0,10,"WHITE",3);
	private Ball bottom_magnet = new Ball(400.0,325.0,10,"WHITE",3);
	// The scorecounts 
	private int left_scorecount = 0;
	private int right_scorecount = 0;
	private String leftscore_string = Integer.toString(left_scorecount);
	private String rightscore_string = Integer.toString(right_scorecount);
	// Creating the scores
	private Text left_score = new Text(leftscore_string,30,50.0,250.0,"WHITE",6);
	private Text right_score = new Text(rightscore_string,30,750.0,250.0,"WHITE",6);
	// Creating the top text
	private Text top_text = new Text("Welcome to Klask!!",20,100.0,50.0,"WHITE",6);
	//loop to refresh the game
	private boolean game_loop = true;
	//the directions of the ball
	private double ballmove_x = 0.0;
	private double ballmove_y = 0.0;
	// The outer suction for the white magnets
	private Ball left_outer = new Ball(250.0,250.0,100,"BLUE",0);
	private Ball right_outer = new Ball(550.0,250.0,100,"BLUE",0);

	//the right puck coordinates
	private double right_x;
	private double right_y;

	//the left puck coordinates
	private double left_x;
	private double left_y;

	//top magnet move variables 
	private double top_x ;
	private double top_y ;
	private double middle_x ;
	private double middle_y;
	private double bottom_x;
	private double bottom_y ;

	private boolean play_loop = true;

	//connections
	private boolean top_connect = false;
	private boolean middle_connect =false;
	private boolean bottom_connect = false;
	// Checks if the game piece cant go any further
	private boolean left_stopcheck1 = true;
	private boolean right_stopcheck1 = true;
	private boolean left_stopcheck2 = true;
	private boolean right_stopcheck2 = true;
	private boolean left_stopcheck3 = true;
	private boolean right_stopcheck3 = true;
	private boolean left_stopcheck4 = true;
	private boolean right_stopcheck4 = true;

	//ball for the the main ball to collide with
	private Ball collide_ball = new Ball(0.0,0.0,20,"BLACK",0);
	private boolean top_check = false;
	private boolean middle_check = false;
	private boolean bottom_check = false;

	private int right_magcount = 0;
	private int left_magcount = 0;





/* UI instance variable list:
	game1 = the game arena
	left_line --> top_line = the borders
	the_ball = the main game ball
	left_puckball/left_puckline = creating the puck (replace with right)
	topleft_gap etc. = creating the quater circles in the corners 
	topleft_gap etc. = creatinf the insided of the corners 
	background = the blue background
	border1/2/3/4 = the black border (covers the corner circles)
	left_goal/right_goal = player goals
	middle_line = middle line through the game
	top_megnet/middle/bottom = the magnets
	left/right_score = the scores
	top_text = text above the game board
	game_loopp = boolean, loop through the game
	ballmove_x/y = movment variable of the ball in double!
*/


	public Klask(){
		// Adding the UI instance variables to the gameboard
		game1.addBall(the_ball);
		game1.addLine(left_line);
		game1.addLine(bottom_line);
		game1.addLine(right_line);
		game1.addLine(top_line);
		game1.addBall(left_puckball);
		//game1.addLine(left_puckline);
		game1.addBall(right_puckball);
		//game1.addLine(right_puckline);
		game1.addRectangle(background);
		game1.addBall(topleft_ball);
		game1.addBall(bottomleft_ball);
		game1.addBall(topright_ball);
		game1.addBall(bottomright_ball);
		game1.addBall(topleft_gap);
		game1.addBall(bottomleft_gap);
		game1.addBall(topright_gap);
		game1.addBall(bottomright_gap);
		game1.addLine(border1);
		game1.addLine(border2);
		game1.addLine(border3);
		game1.addLine(border4);
		game1.addBall(left_goal);
		game1.addBall(right_goal);
		game1.addLine(middle_line);
		game1.addBall(top_magnet);
		game1.addBall(middle_magnet);
		game1.addBall(bottom_magnet);
		game1.addText(left_score);
		game1.addText(right_score);
		game1.addText(top_text);
		game1.addBall(right_outer);
		game1.addBall(left_outer);
		// end of the UI additions -----------------------
		while(play_loop == true){
		while(game_loop == true){


			if(left_puckball.getXPosition() == 390.0){
				left_stopcheck3 = false;
			}
			if(right_puckball.getXPosition() == 410.0){
				right_stopcheck1 = false;
			}
			if(left_puckball.getXPosition() == 110.0){
				left_stopcheck1 = false;
			}
			if(right_puckball.getXPosition() == 690.0){
				right_stopcheck3 = false;
			}
			if(left_puckball.getYPosition() == 110.0){
				left_stopcheck2 = false;
			}
			if(right_puckball.getYPosition() == 110.0){
				right_stopcheck2 = false;
			}
			if(left_puckball.getYPosition() == 390.0){
				left_stopcheck4 = false;
			}
			if(right_puckball.getYPosition() == 390.0){
				right_stopcheck4 = false;
			}

			if(the_ball.collides(left_puckball)){

				if(the_ball.getXPosition() < (left_puckball.getXPosition() +5) && the_ball.getXPosition() > (left_puckball.getXPosition() - 5) && (the_ball.getYPosition() < (left_puckball.getYPosition()))){
					ballmove_x = 0.0;
					ballmove_y = -3.0;
				}
				else if(the_ball.getXPosition() < (left_puckball.getXPosition() +5) && the_ball.getXPosition() > (left_puckball.getXPosition() - 5) && (the_ball.getYPosition() > (left_puckball.getYPosition()))){
					ballmove_x = 0.0;
					ballmove_y = 3.0;
				}
				
				else if(the_ball.getXPosition() > (left_puckball.getXPosition() +5) && the_ball.getYPosition() < left_puckball.getYPosition()){
					ballmove_x = 3.0;
					ballmove_y = -3.0;
				}
				else if(the_ball.getXPosition() < (left_puckball.getXPosition() -5) && the_ball.getYPosition() < left_puckball.getYPosition() ){
					ballmove_x = -3;
					ballmove_y = -3;
				}
				else if(the_ball.getXPosition() < (left_puckball.getXPosition() - 5) && the_ball.getYPosition() > left_puckball.getYPosition() && the_ball.getXPosition() > (left_puckball.getXPosition() - 15)){
					ballmove_x = -3;
					ballmove_y = 3;
				}
				else if(the_ball.getXPosition() > (left_puckball.getXPosition() +5) && the_ball.getYPosition() > left_puckball.getYPosition() && the_ball.getXPosition() < (left_puckball.getXPosition() +15)){
					ballmove_x = 3;
					ballmove_y = 3;
				}
				else if(the_ball.getYPosition() <(left_puckball.getYPosition() +5) && the_ball.getYPosition() > (left_puckball.getYPosition() - 5) && the_ball.getXPosition() > (left_puckball.getXPosition())){
					ballmove_x = 3.0;
					ballmove_y = 0.0;
				}
				else if(the_ball.getYPosition() <(left_puckball.getYPosition() +5) && the_ball.getYPosition() > (left_puckball.getYPosition() - 5) && the_ball.getXPosition() < (left_puckball.getXPosition())){
					ballmove_x = -3.0;
					ballmove_y = 0.0;
				}
			}
			if(the_ball.collides(right_puckball)){

				if(the_ball.getXPosition() < (right_puckball.getXPosition() +5) && the_ball.getXPosition() > (right_puckball.getXPosition() - 5) && (the_ball.getYPosition() < (right_puckball.getYPosition()))){
					ballmove_x = 0.0;
					ballmove_y = -3.0;
				}
				else if(the_ball.getXPosition() < (right_puckball.getXPosition() +5) && the_ball.getXPosition() > (right_puckball.getXPosition() - 5) && (the_ball.getYPosition() > (right_puckball.getYPosition()))){
					ballmove_x = 0.0;
					ballmove_y = 3.0;
				}
				
				else if(the_ball.getXPosition() > (right_puckball.getXPosition() +5) && the_ball.getYPosition() < right_puckball.getYPosition()){
					ballmove_x = 3.0;
					ballmove_y = -3.0;
				}
				else if(the_ball.getXPosition() < (right_puckball.getXPosition() -5) && the_ball.getYPosition() < right_puckball.getYPosition() ){
					ballmove_x = -3;
					ballmove_y = -3;
				}
				else if(the_ball.getXPosition() < (right_puckball.getXPosition() - 5) && the_ball.getYPosition() > right_puckball.getYPosition() && the_ball.getXPosition() > (right_puckball.getXPosition() - 15)){
					ballmove_x = -3;
					ballmove_y = 3;
				}
				else if(the_ball.getXPosition() > (right_puckball.getXPosition() +5) && the_ball.getYPosition() > right_puckball.getYPosition() && the_ball.getXPosition() < (right_puckball.getXPosition() +15)){
					ballmove_x = 3;
					ballmove_y = 3;
				}
				else if(the_ball.getYPosition() <(right_puckball.getYPosition() +5) && the_ball.getYPosition() > (right_puckball.getYPosition() - 5) && the_ball.getXPosition() > (right_puckball.getXPosition())){
					ballmove_x = 3.0;
					ballmove_y = 0.0;
				}
				else if(the_ball.getYPosition() <(right_puckball.getYPosition() +5) && the_ball.getYPosition() > (right_puckball.getYPosition() - 5) && the_ball.getXPosition() < (right_puckball.getXPosition())){
					ballmove_x = -3.0;
					ballmove_y = 0.0;
				}
			}


			if(the_ball.getXPosition() >= 690.0 || the_ball.getXPosition() <= 110.0 )
			{
				if(ballmove_y != 0.0){
					ballmove_x = ballmove_x - (ballmove_x * 2);
				}
				else
				{
					ballmove_y = ballmove_y - (ballmove_y * 2);
					ballmove_x = ballmove_x - (ballmove_x * 2);
				}
			}
			if(the_ball.getYPosition() >=390.0 || the_ball.getYPosition() <= 110.0)
			{
				if(ballmove_x != 0.0){
					ballmove_y = ballmove_y - (ballmove_y * 2);
				}
				else
				{
					ballmove_y = ballmove_y - (ballmove_y * 2);
					ballmove_x = ballmove_x - (ballmove_x * 2);
				}
			}
			the_ball.move(ballmove_x,ballmove_y);

			if(left_puckball.collides(left_goal))
			{
				right_scorecount = right_scorecount + 1;
				rightscore_string = Integer.toString(right_scorecount);
				right_score.setText(rightscore_string);
				the_ball.setXPosition(350.0);
				the_ball.setYPosition(250.0);
				ballmove_x = 0.0;
				ballmove_y = 0.0;
				left_puckball.setXPosition(250.0);
				left_puckball.setYPosition(250.0);
				right_puckball.setXPosition(250.0);
				right_puckball.setXPosition(550.0);

			}
			if(right_puckball.collides(right_goal))
			{
				left_scorecount = left_scorecount + 1;
				leftscore_string = Integer.toString(left_scorecount);
				left_score.setText(leftscore_string);
				the_ball.setXPosition(450.0);
				the_ball.setYPosition(250.0);
				ballmove_x = 0.0;
				ballmove_y = 0.0;
				left_puckball.setXPosition(250.0);
				left_puckball.setYPosition(250.0);
				right_puckball.setXPosition(550.0);
				right_puckball.setYPosition(250.0);

			}
			if(top_check == false){
				if(top_magnet.collides(right_outer)|| top_magnet.collides(left_outer)){
					if(top_magnet.collides(right_outer)){
						collide_ball = right_puckball;
					}
					if(top_magnet.collides(left_outer)){
						collide_ball = left_puckball;
					}
					if(top_magnet.getXPosition() < (collide_ball.getXPosition() +5) && top_magnet.getXPosition() > (collide_ball.getXPosition() - 5) && (top_magnet.getYPosition() < (collide_ball.getYPosition()))){
						top_x = 0.0;
						top_y = 1.0;
					}
					else if(top_magnet.getXPosition() < (collide_ball.getXPosition() +5) && top_magnet.getXPosition() > (collide_ball.getXPosition() - 5) && (top_magnet.getYPosition() > (collide_ball.getYPosition()))){
						top_x =0.0;
						top_y =-1.0;
					}
				
					else if(top_magnet.getXPosition() > (collide_ball.getXPosition() +5) && top_magnet.getYPosition() < collide_ball.getYPosition()){
						top_x = -1.0;
						top_y = 1.0;
					}
					else if(top_magnet.getXPosition() < (collide_ball.getXPosition()) && top_magnet.getYPosition() < collide_ball.getYPosition() ){
						top_x = 1;
						top_y = 1;
					}
					else if(top_magnet.getXPosition() < (collide_ball.getXPosition() - 5) && top_magnet.getYPosition() > collide_ball.getYPosition() && top_magnet.getXPosition() > (collide_ball.getXPosition() - 15)){
						top_x = 1;
						top_y = -1.0;
					}
					else if(top_magnet.getXPosition() > (collide_ball.getXPosition() +5) && top_magnet.getYPosition() > collide_ball.getYPosition() && top_magnet.getXPosition() < (collide_ball.getXPosition() +15)){
						top_x = -1.0;
						top_y = -1.0;
					}
					else if(top_magnet.getYPosition() <(collide_ball.getYPosition() +5) && top_magnet.getYPosition() > (collide_ball.getYPosition() - 5) && top_magnet.getXPosition() > (collide_ball.getXPosition())){
						top_x = -1.0;
						top_y = 0.0;
					}
					else if(top_magnet.getYPosition() <(collide_ball.getYPosition() +5) && top_magnet.getYPosition() > (collide_ball.getYPosition() - 5) && top_magnet.getXPosition() < (collide_ball.getXPosition())){
						top_x = 1.0;
						top_y = 0.0;
					}
				}
			}
			if(middle_check == false){
				if(middle_magnet.collides(right_outer) || middle_magnet.collides(left_outer)){
					if(middle_magnet.collides(right_outer)){
						collide_ball = right_puckball;
					}
					if(middle_magnet.collides(left_outer)){
						collide_ball = left_puckball;
					}

					if(middle_magnet.getXPosition() < (collide_ball.getXPosition() +5) && middle_magnet.getXPosition() > (collide_ball.getXPosition() - 5) && (middle_magnet.getYPosition() < (collide_ball.getYPosition()))){
						middle_x = 0.0;
						middle_y = 1.0;
					}
					else if(middle_magnet.getXPosition() < (collide_ball.getXPosition() +5) && middle_magnet.getXPosition() > (collide_ball.getXPosition() - 5) && (middle_magnet.getYPosition() > (collide_ball.getYPosition()))){
						middle_x =0.0;
						middle_y =-1.0;
					}
				
					else if(middle_magnet.getXPosition() > (collide_ball.getXPosition() +5) && middle_magnet.getYPosition() < collide_ball.getYPosition()){
						middle_x = -1.0;
						middle_y = 1.0;
					}
					else if(middle_magnet.getXPosition() < (collide_ball.getXPosition() + 5) && middle_magnet.getYPosition() < collide_ball.getYPosition() ){
						middle_x = 1;
						middle_y = 1;
					}
					else if(middle_magnet.getXPosition() < (collide_ball.getXPosition() - 5) && middle_magnet.getYPosition() > collide_ball.getYPosition() && middle_magnet.getXPosition() > (collide_ball.getXPosition() - 15)){
						middle_x = 1;
						middle_y = -1.0;
					}
					else if(middle_magnet.getXPosition() > (collide_ball.getXPosition() +5) && middle_magnet.getYPosition() > collide_ball.getYPosition() && middle_magnet.getXPosition() < (collide_ball.getXPosition() +15)){
						middle_x = -1.0;
						middle_y = -1.0;
					}
					else if(middle_magnet.getYPosition() <(collide_ball.getYPosition() +5) && middle_magnet.getYPosition() > (collide_ball.getYPosition() - 5) && middle_magnet.getXPosition() > (collide_ball.getXPosition())){
						middle_x = -1.0;
						middle_y = 0.0;
					}
					else if(middle_magnet.getYPosition() <(collide_ball.getYPosition() +5) && middle_magnet.getYPosition() > (collide_ball.getYPosition() - 5) && middle_magnet.getXPosition() < (collide_ball.getXPosition())){
						middle_x = 1.0;
						middle_y = 0.0;
					}
				}
			}
			if(bottom_check == false){
				if(bottom_magnet.collides(right_outer) || bottom_magnet.collides(left_outer)){
					if(bottom_magnet.collides(right_outer)){
						collide_ball = right_puckball;
					}
					if(bottom_magnet.collides(left_outer)){
						collide_ball = left_puckball;
					}


					if(bottom_magnet.getXPosition() < (collide_ball.getXPosition() +5) && bottom_magnet.getXPosition() > (collide_ball.getXPosition() - 5) && (top_magnet.getYPosition() < (collide_ball.getYPosition()))){
						bottom_x = 0.0;
						bottom_y = 1.0;
					}
					else if(bottom_magnet.getXPosition() < (collide_ball.getXPosition() +5) && bottom_magnet.getXPosition() > (collide_ball.getXPosition() - 5) && (bottom_magnet.getYPosition() > (collide_ball.getYPosition()))){
						bottom_x =0.0;
						bottom_y =-1.0;
					}
				
					else if(bottom_magnet.getXPosition() > (collide_ball.getXPosition() +5) && bottom_magnet.getYPosition() < collide_ball.getYPosition()){
						bottom_x = -1.0;
						bottom_y = 1.0;
					}
					else if(bottom_magnet.getXPosition() < (collide_ball.getXPosition()) && bottom_magnet.getYPosition() < collide_ball.getYPosition() ){
						bottom_x = 1;
						bottom_y = 1;
					}
					else if(bottom_magnet.getXPosition() < (collide_ball.getXPosition() - 5) && bottom_magnet.getYPosition() > collide_ball.getYPosition() && bottom_magnet.getXPosition() > (collide_ball.getXPosition() - 15)){
						bottom_x = 1;
						bottom_y = -1.0;
					}
					else if(bottom_magnet.getXPosition() > (collide_ball.getXPosition() +5) && bottom_magnet.getYPosition() > collide_ball.getYPosition() && bottom_magnet.getXPosition() < (collide_ball.getXPosition() +15)){
						bottom_x = -1.0;
						bottom_y = -1.0;
					}
					else if(bottom_magnet.getYPosition() <(collide_ball.getYPosition() +5) && bottom_magnet.getYPosition() > (collide_ball.getYPosition() - 5) && bottom_magnet.getXPosition() > (collide_ball.getXPosition())){
						bottom_x = -1.0;
						bottom_y = 0.0;
					}
					else if(bottom_magnet.getYPosition() <(collide_ball.getYPosition() +5) && bottom_magnet.getYPosition() > (collide_ball.getYPosition() - 5) && bottom_magnet.getXPosition() < (collide_ball.getXPosition())){
						bottom_x = 1.0;
						bottom_y = 0.0;
					}
				}
			}
			top_magnet.move(top_x,top_y);
			middle_magnet.move(middle_x,middle_y);
			bottom_magnet.move(bottom_x, bottom_y);

			if(top_magnet.collides(right_puckball)){
				top_x = 0.0;
				top_y = 0.0;
				top_magnet.setXPosition(right_puckball.getXPosition());
				top_magnet.setYPosition(right_puckball.getYPosition());
				top_check = true;
			}
			if(middle_magnet.collides(right_puckball)){
				middle_x = 0.0;
				middle_y = 0.0;
				middle_magnet.setXPosition(right_puckball.getXPosition());
				middle_magnet.setYPosition(right_puckball.getYPosition());
				middle_check = true;
			}
			if(bottom_magnet.collides(right_puckball)){
				bottom_x = 0.0;
				bottom_y = 0.0;
				bottom_magnet.setXPosition(right_puckball.getXPosition());
				bottom_magnet.setYPosition(right_puckball.getYPosition());
				bottom_check = true;
			}
			if(top_magnet.collides(left_puckball)){
				top_x = 0.0;
				top_y = 0.0;
				top_magnet.setXPosition(left_puckball.getXPosition());
				top_magnet.setYPosition(left_puckball.getYPosition());
				top_check = true;
			}
			if(middle_magnet.collides(left_puckball)){
				middle_x = 0.0;
				middle_y = 0.0;
				middle_magnet.setXPosition(left_puckball.getXPosition());
				middle_magnet.setYPosition(left_puckball.getYPosition());
				middle_check = true;
			}
			if(bottom_magnet.collides(left_puckball)){
				bottom_x = 0.0;
				bottom_y = 0.0;
				bottom_magnet.setXPosition(left_puckball.getXPosition());
				bottom_magnet.setYPosition(left_puckball.getYPosition());
				bottom_check = true;
			}





			if(game1.letterPressed('w') == true)
			{
				if(left_stopcheck2 == true){
					left_puckball.move(0.0,-2.0);
					left_outer.move(0.0,-2.0);
				}
			}
			if(game1.letterPressed('a') == true)
			{
				if(left_stopcheck1 == true)
				{
					left_puckball.move(-2.0,0.0);
					left_outer.move(-2.0,0.0);
				}
			}
			if(game1.letterPressed('d') == true)
			{
				if(left_stopcheck3 == true){
					left_puckball.move(2.0,0.0);
					left_outer.move(2.0,0.0);
				}

			}
			if(game1.letterPressed('s') == true)
			{
				if(left_stopcheck4 == true)
				{
					left_puckball.move(0.0,2.0);
					left_outer.move(0.0,2.0);
				}
			}
			if(game1.rightPressed() == true)
			{
				if(right_stopcheck3 == true){
					right_puckball.move(2.0,0.0);
					right_outer.move(2.0,0.0);
				}
			}
			if(game1.leftPressed() == true)
			{
				if(right_stopcheck1 == true){
					right_puckball.move(-2.0,0.0);
					right_outer.move(-2.0,0.0);
				}	
			}
			if(game1.upPressed() == true)
			{
				if(right_stopcheck2 == true){
					right_puckball.move(0.0,-2.0);
					right_outer.move(0.0,-2.0);
				}
			}
			if(game1.downPressed() == true)
			{
				if(right_stopcheck4 == true){
					right_puckball.move(0.0,2.0);
					right_outer.move(0.0,2.0);
				}
			}

			if((left_puckball.collides(top_magnet) && left_puckball.collides(middle_magnet)) || (left_puckball.collides(top_magnet) && left_puckball.collides(bottom_magnet)) || (left_puckball.collides(middle_magnet) && left_puckball.collides(bottom_magnet))){
				right_scorecount = right_scorecount + 1;
				rightscore_string = Integer.toString(right_scorecount);
				right_score.setText(rightscore_string);
				the_ball.setXPosition(350.0);
				the_ball.setYPosition(250.0);
				ballmove_x = 0.0;
				ballmove_y = 0.0;

				top_x = 0.0; top_y = 0.0; middle_x = 0.0; middle_y = 0.0; bottom_x = 0.0; bottom_y = 0.0;
				top_magnet.setXPosition(400.0);
				top_magnet.setYPosition(175.0);
				middle_magnet.setYPosition(250.0);
				bottom_magnet.setYPosition(325.0);
				middle_magnet.setXPosition(400.0);
				bottom_magnet.setXPosition(400.0);
				bottom_check = false;
			}
			if((right_puckball.collides(top_magnet) && right_puckball.collides(middle_magnet)) || (right_puckball.collides(top_magnet) && right_puckball.collides(bottom_magnet)) || (right_puckball.collides(middle_magnet) && right_puckball.collides(bottom_magnet))){
				left_scorecount = left_scorecount + 1;
				leftscore_string = Integer.toString(left_scorecount);
				left_score.setText(leftscore_string);
				the_ball.setXPosition(350.0);
				the_ball.setYPosition(250.0);
				ballmove_x = 0.0;
				ballmove_y = 0.0;

				top_x = 0.0; top_y = 0.0; middle_x = 0.0; middle_y = 0.0; bottom_x = 0.0; bottom_y = 0.0;
				top_magnet.setXPosition(400.0);
				top_magnet.setYPosition(175.0);
				middle_magnet.setYPosition(250.0);
				bottom_magnet.setYPosition(325.0);
				middle_magnet.setXPosition(400.0);
				bottom_magnet.setXPosition(400.0);
				bottom_check = false;
			}



			top_magnet.move(top_x,top_y);
			if(top_magnet.getXPosition() >= 690.0 || top_magnet.getXPosition() <= 110.0 )
			{
				if(top_x != 0.0){
					top_x = top_x - (top_x * 2);
				}
				else
				{
					top_y = top_y - (top_y * 2);
					top_x = top_x - (top_x * 2);
				}
			}
			if(top_magnet.getYPosition() >=390.0 || top_magnet.getYPosition() <= 110.0)
			{
				if(top_x != 0.0){
					top_y = top_y - (top_y * 2);
				}
				else
				{
					top_y = top_y - (top_y * 2);
					top_x = top_x - (top_x * 2);
				}
			}


			if(middle_magnet.getXPosition() >= 690.0 || middle_magnet.getXPosition() <= 110.0 )
			{
				if(middle_x != 0.0){
					middle_x = middle_x - (middle_x * 2);
				}
				else
				{
					middle_y = middle_y - (middle_y * 2);
					middle_x = middle_x - (middle_x * 2);
				}
			}
			if(middle_magnet.getYPosition() >=390.0 || middle_magnet.getYPosition() <= 110.0)
			{
				if(middle_x != 0.0){
					middle_y = middle_y - (middle_y * 2);
				}
				else
				{
					middle_y = middle_y - (middle_y * 2);
					middle_x = middle_x - (middle_x * 2);
				}
			}


			if(bottom_magnet.getXPosition() >= 690.0 || bottom_magnet.getXPosition() <= 110.0 )
			{
				if(bottom_x != 0.0){
					bottom_x = bottom_x - (bottom_x * 2);
				}
				else
				{
					bottom_y = bottom_y - (bottom_y * 2);
					bottom_x = bottom_x - (bottom_x * 2);
				}
			}
			if(bottom_magnet.getYPosition() >=390.0 || bottom_magnet.getYPosition() <= 110.0)
			{
				if(bottom_x != 0.0){
					bottom_y = bottom_y - (bottom_y * 2);
				}
				else
				{
					bottom_y = bottom_y - (bottom_y * 2);
					bottom_x = bottom_x - (bottom_x * 2);
				}
			}



			if (the_ball.collides(left_goal) == true )
			{
				right_scorecount = right_scorecount + 1;
				rightscore_string = Integer.toString(right_scorecount);
				right_score.setText(rightscore_string);
				the_ball.setXPosition(350.0);
				the_ball.setYPosition(250.0);
				ballmove_x = 0.0;
				ballmove_y = 0.0;

				top_x = 0.0; top_y = 0.0; middle_x = 0.0; middle_y = 0.0; bottom_x = 0.0; bottom_y = 0.0;
				top_magnet.setXPosition(400.0);
				top_magnet.setYPosition(175.0);
				middle_magnet.setYPosition(250.0);
				bottom_magnet.setYPosition(325.0);
				middle_magnet.setXPosition(400.0);
				bottom_magnet.setXPosition(400.0);
			}

			if (the_ball.collides(right_goal) == true)
			{
				left_scorecount = left_scorecount + 1;
				leftscore_string = Integer.toString(left_scorecount);
				left_score.setText(leftscore_string);
				the_ball.setXPosition(450.0);
				the_ball.setYPosition(250.0);
				ballmove_x = 0.0;
				ballmove_y = 0.0;

				top_x = 0.0; top_y = 0.0; middle_x = 0.0; middle_y = 0.0; bottom_x = 0.0; bottom_y = 0.0;
				top_magnet.setXPosition(400.0);
				top_magnet.setYPosition(175.0);
				middle_magnet.setYPosition(250.0);
				bottom_magnet.setYPosition(325.0);
				middle_magnet.setXPosition(400.0);
				bottom_magnet.setXPosition(400.0);

			}

			if(left_scorecount== 6 || right_scorecount == 6)
			{
				top_text.setText("FINISHED!");
				game_loop = false;
			}
			if (ballmove_x < 0.0)
			{
				ballmove_x = ballmove_x + 0.01;
			}
			if (ballmove_x > 0.0){
				ballmove_x = ballmove_x - 0.01;
			}
			if(ballmove_y < 0.0){
				ballmove_y = ballmove_y + 0.01;
			}
			if (ballmove_y > 0.0){
				ballmove_y = ballmove_y - 0.01;
			}
			if (top_x < 0.0)
			{
				top_x = top_x + 0.01;
			}
			if (top_x > 0.0){
				top_x = top_x - 0.01;
			}
			if(top_y < 0.0){
				top_y = top_y + 0.01;
			}
			if (top_y > 0.0){
				top_y = top_y - 0.01;
			}
			if (middle_x < 0.0)
			{
				middle_x = middle_x + 0.01;
			}
			if (middle_x > 0.0){
				middle_x = middle_x - 0.01;
			}
			if(middle_y < 0.0){
				middle_y = middle_y + 0.01;
			}
			if (middle_y > 0.0){
				middle_y = middle_y - 0.01;
			}
			if (bottom_x < 0.0)
			{
				bottom_x = bottom_x + 0.01;
			}
			if (bottom_x > 0.0){
				bottom_x = bottom_x - 0.01;
			}
			if(bottom_y < 0.0){
				bottom_y = bottom_y + 0.01;
			}
			if (bottom_y > 0.0){
				bottom_y = bottom_y - 0.01;
			}
			left_stopcheck3 = true;
			right_stopcheck3 = true;
			left_stopcheck1 = true;
			right_stopcheck1 = true;
			left_stopcheck2 = true;
			right_stopcheck2 = true;
			left_stopcheck4 = true;
			right_stopcheck4 = true;

			game1.pause();	
		}
		if(game1.enterPressed()){
			game_loop = true;
			left_scorecount = 0;
			right_scorecount = 0;
		}
		}

	}


}