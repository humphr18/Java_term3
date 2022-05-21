public class Klask{
	private GameArena game1 = new GameArena(800,500);
	private Line left_line = new Line(100.0,100.0,100.0,400.0,15.0,"GREY",4);
	private Line bottom_line = new Line(100.0,400.0,700.0,400.0,15.0,"GREY",4);
	private Line right_line = new Line(700.0,400.0,700.0,100.0,15.0,"GREY",4);
	private Line top_line = new Line(700.0,100.0,100.0,100.0,15.0,"GREY",4);
	private Ball the_ball = new Ball(350.0,250.0,10,"YELLOW",3);
	private Ball left_puckball = new Ball(550.0,250.0,20,"BLACK",2);
	private Line left_puckline = new Line(550.0,250.0,550.0,230.0,10,"BLACK",2);
	private Rectangle background = new Rectangle(100.0,100.0,600.0,300.0,"BLUE",1);
	private Ball right_puckball = new Ball(250.0,250.0,20,"BLACK",2);
	private Line right_puckline = new Line(250.0,250.0,250.0,230.0,10,"BLACK",2);
	private Ball topleft_ball = new Ball(100.0,100.0,100,"GREY",2);
	private Ball bottomleft_ball = new Ball(100.0,400.0,100,"GREY",2);
	private Ball topright_ball = new Ball(700.0,100.0,100,"GREY",2);
	private Ball bottomright_ball = new Ball(700.0,400.0,100,"GREY",2);
	private Ball topleft_gap = new Ball(100.0,100.0,90,"BLUE",3);
	private Ball bottomleft_gap = new Ball(100.0,400.0,90,"BLUE",3);
	private Ball topright_gap = new Ball(700.0,100.0,90,"BLUE",3);
	private Ball bottomright_gap = new Ball(700.0,400.0,90,"BLUE",3);
	private Line border1 = new Line(0.0,0.0,0.0,500.0,190,"BLACK",5);
	private Line border2 = new Line(0.0,500.0,800.0,500.0,190,"BLACK",5);
	private Line border3 = new Line(800.0,500.0,800.0,0.0,190,"BLACK",5);
	private Line border4 = new Line(800.0,0.0,0.0,0.0,190,"BLACK",5);
	private Ball left_goal = new Ball(150.0,250.0,50,"GREY",2);
	private Ball right_goal = new Ball(650.0,250.0,50,"GREY",2);
	private Line middle_line = new Line(400.0,0.0,400.0,500.0,0.5,"BLACK",2);
	private Ball top_ball = new Ball(400.0,175.0,10,"WHITE",3);
	private Ball middle_ball = new Ball(400.0,250.0,10,"WHITE",3);
	private Ball bottom_ball = new Ball(400.0,325.0,10,"WHITE",3);


	public Klask(){
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
		game1.addBall(top_ball);
		game1.addBall(middle_ball);
		game1.addBall(bottom_ball);

	}
}