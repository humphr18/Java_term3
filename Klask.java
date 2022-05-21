public class Klask{
	// Generate the game arena
	private GameArena game1 = new GameArena(800,500);
	// Line borders for the Klask game
	private Line left_line = new Line(100.0,100.0,100.0,400.0,15.0,"GREY",4);
	private Line bottom_line = new Line(100.0,400.0,700.0,400.0,15.0,"GREY",4);
	private Line right_line = new Line(700.0,400.0,700.0,100.0,15.0,"GREY",4);
	private Line top_line = new Line(700.0,100.0,100.0,100.0,15.0,"GREY",4);
	// Main game ball
	private Ball the_ball = new Ball(350.0,250.0,10,"YELLOW",3);
	// Generating the pucks left puck --v
	private Ball left_puckball = new Ball(550.0,250.0,20,"BLACK",2);
	private Line left_puckline = new Line(550.0,250.0,550.0,230.0,10,"BLACK",2);
	// Right puck --v
	private Ball right_puckball = new Ball(250.0,250.0,20,"BLACK",2);
	private Line right_puckline = new Line(250.0,250.0,250.0,230.0,10,"BLACK",2);
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
	// Creating the scores
	private Text left_score = new Text("0",30,50.0,250.0,"WHITE",6);
	private Text right_score = new Text("0",30,750.0,250.0,"WHITE",6);
	// Creating the top text
	private Text top_text = new Text("Welcome to Flask!!",20,100.0,50.0,"WHITE",6);

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
*/


	public Klask(){
		// Adding the UI instance variables to the gameboard
		game1.addBall(the_ball);
		game1.addLine(left_line);
		game1.addLine(bottom_line);
		game1.addLine(right_line);
		game1.addLine(top_line);
		game1.addBall(left_puckball);
		game1.addLine(left_puckline);
		game1.addBall(right_puckball);
		game1.addLine(right_puckline);
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
		// end of the UI additions -----------------------
	}
}