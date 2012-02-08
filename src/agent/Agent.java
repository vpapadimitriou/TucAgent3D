package agent;

//import java.util.Vector;
//import connection.GetMessageAsVector;
import connection.Connection;
//import perceptor.Ball;
import perceptor.Perceptors;
//import worldState.ServerTime;
//import worldState.ServerTime;
//import behavior.Behavior;
import perceptor.ForceResistancePerceptor;



public class Agent {





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Perceptors Gp = new Perceptors();
		
		String host = "127.0.0.1";
		int port = 3100;

		//initializes the connection
		Connection con = new Connection(host,port);
		//GetMessageAsVector GmAv= new GetMessageAsVector(null);
		boolean isConnected = false;
		
		boolean playerIsInit=false;

		//establish the connection between agent and server
		isConnected = con.establishConnection();

		//Creation of Nao robot
		if(isConnected==true){
			con.sendMessage("(scene rsg/agent/nao/nao.rsg)");
		}

		while(con.isConnected()){

			//get every message and update all perceptors
			Gp.GetPerceptors(con);
			

			//initialiaze the player number and the teamname
			if (playerIsInit==false){
				con.sendMessage("(init(unum 1)(teamname TucAgents3D))");
				playerIsInit=true;
			}
			
			if(ForceResistancePerceptor.getName() != null){
				System.out.println(""+ForceResistancePerceptor.force.x);
			}
			
			
			




		}

	}
	
	
	
}