public class Klask{
	// Generate the game arena
	private GameArena game1 = new GameArena(800,500);
	// Line borders for the Klask game
	private Line left_line = new Line(100.0,100.0,100.0,400.0,15.0,"GREY",4);
	private Line bottom_line = new Line(100.0,400.0,700.0,400.0,15.0,"GREY",4);
	private Line right_line = new Line(700.0,400.0,700.0,100.0,15.0,"GREY",4);
	private Line top_line = new Line(700.0,100.0,100.0,100.0,15.0,"GREY",4);
	// Main game ball
	private Ball the_ball = new Ball(350.0,250.0,10,"YELLOW",6);
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
	private double ballmove_x = 2;
	private double ballmove_y = 2;
	// The outer suction for the white magnets
	private Ball left_outer = new Ball(250.0,250.0,150,"BLUE",0);
	private Ball right_outer = new Ball(550.0,250.0,150,"BLUE",0);

	//the right puck coordinates
	private double right_x;
	private double right_y;

	//the left puck coordinates
	private double left_x;
	private double left_y;

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

			if(the_ball.collides(left_puckball) || the_ball.collides(right_puckball))
			{
				//if((ballmove_x > ballmove_y && ballmove_y > 0) || (ballmove_x > ballmove_y && ballmove_y>0) || (ballmove_x < ballmove_y && ballmove_x < 0) || (ballmove_x > ballmove_y && ballmove_x < 0 && ballmove_y < 0))
				//{
				//	ballmove_x = ballmove_x - (ballmove_x *2);
				//}
				//if((ballmove_y > ballmove_x && ballmove_x > 0) || (ballmove_y > ballmove_x && ballmove_x>0) || (ballmove_y < ballmove_x && ballmove_y < 0) || (ballmove_y > ballmove_x && ballmove_y < 0 && ballmove_x < 0))
				//{
				//	ballmove_y = ballmove_y - (ballmove_y *2);
				//}
				ballmove_y = ballmove_y - (ballmove_y *2);
				ballmove_x = ballmove_x - (ballmove_x *2);

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
			}
			if(right_puckball.collides(right_goal))
			{
				left_scorecount = left_scorecount + 1;
				leftscore_string = Integer.toString(left_scorecount);
				left_score.setText(leftscore_string);
			}
/*			if(right_outer.collides(top_magnet) && top_connect == false){
				right_x = right_puckball.getXPosition();
				right_y = right_puckball.getYPosition();
				puckx = top_magnet.getXPosition();
				pucky = top_magnet.getYPosition();
				if( puckx > right_x){
					puckx = puckx - right_x;
					puckx = puckx - (puckx * 2 );
				}
				if( pucky > right_y)
				{
					pucky = pucky - right_y;
					pucky = pucky - (pucky * 0.2);
				}
				if(pucky < right_y && puckx < right_x)
				{
					pucky = pucky - right_y;
					puckx = puckx - right_x;
				}
				top_magnet.move((puckx * 0.005),(pucky * 0.005));

			}
			if(right_puckball.collides(top_magnet)){
				top_connect = true;
			}*/




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
			if(game1.letterPressed('i') == true)
			{
				the_ball.move(0.0,-2.0);
			}
			if(game1.letterPressed('j') == true)
			{
				the_ball.move(-2.0,0.0);
			}
			if(game1.letterPressed('l') == true)
			{
				the_ball.move(2.0,0.0);
			}
			if(game1.letterPressed('k') == true)
			{
				the_ball.move(0.0,2.0);
			}
			if (the_ball.collides(left_goal) == true )
			{
				left_scorecount = left_scorecount + 1;
				leftscore_string = Integer.toString(left_scorecount);
				left_score.setText(leftscore_string);
				the_ball.setXPosition(450.0);
				the_ball.setYPosition(250.0);
			}
			if (the_ball.collides(right_goal) == true)
			{
				right_scorecount = right_scorecount + 1;
				rightscore_string = Integer.toString(right_scorecount);
				right_score.setText(rightscore_string);
				the_ball.setXPosition(350.0);
				the_ball.setYPosition(250.0);

			}

			if(left_scorecount== 6 || right_scorecount == 6)
			{
				top_text.setText("FINISHED!");
				game_loop = false;
			}
			if (ballmove_x < 0.0)
			{
				ballmove_x = ballmove_x + 0.007;
			}
			if (ballmove_x > 0.0){
				ballmove_x = ballmove_x - 0.007;
			}
			if(ballmove_y < 0.0){
				ballmove_y = ballmove_y + 0.007;
			}
			if (ballmove_y > 0.0){
				ballmove_y = ballmove_y - 0.007;
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
	}


}